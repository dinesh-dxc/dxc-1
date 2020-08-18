import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ',
  templateUrl: './employ.component.html',
  styleUrls: ['./employ.component.css']
})
export class EmployComponent implements OnInit {

  employs = [
    new Employ(1, 'Naren','Angular','Manager',88233 ),
    new Employ(2, 'Hemanth','React','Developer',84233 ), 
    new Employ(3, 'Shankar','Node','TeamLead',87733 ),
    new Employ(4, 'Madhura','UI','Sr.Programmer',84513 ),
    new Employ(5, 'Harshitha','Java','Expert',87433 )
  ];

  constructor() { }

  ngOnInit() {
  }

}
