import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './core/home/home.component';
import { CharactersComponent } from './core/characters/characters.component';
import { LocationsComponent } from './core/locations/locations.component';
import { EpisodesComponent } from './core/episodes/episodes.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CharactersComponent,
    LocationsComponent,
    EpisodesComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  exports: [
    CharactersComponent,
    LocationsComponent,
    
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
