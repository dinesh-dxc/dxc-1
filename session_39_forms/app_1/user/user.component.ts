import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import  {NgForm } from '@angular/forms';


@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  isValidFormSubmitted=false;
 user =new User();

 onFormSubmit(form:NgForm) {
   this.isValidFormSubmitted=false;
   if(form.invalid){
     return;
   }
   this.isValidFormSubmitted=true;
 }
  constructor() { }

  ngOnInit() {
  }

}
