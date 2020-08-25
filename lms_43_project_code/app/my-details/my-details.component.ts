import { Component, OnInit } from '@angular/core';
import { EmployService } from '../employ.service';
import { Observable } from 'rxjs';
import { Employ } from '../employ';


@Component({
  selector: 'app-my-details',
  templateUrl: './my-details.component.html',
  styleUrls: ['./my-details.component.css']
})
export class MyDetailsComponent implements OnInit {

  employee: Observable<Employ>;
  empId:number;
  title="My Details Section";
  constructor(private _serv : EmployService) { 
    this.empId=parseInt(localStorage.getItem("empId"));
    this.employee=this._serv.searchEmploy(this.empId); 
  }



  ngOnInit() {
  }

}
