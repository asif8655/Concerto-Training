import { Component, EventEmitter, OnInit, Output } from '@angular/core';

import { TodohttpService } from '../service/todohttp.service';
import { Todo } from '../todoInterface/todo';

@Component({
  selector: 'app-add-item',
  templateUrl: './add-item.component.html',
  styleUrls: ['./add-item.component.css']
})
export class AddItemComponent implements OnInit {

  constructor(private todoservice: TodohttpService) { }
  

  ngOnInit(): void {
  }

  @Output()
  todoAdded:EventEmitter<Todo> = new EventEmitter();

  addToDo(todo:Todo){
    this.todoAdded.emit(todo)
    console.log("hello")
    console.log(todo)
    this.todoservice.addTodo(todo).subscribe();
  }
}
