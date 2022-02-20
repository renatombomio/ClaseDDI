import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PersonajesDetailComponent } from './personajes-detail.component';

const routes: Routes = [{ path: '', component: PersonajesDetailComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PersonajesDetailRoutingModule { }
