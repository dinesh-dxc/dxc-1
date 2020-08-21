import { Component, OnInit } from '@angular/core';
import { EmployService } from '../employ.service';
import { Observable } from 'rxjs';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-search',
  templateUrl: './employ-search.component.html',
  styleUrls: ['./employ-search.component.css']
})
export class EmploySearchComponent implements OnInit {

  empno : number;
  employ : Observable<Employ>;
  constructor(private _employService : EmployService) { }

  show() {
    this.employ = this._employService.searchEmploy(this.empno);
  }
  ngOnInit() {
  }

}
