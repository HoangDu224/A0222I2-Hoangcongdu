import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Contact} from "../../model/contact";
import {Facility} from "../../model/facility";

@Injectable({
  providedIn: 'root'
})
export class ContactService {

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Contact[]>{
    return this.httpClient.get<Contact[]>('http://localhost:3000/contact/')
  }
  addContact(contact: Contact): Observable<any>{
    return this.httpClient.post('http://localhost:3000/contact/',contact);
  }
  editContact(id: any, contact: any): Observable<any>{
    return this.httpClient.put('http://localhost:3000/contact/'+id,contact)
  }
  deleteContact(id:any): Observable<any>{
    return this.httpClient.delete('http://localhost:3000/contact/'+id)
  }
  getContactById(id:any): Observable<Contact>{
    return this.httpClient.get<Contact>('http://localhost:3000/contact/'+id)
  }
}
