import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Leave } from '../leave';
import { LeaveService } from '../leave.service';

@Component({
  selector: 'app-apply-leave',
  templateUrl: './apply-leave.component.html',
  styleUrls: ['./apply-leave.component.css']
})
export class ApplyLeaveComponent implements OnInit {

  leave = new Leave();
  res: string;
  constructor(private _leaveService : LeaveService) {
    this.leave.empId=parseInt(localStorage.getItem("empId"));
    alert(this.leave.empId);
   }
  isValidFormSubmitted : boolean;

  calculateDays() {   
         let date1: string=this.leave.leaveStartDate.toString();  
         let date2: string=this.leave.leaveEndDate.toString();   
        let diffInMs: number = Date.parse(date2) - Date.parse(date1);    
        let diffInHours: number = diffInMs / 1000 / 60 / 60/24;    
          this.leave.leaveNoOfDays=diffInHours + 1;   
   }            // alert(diffInHours);        //console.log(diffInHours);
            //alert("Event Fired");    }
  applyLeave(form: NgForm)
  {  
    alert("Hi");
     this.isValidFormSubmitted=false;  
     if(form.invalid) {  
     alert("invalid...");
       return;       
    }

    alert(this.leave.leaveStartDate);  
    this._leaveService.applyLeave(this.leave).subscribe(x => {
      this.res = x;
      alert(this.res);
    })
    this.isValidFormSubmitted = true;
  }
  ngOnInit() {
  }

}
