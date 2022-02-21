import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LocationsDetailsComponent } from './locations-details.component';

const routes: Routes = [{ path: '', component: LocationsDetailsComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LocationsDetailsRoutingModule { }
