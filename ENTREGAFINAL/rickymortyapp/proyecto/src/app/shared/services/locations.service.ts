import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class LocationsService {
  baseUrlApi = 'https://rickandmortyapi.com/api/location';

  constructor(private servicehttp: HttpClient) {}

  getAllLocations(): Observable<any> {
    return this.servicehttp.get(this.baseUrlApi);
  }
}
