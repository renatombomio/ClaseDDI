import { LocationsComponent } from './core/locations/locations.component';
import { EpisodesComponent } from './core/episodes/episodes.component';
import { CharactersComponent } from './core/characters/characters.component';
import { HomeComponent } from './core/home/home.component';
import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [

  {path:'home', component: HomeComponent},
  {path:'characters', component: CharactersComponent},
  {path:'episodes', component: EpisodesComponent},
  {path:'locations', component: LocationsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
