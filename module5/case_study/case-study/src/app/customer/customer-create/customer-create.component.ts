import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Customer} from "../../model/customer";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../service/customerService/customer.service";
import {ToastrService} from "ngx-toastr";
import {Router} from "@angular/router";
import {TypeCustomerService} from "../../service/typeCustomer/type-customer.service";
import {TypeCustomer} from "../../model/TypeCustomer";

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  // @Output() customerSubmit = new EventEmitter();
  customer?: Customer
  typeCustomer: TypeCustomer[]

  customerForm: FormGroup = new FormGroup({
    id: new FormControl('', [Validators.required, Validators.pattern(/^KH-\d{4}$/)]),
    name: new FormControl('', [Validators.required, Validators.minLength(1), Validators.maxLength(255)]),
    birthday: new FormControl('', [Validators.required]),
    idCard: new FormControl('', [Validators.required, Validators.minLength(9)]),
    gender: new FormControl(),
    // Validators.pattern(/^[[0][9][0|1][\d]{7}]$/,)]
    phone: new FormControl('', [Validators.required]),
    email: new FormControl('', [Validators.required]),
    address: new FormControl('', [Validators.required]),
    type: new FormControl('', [Validators.required])
  });

  constructor(private customerService: CustomerService, private toast: ToastrService, private route: Router
              , private typeCustomerService: TypeCustomerService) {
  }

  // createCustomerWithReactive() {
  //   this.customerSubmit.emit(this.customerForm.value);
  //   console.log(this.customerForm.value)
  // }

  ngOnInit(): void {
    this.getAllTypeCustomer()
  }
  getAllTypeCustomer(){
    this.typeCustomerService.getAll().subscribe( next =>{
      this.typeCustomer = next
    })
  }

  addCustomer() {
    this.customerService.addCustomer(this.customerForm.value).subscribe(next => {
      this.customerForm.reset()
      this.toast.success("Thêm Mới thành công")
      this.route.navigateByUrl('/customer/list')
    })
  }

}
