import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
import { Employ } from './employ';

@Injectable({
  providedIn: 'root'
})
export class EmployService {

  addEmploy(employ : Employ) : Observable<string> {
    return this._http.post("http://localhost:8080/RestHelloWorld/webapi/employ/employInsert",employ).
    map((res : Response) => res.text());
  }
  searchEmploy(empno : number) : Observable<Employ>{
    return this._http.get("http://localhost:8080/RestHelloWorld/webapi/employ/searchemploy/" +empno).
    map((res:Response)=>res.json())
  }
  getEmploys() : Observable<Employ[]> {
    return this._http.get("http://localhost:8080/RestHelloWorld/webapi/employ/").
    map((res:Response)=>res.json())
  }
  constructor(private _http : Http) { }
}
