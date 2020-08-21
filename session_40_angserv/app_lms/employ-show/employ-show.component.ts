import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employ-show',
  templateUrl: './employ-show.component.html',
  styleUrls: ['./employ-show.component.css']
})
export class EmployShowComponent implements OnInit {

  employs : Observable<Employee[]>;

  constructor(private _employService : EmployeeService) {
    this.employs = this._employService.showEmploy();
   }

  ngOnInit() {
  }

}
