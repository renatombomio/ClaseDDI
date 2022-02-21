import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EpisodeDetailsRoutingModule } from './episode-details-routing.module';
import { EpisodeDetailsComponent } from './episode-details.component';


@NgModule({
  declarations: [
    EpisodeDetailsComponent
  ],
  imports: [
    CommonModule,
    EpisodeDetailsRoutingModule
  ]
})
export class EpisodeDetailsModule { }
