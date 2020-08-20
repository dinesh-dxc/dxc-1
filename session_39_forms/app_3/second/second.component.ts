import { Component, OnInit } from '@angular/core';
import { DemoService } from '../demo.service';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {

  constructor(private _service : DemoService) { }

  greeting() {
    let res : string;
    res = this._service.greeting();
    alert(res);
    console.log("Greeting " +res);
  }
  show() {
    let res : string;
    res = this._service.sayHello();
    alert(res);
    console.log("Result is : " +res);
  }
  ngOnInit() {
  }

}
