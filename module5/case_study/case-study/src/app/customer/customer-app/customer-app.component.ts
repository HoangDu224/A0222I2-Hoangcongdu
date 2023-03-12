import {Component, OnInit} from '@angular/core';
import {Customer} from "../../model/customer";
import {CustomerService} from "../../service/customerService/customer.service";
import {FacilityService} from "../../service/facility/facility.service";
import {Router} from "@angular/router";
import {ToastrService} from "ngx-toastr";

@Component({
  selector: 'app-customer-app',
  templateUrl: './customer-app.component.html',
  styleUrls: ['./customer-app.component.css']
})
export class CustomerAppComponent implements OnInit {
  customers: Customer [] = []
  deleteCustomerId = 0;


  constructor(private customerService: CustomerService, private router: Router, private toast: ToastrService) {
    this.customerService.getAll().subscribe(next => {
      this.customers = next;
    })
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.customerService.getAll().subscribe(next => {
      this.customers = next;
    })
  }

  changeDeleteId(customer) {
    this.deleteCustomerId = customer;
  }

  doDelete(deleteCustomerId: number) {
    this.customerService.deleteCustomer(deleteCustomerId).subscribe(next => {
      this.toast.success('Delete Customer thành công');
      this.getAll();
    })
  }

}
