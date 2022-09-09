import { HtmlParser } from '@angular/compiler';
import { Component, ViewEncapsulation } from '@angular/core';
import { emp } from './data/data';
import { DemoService } from './service/demo.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  encapsulation:ViewEncapsulation.None
})
export class AppComponent {

  constructor(public service:DemoService){
    console.log(`App Constructor`)
  }
  
  title = 'angular12demo';
  isInValid:boolean=true;
  message:string ='some message.'
  bod = new Date();
  red = 'red'
  display(){
    return "Some text";
  };
  clicked(){
    alert('iwas clicked')
  }

  newEmpAdded(newemp:any){
    console.log(newemp);
    this.employee=newemp;
    console.log(this.employee)
    
  }
  employee:any;
  getTodos(){
    console.log('getAllTodos')
    this.service.getAllTodos().subscribe(data=>{console.log(data)});
  }
  getTodoById(id:any){
 
  }
  postTodo(){
 
  }
  deleteTodo(){
 
  }
  updateTodo(){
 
  }

}
