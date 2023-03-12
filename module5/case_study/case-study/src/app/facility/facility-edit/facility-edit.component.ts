import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {FacilityService} from "../../service/facility/facility.service";
import {Facility} from "../../model/facility";
import {FormControl, FormGroup} from "@angular/forms";
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-facility-edit',
  templateUrl: './facility-edit.component.html',
  styleUrls: ['./facility-edit.component.css']
})
export class FacilityEditComponent implements OnInit {
  facility: Facility;
  facilityForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    area: new FormControl(),
    price: new FormControl(),
    maxPeople: new FormControl(),
    type: new FormControl(),
    img: new FormControl(),
  })

  constructor(private toast: ToastrService,private activatedRoute: ActivatedRoute,private facilityService: FacilityService
              ,private route: Router) {
    this.activatedRoute.paramMap.subscribe( next =>{
      const id = next.get('id')
      this.facilityService.getFacilityById(id).subscribe( next =>{
          this.facility = next;
      })
    })
  }

  ngOnInit(): void {
  }

  editFacility(){
    const facility = this.facilityForm.value
    this.facilityService.editFacility(facility.id, facility).subscribe( next =>{
      this.toast.success('Edit thành công','Message')
      this.facilityForm.reset();
      this.route.navigateByUrl('');
    })
  }
}
