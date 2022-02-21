import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path:'',
    redirectTo:'home',
    pathMatch:'full',
    
  },
  
  { path: 'home', loadChildren: () => import('./components/pages/home/home.module').then(m => m.HomeModule) }, { path: 'character-list', loadChildren: () => import('./components/pages/characters/character-list/character-list.module').then(m => m.CharacterListModule) }, { path: 'character-details/:id', loadChildren: () => import('./components/pages/characters/character-details/character-details.module').then(m => m.CharacterDetailsModule) }, { path: 'episode-list', loadChildren: () => import('./components/pages/episodes/episode-list/episode-list.module').then(m => m.EpisodeListModule) }, { path: 'episode-details/:id', loadChildren: () => import('./components/pages/episodes/episode-details/episode-details.module').then(m => m.EpisodeDetailsModule) }, { path: 'location-list', loadChildren: () => import('./components/pages/locations/location-list/location-list.module').then(m => m.LocationListModule) }, { path: 'location-details/:id', loadChildren: () => import('./components/pages/locations/location-details/location-details.module').then(m => m.LocationDetailsModule) }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
