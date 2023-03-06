import { Component, OnInit } from '@angular/core';
import {Customer} from "../../model/customer";

@Component({
  selector: 'app-customer-app',
  templateUrl: './customer-app.component.html',
  styleUrls: ['./customer-app.component.css']
})
export class CustomerAppComponent implements OnInit {
  customers : Customer [] = [
    {
    id:1,
    name: 'Mot',
    birthday: '01/01/2000',
    gender: false,
    idCard: '123123123',
    phone: 123123,
    email: 'mot@gmail.com',
    address: 'mot mot',
      type: 'Diamond'
  },
    {
      id:2,
      name: 'Hai',
      birthday: '01/01/2000',
      gender: true,
      idCard: '123123123',
      phone: 123123,
      email: 'mot@gmail.com',
      address: 'mot mot'
    },
    {
      id:3,
      name: 'Ba',
      birthday: '01/01/2000',
      gender: true,
      idCard: '123123123',
      phone: 123123,
      email: 'mot@gmail.com',
      address: 'mot mot'
    },
    {
      id:4,
      name: 'Bon',
      birthday: '01/01/2000',
      gender: true,
      idCard: '123123123',
      phone: 123123,
      email: 'mot@gmail.com',
      address: 'mot mot'
    },
    {
      id:5,
      name: 'Nam',
      birthday: '01/01/2000',
      gender: true,
      idCard: '123123123',
      phone: 123123,
      email: 'mot@gmail.com',
      address: 'mot mot'
    },
  ]
  deleteCustomer = {
  id:0,
  name: '',
  birthday: '',
  gender: true,
  idCard: '',
  phone: 0,
  email: '',
  address: ''
};


  constructor() { }

  ngOnInit(): void {
  }
  doCreateCustomer(customer:any){
    customer.gender = customer.gender === "true"
    this.customers.push(customer)
  }
  changeDeleteId(customer){
    this.deleteCustomer = customer;
  }

  doDelete(deleteCustomer: Customer) {
    this.removeCustomer(this.customers,deleteCustomer)
    console.log(this.customers)
  }
  removeCustomer(arr : Array<Customer> , customer : Customer) {
    for (let i = 0; i < arr.length; i++) {
      console.log(arr[i].id)
      console.log(customer.id)
      if (arr[i].id === customer.id) {
        arr.splice(i, 1)
        break;
      }
    }
  }
}
