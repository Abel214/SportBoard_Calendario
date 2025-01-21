import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../../enviroments/enviroments';


@Injectable({
  providedIn: 'root'
})
export class MiServicio {
  private baseUrl = environment.baseUrl;

  constructor(private http: HttpClient) {}

  obtenerDatos(endpoint: string): Observable<any> {
    return this.http.get(`${this.baseUrl}/${endpoint}`);
  }

  enviarDatos(endpoint: string, payload: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/${endpoint}`, payload);
  }
}
