import {Component, OnInit} from '@angular/core';
import {Contact} from "../../model/contact";
import {ContactService} from "../../service/contact/contact.service";
import {ToastrService} from "ngx-toastr";
import {Router} from "@angular/router";

@Component({
  selector: 'app-contact-app',
  templateUrl: './contact-app.component.html',
  styleUrls: ['./contact-app.component.css']
})
export class ContactAppComponent implements OnInit {
  contacts: Contact [] = []
  deleteContactId = 0;

  constructor(private contactService: ContactService, private toast: ToastrService, private route: Router) {
  }

  ngOnInit(): void {
    this.getAll()
  }

  getAll() {
    this.contactService.getAll().subscribe(next => {
      this.contacts = next;
    })
  }

  changeDeleteId(id: number) {
    this.deleteContactId = id
  }

  doDelete(deleteContactId: number) {
    this.contactService.deleteContact(deleteContactId).subscribe(next => {
      this.toast.success("Delete contact thành công")
      this.route.navigateByUrl('contact/list')
      this.getAll()
    })
  }
}
