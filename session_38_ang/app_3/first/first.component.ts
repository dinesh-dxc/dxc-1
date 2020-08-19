import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  name : string;
  city : string;
  constructor(private _router : Router) {
    this.name="Rajshree";
    this.city="Bangalore";
   }

   third() {
    this._router.navigate(['/Third',this.name,this.city]);
   }

  ngOnInit() {
  }

}
