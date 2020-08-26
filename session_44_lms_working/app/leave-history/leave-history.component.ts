import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Leave } from '../leave';
import { Http } from '@angular/http';
import { LeaveService } from '../leave.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-leave-history',
  templateUrl: './leave-history.component.html',
  styleUrls: ['./leave-history.component.css']
})
export class LeaveHistoryComponent implements OnInit {

  leaveHistory : Observable<Leave[]>;

  empId : number;
  constructor(private _router : Router, private leaveService : LeaveService) {
    this.empId = parseInt(localStorage.getItem("empId"));
    this.leaveHistory = this.leaveService.leaveHistory(this.empId);
   }

   applyLeave() {
    this._router.navigate(['/applyLeave']);
   }

  ngOnInit() {
  }

}
