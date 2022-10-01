import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

import { Todo } from '../todoInterface/todo';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {

  @Input() todo:Todo;
  checked:boolean= false;
  constructor() {
    this.todo = {
      atodo:""
    }
   }

  ngOnInit(): void {
  }

  @Output()
  todocheckbox:EventEmitter<Todo>=new EventEmitter();
  checkbox(){
    console.log("checked")
    this.checked = true;
    console.log(this.checked)
    this.todo.atodo
    this.todocheckbox.emit(this.todo)
  }

}