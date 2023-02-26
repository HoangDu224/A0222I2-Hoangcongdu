import {Component, OnInit} from '@angular/core';
import {Facility} from "../../model/facility";

@Component({
  selector: 'app-service-app',
  templateUrl: './service-app.component.html',
  styleUrls: ['./service-app.component.css']
})
export class ServiceAppComponent implements OnInit {
  services: Facility[] = [
    {
      id: 1,
      name: 'OCEAN SUITE',
      area: '85m2',
      price: 1000,
      maxPeople: 5,
      type: 'Month',
      img: '../assets/img/serviceImg.jpg'
    },
    {
      id: 2,
      name: 'OCEAN STUDIO',
      area: '85m2',
      price: 1000,
      maxPeople: 5,
      type: 'Month',
      img: '../assets/img/serviceImg.jpg'
    },
    {
      id: 3,
      name: 'OCEAN DELUXE',
      area: '85m2',
      price: 1000,
      maxPeople: 5,
      type: 'Month',
      img: '../assets/img/serviceImg.jpg'
    },
    {
      id: 4,
      name: 'LAGOON SUPERIOR',
      area: '85m2',
      price: 1000,
      maxPeople: 5,
      type: 'Month',
      img: '../assets/img/serviceImg.jpg'
    },
    {
      id: 5,
      name: 'GARDEN DELUXE',
      area: '85m2',
      price: 1000,
      maxPeople: 5,
      type: 'Month',
      img: '../assets/img/serviceImg.jpg'
    },
    {
      id: 6,
      name: 'GARDEN DELUXE',
      area: '85m2',
      price: 1000,
      maxPeople: 5,
      type: 'Month',
      img: '../assets/img/serviceImg.jpg'
    },
    {
      id: 7,
      name: 'GARDEN DELUXE',
      area: '85m2',
      price: 1000,
      maxPeople: 5,
      type: 'Month',
      img: '../assets/img/serviceImg.jpg'
    },
    {
      id:8,
      name: 'GARDEN DELUXE',
      area: '85m2',
      price: 1000,
      maxPeople: 5,
      type: 'Month',
      img: '../assets/img/serviceImg.jpg'
    },

  ]

  constructor() {
  }

  ngOnInit(): void {
  }

}
