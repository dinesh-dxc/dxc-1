import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';
import { Leave } from './leave';

@Injectable({
  providedIn: 'root'
})
export class LeaveService {

  showLeaves(): Observable<Leave[]> {
    return this.http.get
    ("http://localhost:8080/LeaveManagementProject/webapi/leave/")
       .map((res: Response) => res.json());
  }

  applyLeave(leave : Leave) : Observable<string>{
    return this.http.post("http://localhost:8080/LeaveManagementProject/webapi/leave/applyLeave/",leave)
    .map((res: Response) => res.text());
  }

  leaveHistory(empId : number): Observable<Leave[]> {
    return this.http.get
    ("http://localhost:8080/LeaveManagementProject/webapi/leave/leaveHistory/" +empId)
       .map((res: Response) => res.json());
  }


  searchByLeaveId(leaveId):Observable<Leave> {
    console.log('getEmployees called on employee.service'+leaveId);
    return this.http.get('http://localhost:8080/LeaveManagementProject/webapi/leave/'+leaveId)
    .map(response => response.json() as Leave)
  }

  pendingLeaves(mgrId : number) : Observable<Leave[]> {
    return this.http.get
    ("http://localhost:8080/LeaveManagementProject/webapi/leave/pending/" +mgrId)
       .map((res: Response) => res.json());
  }

  constructor(private http : Http) { }
}
