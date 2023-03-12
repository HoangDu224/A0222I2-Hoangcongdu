import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { CustomerAppComponent } from './customer/customer-app/customer-app.component';
import { CustomerCreateComponent } from './customer/customer-create/customer-create.component';
import { CustomerEditComponent } from './customer/customer-edit/customer-edit.component';
import { ContactAppComponent } from './contact/contact-app/contact-app.component';
import { ContactCreateComponent } from './contact/contact-create/contact-create.component';
import {ReactiveFormsModule} from "@angular/forms";
import { FacilityListComponent } from './facility/facility-list/facility-list.component';
import { FacilityCreateComponent } from './facility/facility-create/facility-create.component';
import { FacilityEditComponent } from './facility/facility-edit/facility-edit.component';
import {HttpClientModule} from "@angular/common/http";

import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {ToastrModule} from "ngx-toastr";

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    CustomerAppComponent,
    CustomerCreateComponent,
    CustomerEditComponent,
    ContactAppComponent,
    ContactCreateComponent,
    FacilityListComponent,
    FacilityCreateComponent,
    FacilityEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
