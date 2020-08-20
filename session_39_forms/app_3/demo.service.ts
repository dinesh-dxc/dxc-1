import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DemoService {

  constructor() { }

  sayHello() : string {
    return "Welcome to Services...";
  }

  greeting() : string {
    return "Good Morning...";
  }
}
