import { Component, OnInit } from '@angular/core';
import { EmployService } from '../employ.service';
import { Observable } from 'rxjs';
import { Employ } from '../employ';

@Component({
  selector: 'app-my-manager',
  templateUrl: './my-manager.component.html',
  styleUrls: ['./my-manager.component.css']
})
export class MyManagerComponent implements OnInit {

  employee: Observable<Employ>;
  empId:number;
  title="My Details Section";
  constructor(private _serv : EmployService) { 
    this.empId=parseInt(localStorage.getItem("mgrId"));
    this.employee=this._serv.searchEmploy(this.empId); 
  }

  ngOnInit() {
    
  }

}
