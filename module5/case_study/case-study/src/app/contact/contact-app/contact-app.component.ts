import { Component, OnInit } from '@angular/core';
import {Contact} from "../../model/contact";

@Component({
  selector: 'app-contact-app',
  templateUrl: './contact-app.component.html',
  styleUrls: ['./contact-app.component.css']
})
export class ContactAppComponent implements OnInit {
  contacts : Contact [] = []

  constructor() { }

  ngOnInit(): void {
  }

}
