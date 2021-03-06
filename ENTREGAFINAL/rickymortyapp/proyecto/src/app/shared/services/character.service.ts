import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})

export class CharacterService {
  baseUrl = 'https://rickandmortyapi.com/api/character';

  constructor(private servicehttp: HttpClient) {}

  getAllCharacters(): Observable<any> {
    return this.servicehttp.get(this.baseUrl);
  }
}
