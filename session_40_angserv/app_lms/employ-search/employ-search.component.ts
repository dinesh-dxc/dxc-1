import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employ-search',
  templateUrl: './employ-search.component.html',
  styleUrls: ['./employ-search.component.css']
})
export class EmploySearchComponent implements OnInit {

  empno : number;
  employ : Observable<Employee>;

  constructor(private _employService : EmployeeService) {
    // this.employ = this._employService.searchEmploy(this.empno);
   }
   search() {
    this.employ = this._employService.searchEmploy(this.empno);
   }

  ngOnInit() {
  }

}
