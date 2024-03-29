import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Customer} from "../../model/customer";
import {Facility} from "../../model/facility";
import {CustomerService} from "../../service/customerService/customer.service";
import {FacilityService} from "../../service/facility/facility.service";
import {ContactService} from "../../service/contact/contact.service";
import {ToastrService} from "ngx-toastr";
import {Router} from "@angular/router";

@Component({
  selector: 'app-contact-create',
  templateUrl: './contact-create.component.html',
  styleUrls: ['./contact-create.component.css']
})
export class ContactCreateComponent implements OnInit {
  customers: Customer[];
  facilitys: Facility[];
  contactForm: FormGroup = new FormGroup({
    id: new FormControl('', [Validators.required, Validators.min(1)]),
    customer: new FormControl('', [Validators.required]),
    service: new FormControl('', [Validators.required]),
    startDate: new FormControl('', [Validators.required]),
    endDate: new FormControl('', [Validators.required]),
    money: new FormControl('', [Validators.required]),
  });

  constructor(private customerService: CustomerService, private facilityService: FacilityService
              , private contactService: ContactService, private toast: ToastrService , private router: Router) {

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

  addContact() {
      const contact = this.contactForm.value;
      this.contactService.addContact(contact).subscribe( next =>{
        this.toast.success("Tạo contact thành công")
        this.router.navigateByUrl('/contact/list')
      })
  }
}
