import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import {  ActivatedRoute, Router } from '@angular/router';
import { emp } from '../data/data';
import { Employee } from '../model/employee';
import { EmphttpService } from '../service/emphttp.service';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit,OnChanges {

  nos:number[] = [1,2,3,4,5,6,7,8,9];

  public employees:Employee[] =[];
  isEdit:boolean = true;
  employee:Employee | null;
  constructor(private empservice:EmphttpService,private router:Router,private route:ActivatedRoute) { 
    this.employee=null;
    
  }
  ngOnChanges(changes: SimpleChanges): void {
    if(this.newdata !== undefined)
    this.employees.push(this.newdata);
    console.log(this.employees)
  }

  
  people: any[] = [
    {
    "name": "Douglas Pace",
    "age": 35,
    "country": 'MARS'
    },
    {
    "name": "Mcleod Mueller",
    "age": 32,
    "country": 'USA'
    },
    {
    "name": "Aguirre Ellis",
    "age": 34,
    "country": 'UK'
    },
    {
    "name": "Cook Tyson",
    "age": 32,
    "country": 'USA'
    }
    ];
    selid:number = 0;
  ngOnInit(): void {
    //this.route.params.subscribe(params => this.selid = params.id)
    this.route.queryParams.subscribe(params => this.selid = params.id)
    this.empservice.getAllEmployees().subscribe(data=>this.employees=data)

  }
  @Input()
  newdata:any={};
  delete(emp:Employee)
  {
    let objindx = this.employees.findIndex(employee=>employee.eid === emp.eid);
    this.employees.splice(objindx,1)
  }
  edit(emp:Employee)
  {
    this.isEdit = !this.isEdit
    this.employee = emp;
    console.log(this.employee)
  }
  view(id:number){
    console.log(id);
    this.router.navigate([id],{relativeTo:this.route})
  }
}
