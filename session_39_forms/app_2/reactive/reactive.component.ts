import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive',
  templateUrl: './reactive.component.html',
  styleUrls: ['./reactive.component.css']
})
export class ReactiveComponent implements OnInit {

  isValidFormSubmitted :boolean = null;
  userForm =  new FormGroup({
  uname: new FormControl('',Validators.required),
  gender: new FormControl('', Validators.required),
  married: new FormControl(false),
  tc: new FormControl('',Validators.required)
});
  constructor() { }

  onFormSubmit() {
    this.isValidFormSubmitted = false;
    if(this.userForm.invalid){
      return;
    }
    this.isValidFormSubmitted = true ;
  
  }

  ngOnInit() {
  }

}
