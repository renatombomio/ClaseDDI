import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class EpisodesService {
  baseUrlApi = 'https://rickandmortyapi.com/api/episode';

  constructor(private servicehttp: HttpClient) {}

  getAllEpisodes(): Observable<any> {
    return this.servicehttp.get(this.baseUrlApi);
  }
}
