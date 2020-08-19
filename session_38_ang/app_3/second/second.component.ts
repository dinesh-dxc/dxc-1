import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {

  name : string;
  city : string;
  constructor(private route : ActivatedRoute) {
    this.name=this.route.snapshot.params["name"];
    this.city=this.route.snapshot.params["city"];
   }

  ngOnInit() {
  }

}
