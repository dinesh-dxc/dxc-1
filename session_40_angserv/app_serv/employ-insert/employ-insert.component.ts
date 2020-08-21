import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';
import { EmployService } from '../employ.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-employ-insert',
  templateUrl: './employ-insert.component.html',
  styleUrls: ['./employ-insert.component.css']
})
export class EmployInsertComponent implements OnInit {

  constructor(private _employService : EmployService) { }

  result : string;
  employ = new Employ();

  addEmploy() {
    this._employService.addEmploy(this.employ).subscribe(
      res => {this.result = res}
    )
  }

  ngOnInit() {
  }

}
