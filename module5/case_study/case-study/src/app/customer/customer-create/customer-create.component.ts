import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Customer} from "../../model/customer";
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  @Output() customerSubmit = new EventEmitter();
  customer?: Customer

  customerForm : FormGroup;

  constructor() {
    this.customerForm = new FormGroup({
      id: new FormControl('', [Validators.required, Validators.pattern(/^KH-\d{4}$/)]),
      name: new FormControl('', [Validators.required, Validators.minLength(1), Validators.maxLength(255)]),
      birthday: new FormControl('', [Validators.required]),
      idCard: new FormControl('', [Validators.required, Validators.minLength(9)]),
      gender: new FormControl(),
      phone: new FormControl('', [Validators.required, Validators.pattern(/[[0][9][0|1][\d]{7}]$/,)]),
      email: new FormControl('', [Validators.required]),
      address: new FormControl('', [Validators.required]),
      type : new FormControl()
    }, );
  }
  createCustomerWithReactive() {
    this.customerSubmit.emit(this.customerForm.value);
    console.log(this.customerForm.value)
  }

  ngOnInit(): void {
  }

}
