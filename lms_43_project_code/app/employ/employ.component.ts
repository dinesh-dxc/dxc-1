import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';
import { EmployService } from '../employ.service';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';


@Component({
  selector: 'app-employ',
  templateUrl: './employ.component.html',
  styleUrls: ['./employ.component.css']
})
export class EmployComponent implements OnInit {

  emps : Observable<Employ[]>;
 
  constructor(private employService: EmployService, private _router: Router) {
     this.emps = employService.getEmploys();
  }

  login(empId,empMgrId) {
    localStorage.setItem("empId",empId); 
    localStorage.setItem("mgrId",empMgrId);
    this._router.navigate(['/login']);

  }
  ngOnInit() {
  }

}
