import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {

  topic : string;
  session : number;
  greet : string;
  constructor() {
    this.topic="Angular Databinding...";
    this.session=37;
    this.greet="Good Morning to all...";
   }

  ngOnInit() {
  }

}
