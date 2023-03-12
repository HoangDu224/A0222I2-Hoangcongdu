import { Component, OnInit } from '@angular/core';
import {Facility} from "../../model/facility";
import {FormControl, FormGroup} from "@angular/forms";
import {ToastrService} from "ngx-toastr";
import {ActivatedRoute, Router} from "@angular/router";
import {FacilityService} from "../../service/facility/facility.service";

@Component({
  selector: 'app-facility-create',
  templateUrl: './facility-create.component.html',
  styleUrls: ['./facility-create.component.css']
})
export class FacilityCreateComponent implements OnInit {
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
    ,private route: Router) { }

  ngOnInit(): void {
  }

  createFacility() {
    console.log(this.facilityForm.value)
    this.facilityService.addFacility(this.facilityForm.value).subscribe( next =>{
      this.toast.success("Thêm mới thành công");
      this.facilityForm.reset();
      this.route.navigateByUrl('');
    })
  }
}
