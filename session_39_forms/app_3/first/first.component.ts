import { Component, OnInit } from '@angular/core';
import { DemoService } from '../demo.service';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  constructor(private _service : DemoService) { }

  hello() {
    alert(this._service.sayHello());
  }

  greet() {
    alert(this._service.greeting());
  }
  ngOnInit() {
  }

}
