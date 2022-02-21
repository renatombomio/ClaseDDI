import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EpisodesDetailsRoutingModule } from './episodes-details-routing.module';
import { EpisodesDetailsComponent } from './episodes-details.component';


@NgModule({
  declarations: [
    EpisodesDetailsComponent
  ],
  imports: [
    CommonModule,
    EpisodesDetailsRoutingModule
  ]
})
export class EpisodesDetailsModule { }
