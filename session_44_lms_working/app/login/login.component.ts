import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  empId : number;
  constructor(private _router : Router) { 
    this.empId=parseInt(localStorage.getItem("empId"));
  }

  ngOnInit() {
  }

  login()
   {
    this._router.navigate(['/dashboard']);
   }
}
