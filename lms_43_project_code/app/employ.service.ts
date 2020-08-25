import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';
import { Employ } from './employ';

@Injectable({
  providedIn: 'root'
})
export class EmployService {

  constructor(private http: Http) {
  }

  getEmploys(): Observable<Employ[]> {
    return this.http.get
    ("http://localhost:8080/LeaveManagementNew/webapi/employees/")
       .map((res: Response) => res.json());
  }

  searchEmploy(empId):Observable<Employ> {
    console.log('getEmployees called on employee.service'+empId);
    return this.http.get('http://localhost:8080/LeaveManagementNew/webapi/employees/'+empId)
    .map(response => response.json() as Employ)
  }

}
