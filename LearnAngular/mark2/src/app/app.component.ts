import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'mark2';
  someVal = "";
  doSomething(){
    alert("hello how are you?");
  }
}
