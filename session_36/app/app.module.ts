import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule , Routes } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { FourthComponent } from './fourth/fourth.component';
import { CalcComponent } from './calc/calc.component';
import { NameComponent } from './name/name.component';
import { EmployComponent } from './employ/employ.component';
import { CountryComponent } from './country/country.component';
import { LoginComponent } from './login/login.component';
import { MenuComponent } from './menu/menu.component';

const routes: Routes = [
  
  { path: 'first', component: FirstComponent },
  { path: 'second', component: SecondComponent },
  { path : 'third', component:ThirdComponent},
  { path : 'fourth', component:FourthComponent},
  { path : 'calc', component:CalcComponent},
  { path : 'employ', component:EmployComponent},
  { path : 'country', component:CountryComponent},
  // { path: '', component: LoginComponent },
  // {path:'menu', component:MenuComponent}
] 
@NgModule({ 
  declarations: [  
    AppComponent,
    FirstComponent,
    SecondComponent,
    ThirdComponent,
    FourthComponent,
    CalcComponent,
    NameComponent,
    EmployComponent,
    CountryComponent,
    LoginComponent,
    MenuComponent
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
