import { Component, OnInit } from '@angular/core';
import { LeaveService } from '../leave.service';
import { Observable } from 'rxjs';
import { Leave } from '../leave';

@Component({
  selector: 'app-leave-details',
  templateUrl: './leave-details.component.html',
  styleUrls: ['./leave-details.component.css']
})
export class LeaveDetailsComponent implements OnInit {

  leves : Observable<Leave[]>;
  constructor(private _service : LeaveService) {
    this.leves=this._service.showLeaves();
   }

  ngOnInit() {
  }

}
