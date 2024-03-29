import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ProductListComponent} from './product-list/product-list.component';
import {ProductCreateComponent} from './product-create/product-create.component';
import {ProductUpdateComponent} from './product-update/product-update.component';


const routes: Routes = [
  {path: '', component: ProductListComponent},
  {path: 'create', component: ProductCreateComponent},
  {path: 'edit/:id', component: ProductUpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
