import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-table',
  templateUrl: './employ-table.component.html',
  styleUrls: ['./employ-table.component.css']
})
export class EmployTableComponent implements OnInit {

  sname : string;
  show(name) {
    this.sname=name;
  }
  employs = [
    new Employ(1,'Sparsh','Java','Programmer',53334),
    new Employ(2,'Amrit','Angular','Programmer',94455),
    new Employ(3,'Manas','Java','Programmer',90334),
    new Employ(4,'Priyanka','Angular','Programmer',89044),
    new Employ(5,'Nivetha','Java','Programmer',67755),
    new Employ(6,'Naina','Java','Programmer',90455),
  ]
  constructor() { }

  ngOnInit() {
  }

}
