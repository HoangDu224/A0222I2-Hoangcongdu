import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {TypeCustomer} from "../../model/TypeCustomer";

@Injectable({
  providedIn: 'root'
})
export class TypeCustomerService {

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<TypeCustomer[]> {
    return this.httpClient.get<TypeCustomer[]>('http://localhost:3000/typeCustomer/')
  }
}
