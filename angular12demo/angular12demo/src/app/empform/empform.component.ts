import { Component,EventEmitter, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../model/employee';
import { EmphttpService } from '../service/emphttp.service';

@Component({
  selector: 'app-empform',
  templateUrl: './empform.component.html',
  styleUrls: ['./empform.component.css']
})
export class EmpformComponent implements OnInit {

  @Output()
  empadded:EventEmitter<Employee> = new EventEmitter
  title:string;
  constructor(private empservice:EmphttpService,private router:Router) {
    this.title='';
   }

  ngOnInit(): void {
    this.title="Add Employee"
  }
  saveEmployee(emp:Employee)
  {
    // console.log(emp)
    // this.empadded.emit(emp)
    this.empservice.addEmployee(emp).subscribe(data=>{console.log(data);this.router.navigate(['/list'])});
    
  }
}
