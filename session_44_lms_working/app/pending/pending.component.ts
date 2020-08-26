import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Leave } from '../leave';
import { Employ } from '../employ';
import { LeaveService } from '../leave.service';
import { EmployService } from '../employ.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pending',
  templateUrl: './pending.component.html',
  styleUrls: ['./pending.component.css']
})
export class PendingComponent implements OnInit {

  leavedetails : Observable<Leave[]>; 
  empData : Observable<Employ[]>;
  mgrId : number;
  showButton : boolean;
  constructor(private router : Router, private _empService : EmployService, private _leaveService : LeaveService) {
    this.mgrId = parseInt(localStorage.getItem("empId"));
    this.empData = this._empService.getEmploys();
    this.leavedetails = this._leaveService.pendingLeaves(this.mgrId);
    this.showButton=false;
   }
   doApproveDeny() {
    this.router.navigate(['/approvedeny']);
   }
   setClickRowDup(leaveId, empId) {
     this.showButton=true;
    // alert(leaveId);
    // alert(empId);
    localStorage.setItem("leaveId",leaveId);
    localStorage.setItem("lempId",empId);
   }
  ngOnInit() {
  }

}
