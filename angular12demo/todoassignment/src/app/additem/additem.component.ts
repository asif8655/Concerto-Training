import { Component, HostListener, OnInit } from '@angular/core';

@Component({
  selector: 'app-additem',
  templateUrl: './additem.component.html',
  styleUrls: ['./additem.component.css']
})
export class AdditemComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  @HostListener('document:keypress', ['$event'])
  addToDo(event: KeyboardEvent) {
    if (event.code === "Enter") {
      //Code that you need to run
      console.log()
    }
  }
}
