import { Injectable } from '@angular/core';
import {Facility} from "../../model/facility";
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class FacilityService {
  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Facility[]>{
    return this.httpClient.get<Facility[]>('http://localhost:3000/facilitys/');
  }
  addFacility(facility: Facility): Observable<any>{
    return this.httpClient.post('http://localhost:3000/facilitys/',facility);
  }
  editFacility(id: any, facility: any): Observable<any>{
    return this.httpClient.put('http://localhost:3000/facilitys/'+id,facility)
  }
  deleteFacility(id:any): Observable<any>{
    return this.httpClient.delete('http://localhost:3000/facilitys/'+id)
  }
  getFacilityById(id:any): Observable<Facility>{
    return this.httpClient.get<Facility>('http://localhost:3000/facilitys/'+id)
  }
}
