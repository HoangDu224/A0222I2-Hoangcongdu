import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { ServiceAppComponent } from './service/service-app/service-app.component';
import { ServiceEditComponent } from './service/service-edit/service-edit.component';
import { CustomerAppComponent } from './customer/customer-app/customer-app.component';
import { CustomerCreateComponent } from './customer/customer-create/customer-create.component';
import { ServiceCreateComponent } from './service/service-create/service-create.component';
import { CustomerEditComponent } from './customer/customer-edit/customer-edit.component';
import { ContactAppComponent } from './contact/contact-app/contact-app.component';
import { ContactCreateComponent } from './contact/contact-create/contact-create.component';
import {ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    ServiceAppComponent,
    ServiceEditComponent,
    CustomerAppComponent,
    CustomerCreateComponent,
    ServiceCreateComponent,
    CustomerEditComponent,
    ContactAppComponent,
    ContactCreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
