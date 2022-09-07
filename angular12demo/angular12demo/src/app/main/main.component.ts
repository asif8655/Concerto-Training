import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { emp } from '../data/data';
import { Employee } from '../model/employee';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit,OnChanges {

  nos:number[] = [1,2,3,4,5,6,7,8,9];

  public employees:Employee[]

  constructor() { 
    this.employees = emp;
    
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

  ngOnInit(): void {
  }
  @Input()
  newdata:any={};
  
}
