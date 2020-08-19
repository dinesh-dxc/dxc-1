import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  company : string;
  constructor() { 
    this.company="Dxc";
    localStorage.setItem("company",this.company);
  }

  ngOnInit() {
  }

}
