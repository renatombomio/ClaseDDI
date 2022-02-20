import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  
  {
  path:'',
  redirectTo:'home',
  pathMatch: 'full'
  },

  { path: 'home', loadChildren: () => import('./components/pages/home/home.module').then(m => m.HomeModule) }, { path: 'personajes-list', loadChildren: () => import('./components/pages/personajes/personajes-list/personajes-list.module').then(m => m.PersonajesListModule) }, { path: 'personajes-detail/:id', loadChildren: () => import('./components/pages/personajes/personajes-detail/personajes-detail.module').then(m => m.PersonajesDetailModule) }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
