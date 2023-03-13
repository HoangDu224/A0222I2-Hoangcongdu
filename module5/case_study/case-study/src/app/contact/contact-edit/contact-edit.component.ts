import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../../service/customerService/customer.service";
import {FacilityService} from "../../service/facility/facility.service";
import {ContactService} from "../../service/contact/contact.service";
import {ToastrService} from "ngx-toastr";
import {ActivatedRoute, Router} from "@angular/router";
import {Customer} from "../../model/customer";
import {Facility} from "../../model/facility";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Contact} from "../../model/contact";

@Component({
  selector: 'app-contact-edit',
  templateUrl: './contact-edit.component.html',
  styleUrls: ['./contact-edit.component.css']
})
export class ContactEditComponent implements OnInit {
  customers: Customer[];
  facilitys: Facility[];
  contact: Contact;
  contactForm: FormGroup = new FormGroup({
    id: new FormControl('', [Validators.required, Validators.min(1)]),
    customer: new FormControl('', [Validators.required]),
    service: new FormControl('', [Validators.required]),
    startDate: new FormControl('', [Validators.required]),
    endDate: new FormControl('', [Validators.required]),
    money: new FormControl('', [Validators.required]),
  });

  constructor(private customerService: CustomerService, private facilityService: FacilityService
    , private contactService: ContactService, private toast: ToastrService , private router: Router
              , private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe( next =>{
      const id = next.get('id')
      this.contactService.getContactById(id).subscribe( next => {
        this.contact = next;
      })
    })
  }

  ngOnInit(): void {
    this.getCustomer();
    this.getFacility();
  }
  getCustomer() {
    this.customerService.getAll().subscribe(next => {
      this.customers = next;
    })
  }

  getFacility() {
    this.facilityService.getAll().subscribe(next => {
      this.facilitys = next;
    })
  }
  editContact(){
    const contact = this.contactForm.value;
    this.contactService.editContact(contact.id,contact).subscribe( next =>{
      this.toast.success("Edit contact thành công")
      this.router.navigateByUrl('/contact/list')
    })
  }

}
