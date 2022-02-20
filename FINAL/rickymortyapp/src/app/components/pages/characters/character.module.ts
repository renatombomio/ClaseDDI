import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule} from "@angular/router";
import { CharacterDetailComponent } from '@app/components/pages/characters/character-detail/character-detail.component';
import { CharacterListComponent } from '@app/components/pages/characters/character-list/character-list.component';


const myComponents= [ CharacterDetailComponent, CharacterListComponent];

@NgModule({
  declarations: [ ...myComponents],
  imports: [
    CommonModule,
    RouterModule
  ],
  exports: [ ...myComponents]
})
export class CharactersModule { }
