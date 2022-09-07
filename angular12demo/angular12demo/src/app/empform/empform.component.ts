import { Component,EventEmitter, OnInit, Output } from '@angular/core';
import { Employee } from '../model/employee';

@Component({
  selector: 'app-empform',
  templateUrl: './empform.component.html',
  styleUrls: ['./empform.component.css']
})
export class EmpformComponent implements OnInit {

  employee:Employee;
  constructor() {
    this.employee={eid:1,ename:'',email:'',phone:'',address:{country:''}}
   }

  ngOnInit(): void {
  }
  @Output()
  empadded:EventEmitter<Employee> = new EventEmitter
  saveEmployee(emp:Employee)
  {
    console.log(emp)
    this.empadded.emit(emp)
    
  }
}
