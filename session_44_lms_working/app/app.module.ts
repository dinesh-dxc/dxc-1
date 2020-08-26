import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { EmployComponent } from './employ/employ.component';
import { EmployService } from './employ.service';
import { HttpModule } from '@angular/http';
import { LoginComponent } from './login/login.component';
import { RouterModule } from '@angular/router';
import {FormsModule} from '@angular/forms';
import { MyDetailsComponent } from './my-details/my-details.component';
import { MyManagerComponent } from './my-manager/my-manager.component';
import { DashBoardComponent } from './dash-board/dash-board.component';
import { LeaveDetailsComponent } from './leave-details/leave-details.component';
import { LeaveHistoryComponent } from './leave-history/leave-history.component';
import { ApplyLeaveComponent } from './apply-leave/apply-leave.component';
import { PendingComponent } from './pending/pending.component';
import { ApproveDenyComponent } from './approve-deny/approve-deny.component';


@NgModule({
  declarations: [
    AppComponent,
    EmployComponent,
    LoginComponent,
    MyDetailsComponent,
    MyManagerComponent,
    DashBoardComponent,
    LeaveDetailsComponent,
    LeaveHistoryComponent,
    ApplyLeaveComponent,
    PendingComponent,
    ApproveDenyComponent
  ],
  imports: [
    BrowserModule,HttpModule,FormsModule,
    RouterModule.forRoot([
      { path: 'login', component:LoginComponent },
      { path: 'applyLeave', component:ApplyLeaveComponent },
      { path: 'dashboard', component:DashBoardComponent },
     { path: 'approvedeny', component:ApproveDenyComponent },
     // { path :'ShowLeaveDetails',component:ShowLeaveDetailComponent },
     // {path :'applyleave',component:ApplyLeaveComponent},
      {path: '',component:EmployComponent}

    ])

  ],
  providers: [EmployService],
  bootstrap: [AppComponent]
})
export class AppModule { }
