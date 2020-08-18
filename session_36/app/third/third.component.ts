import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-third',
  templateUrl: './third.component.html',
  styleUrls: ['./third.component.css']
})
export class ThirdComponent implements OnInit {

  constructor() { }

  shwetha() {
    alert("Hi I am Shwetha...");
  }

  harshitha() {
    alert("Hi i am Harshitha...");
  }
  naveen() {
    alert("Hi I am Naveen...");
  }
  ngOnInit() {
  }

}
