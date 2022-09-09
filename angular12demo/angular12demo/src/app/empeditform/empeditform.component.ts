import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Employee } from '../model/employee';


@Component({
  selector: 'app-empeditform',
  templateUrl: './empeditform.component.html',
  styleUrls: ['./empeditform.component.css']
})
export class EmpeditformComponent implements OnInit {

  @Input()
  employee:Employee|null;

  @Output()
  empupdate:EventEmitter<Employee | null> = new EventEmitter();
  title = "Edit Employee"
  constructor() {
    this.employee = null;
   }

  ngOnInit(): void {
  }

  editEmployee(eform:any)
  {
    this.empupdate.emit(eform.value);
    eform.reset();
  }
  cancelEdit()
  {
    this.empupdate.emit(null);
  }
}