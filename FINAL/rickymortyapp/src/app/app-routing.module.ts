import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  
  {
  path:'',
  redirectTo:'home',
  pathMatch: 'full'
  },

  { path: 'home', loadChildren: () => import('./components/pages/home/home.module').then(m => m.HomeModule) }, { path: 'character-list', loadChildren: () => import('./components/pages/characters/character-list/character-list.module').then(m => m.CharacterListModule) }, { path: 'character-detail/:id', loadChildren: () => import('./components/pages/characters/character-detail/character-detail.module').then(m => m.CharacterDetailModule) },
  
  { path: 'episodes-list', loadChildren: () => import('./components/pages/episodes/episodes-list/episodes-list.module').then(m => m.EpisodesListModule) },
  
  { path: 'episodes-details', loadChildren: () => import('./components/pages/episodes/episodes-details/episodes-details.module').then(m => m.EpisodesDetailsModule) },
  
  { path: 'locations-list', loadChildren: () => import('./components/pages/episodes/locations-list/locations-list.module').then(m => m.LocationsListModule) },
  
  { path: 'locations-details', loadChildren: () => import('./components/pages/episodes/locations-details/locations-details.module').then(m => m.LocationsDetailsModule) },
  
  { path: 'locations-list', loadChildren: () => import('./components/pages/locations/locations-list/locations-list.module').then(m => m.LocationsListModule) },
  
  { path: 'locations-details', loadChildren: () => import('./components/pages/locations/locations-details/locations-details.module').then(m => m.LocationsDetailsModule) }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
