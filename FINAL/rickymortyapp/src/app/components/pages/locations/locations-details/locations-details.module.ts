import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LocationsDetailsRoutingModule } from './locations-details-routing.module';
import { LocationsDetailsComponent } from './locations-details.component';


@NgModule({
  declarations: [
    LocationsDetailsComponent
  ],
  imports: [
    CommonModule,
    LocationsDetailsRoutingModule
  ]
})
export class LocationsDetailsModule { }
