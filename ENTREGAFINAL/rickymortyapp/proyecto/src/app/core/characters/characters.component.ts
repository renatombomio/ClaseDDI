import { CharacterService } from './../../shared/services/character.service';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'proyecto-characters',
  templateUrl: './characters.component.html',
  styleUrls: ['./characters.component.css']
})
export class CharactersComponent implements OnInit {

characterList: any []= [];

  constructor(private characterService:CharacterService) { }

  ngOnInit(): void {

    this.characterService.getAllCharacters().subscribe((e)=>{this.characterList=e.results})
  }

}
