import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule} from '@angular/http';
import { FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { EmployComponent } from './employ/employ.component';
import { EmploySearchComponent } from './employ-search/employ-search.component';
import { EmployInsertComponent } from './employ-insert/employ-insert.component';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    EmployComponent,
    EmploySearchComponent,
    EmployInsertComponent
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
