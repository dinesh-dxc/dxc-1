import { Injectable } from '@angular/core';
import { Http,Response } from '@angular/http';
import { Observable } from 'rxjs';
import { Employee } from './employee';
import 'rxjs/add/operator/map';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  searchEmploy(empno : number) : Observable<Employee> {
    return this._http.get("http://localhost:8080/LeaveManagementProject/webapi/employee/searchemployee/" +empno).
    map((res:Response)=>res.json());
  }
  showEmploy() : Observable<Employee[]> {
    return this._http.get("http://localhost:8080/LeaveManagementProject/webapi/employee").
    map((res:Response)=>res.json());
  }
  constructor(private _http : Http) { }
}
