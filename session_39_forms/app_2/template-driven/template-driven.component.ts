import { Component, OnInit } from '@angular/core';
import  {NgForm } from '@angular/forms';
import { User } from '../user';
@Component({
  selector: 'app-template-driven',
  templateUrl: './template-driven.component.html',
  styleUrls: ['./template-driven.component.css']
})
export class TemplateDrivenComponent implements OnInit {

  isValidFormSubmitted=false;
  user = new User();
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
