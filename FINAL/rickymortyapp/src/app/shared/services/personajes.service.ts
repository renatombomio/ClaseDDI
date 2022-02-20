import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { environment } from '@environments/environment';
import { Personaje } from '@shared/interface/personaje.interface';

@Injectable({
  providedIn: 'root'
})
export class PersonajesService {

  constructor(private http: HttpClient) { }

  buscarPersonajes(query= '', page = 1){
    const filter = `${environment.baseUrlAPI}/?name=${query}& page=${page}`;
    return this.http.get<Personaje[]>(filter);

  }


  getDetails(id:number){
    return this.http.get<Personaje>(`${environment.baseUrlAPI}/${id}`);
  }
}
