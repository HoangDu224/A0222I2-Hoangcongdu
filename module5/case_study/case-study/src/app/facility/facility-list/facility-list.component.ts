import {Component, OnInit} from '@angular/core';
import {Facility} from "../../model/facility";
import {FacilityService} from "../../service/facility/facility.service";
import {ActivatedRoute, Router} from "@angular/router";
import {ToastrService} from "ngx-toastr";

@Component({
  selector: 'app-facility-list',
  templateUrl: './facility-list.component.html',
  styleUrls: ['./facility-list.component.css']
})
export class FacilityListComponent implements OnInit {
  facilitys: Facility[] = []
  deleteFacilityId = 0;


  constructor(private facilityService: FacilityService, private router: Router, private toast: ToastrService) {

  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.facilityService.getAll().subscribe(next => {
      this.facilitys = next;
    })
  }

  confirnDeleteFacility(id: number) {
    this.deleteFacilityId = id;
  }

  deleteFacility(id: number) {
    this.facilityService.deleteFacility(id).subscribe(next => {
      this.toast.success("Delete thành công")
      this.getAll();
    })
  }
}
