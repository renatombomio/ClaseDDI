import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule} from "@angular/router";
import { PersonajesDetailComponent } from '@personajes/personajes-detail/personajes-detail.component';
import { PersonajesListComponent } from '@personajes/personajes-list/personajes-list.component';


const myComponents= [ PersonajesDetailComponent, PersonajesListComponent];

@NgModule({
  declarations: [
  ...myComponents ],
  imports: [
    CommonModule,
    RouterModule
  ],
  exports: [ ...myComponents]
})
export class PersonajesModule { }
