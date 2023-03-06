import {Component, OnInit} from '@angular/core';
import {FormGroup, Validators, AbstractControl, NgForm, FormControl} from '@angular/forms';
import {Customer} from './Customer';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  customer ?: Customer;
  customers: Customer[] = [{
    email: 'mot@gmail.com',
    password: '123132123',
    country: 'vietnam',
    age: '11',
    gender: true,
    phone: '123123'
  }];
  registerForm: FormGroup;

  constructor() {
    this.registerForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.minLength(2)]),
      password: new FormControl('', [Validators.required, Validators.minLength(8), Validators.maxLength(20)]),
      confirmPassword: new FormControl('', [Validators.required, Validators.minLength(8), Validators.maxLength(20)]),
      age: new FormControl('', [Validators.required, Validators.min(18)]),
      gender: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required, Validators.pattern(/^\+84\d{9,10}$/)]),
      country: new FormControl('', [Validators.required])
    }, [this.confirmPassword]);
  }

  ngOnInit(): void {
  }

  confirmPassword(form: any) {
    const pass = form.controls.password.value;
    if (pass === form.controls.confirmPassword.value) {
      return null;
    } else {
      return {'invalidPassword': true};
    }
  }

  createCustomerWithReactive() {
    this.customers.push(this.registerForm.value);
  }

}
