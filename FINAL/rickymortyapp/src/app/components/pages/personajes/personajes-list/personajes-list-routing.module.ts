import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PersonajesListComponent } from './personajes-list.component';

const routes: Routes = [{ path: '', component: PersonajesListComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PersonajesListRoutingModule { }
