import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Customer} from "../../model/customer";

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  @Output() customerSubmit = new EventEmitter();
  customer?: Customer

  constructor() {
  }

  ngOnInit(): void {
  }

  doCreateCustomer(id: string, name: string, birthday: string, gender: string, idCard: string, phone: string,
                   email: string, address: string) {
    let addGender = gender === 'Nam';
    let customer = {
      id: id,
      name: name,
      birthday: birthday,
      gender: addGender,
      idCard: idCard,
      phone: parseInt(phone),
      email: email,
      address: address
    }
    this.customerSubmit.emit(customer)
  }
}
