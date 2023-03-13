import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {CustomerAppComponent} from "./customer/customer-app/customer-app.component";
import {CustomerCreateComponent} from "./customer/customer-create/customer-create.component";
import {CustomerEditComponent} from "./customer/customer-edit/customer-edit.component";
import {FacilityListComponent} from "./facility/facility-list/facility-list.component";
import {FacilityEditComponent} from "./facility/facility-edit/facility-edit.component";
import {FacilityCreateComponent} from "./facility/facility-create/facility-create.component";
import {ContactAppComponent} from "./contact/contact-app/contact-app.component";
import {ContactCreateComponent} from "./contact/contact-create/contact-create.component";
import {ContactEditComponent} from "./contact/contact-edit/contact-edit.component";


const routes: Routes = [
  {path: '', component: FacilityListComponent},
  {path: 'facility/create', component: FacilityCreateComponent},
  {path: 'facility/edit/:id', component: FacilityEditComponent},
  {path: 'customer/list', component: CustomerAppComponent},
  {path: 'customer/create', component: CustomerCreateComponent},
  {path: 'customer/edit/:id', component: CustomerEditComponent},
  {path: 'contact/list', component: ContactAppComponent},
  {path: 'contact/create', component: ContactCreateComponent},
  {path: 'contact/edit/:id', component: ContactEditComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
