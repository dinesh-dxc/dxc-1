import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployShowComponent } from './employ-show/employ-show.component';
import { EmploySearchComponent } from './employ-search/employ-search.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployShowComponent,
    EmploySearchComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
