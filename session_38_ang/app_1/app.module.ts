import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule , Routes } from '@angular/router';
import { FormsModule } from '@angular/forms'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { LoginComponent } from './login/login.component';
import { MenuComponent } from './menu/menu.component';
import { EmployComponent } from './employ/employ.component';
import { EmployTableComponent } from './employ-table/employ-table.component';

const routes: Routes = [
  { path : 'menu', component:MenuComponent,
  children:[
             { path: 'first', component: FirstComponent },
             { path: 'second', component: SecondComponent },
             { path : 'third', component:ThirdComponent},
             { path : 'employ', component:EmployComponent},
             { path : 'employTable', component:EmployTableComponent},
           ] 
},
            { path : '', component:LoginComponent},
]
@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    ThirdComponent,
    LoginComponent,
    MenuComponent,
    EmployComponent,
    EmployTableComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(routes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
