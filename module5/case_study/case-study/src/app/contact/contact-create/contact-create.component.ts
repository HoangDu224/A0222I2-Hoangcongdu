import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Customer} from "../../model/customer";
import {Facility} from "../../model/facility";

@Component({
  selector: 'app-contact-create',
  templateUrl: './contact-create.component.html',
  styleUrls: ['./contact-create.component.css']
})
export class ContactCreateComponent implements OnInit {
  @Input() item : Customer[]
  // @Input() facility : Facility[]
  @Output() contactSubmit = new EventEmitter()
  contactForm : FormGroup;

  constructor() {
    this.contactForm = new FormGroup({
      id: new FormControl('', [Validators.required, Validators.min(1)]),
      customer: new FormControl('', [Validators.required]),
      service: new FormControl('', [Validators.required]),
      startDate: new FormControl('', [Validators.required]),
      endDate: new FormControl('', [Validators.required]),
      money: new FormControl('', [Validators.required]),
    }, );
  }

  ngOnInit(): void {
  }

}
