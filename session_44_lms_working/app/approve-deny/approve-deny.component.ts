import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';
import { Observable } from 'rxjs';
import { Leave } from '../leave';
import { EmployService } from '../employ.service';
import { LeaveService } from '../leave.service';

@Component({
  selector: 'app-approve-deny',
  templateUrl: './approve-deny.component.html',
  styleUrls: ['./approve-deny.component.css']
})
export class ApproveDenyComponent implements OnInit {

  leaveId : number;
  empId : number;
  empData : Observable<Employ>;
  leaveData : Observable<Leave>;
  mgrComment : string;
  constructor(private _empservice : EmployService,
              private _leaveService : LeaveService) { 
    this.leaveId = parseInt(localStorage.getItem("leaveId"));
    this.empId = parseInt(localStorage.getItem("lempId"));
    this.empData = this._empservice.searchEmploy(this.empId);
    this.leaveData = this._leaveService.searchByLeaveId(this.leaveId);
  }

  ngOnInit() {
  }

}
