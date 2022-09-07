import { Component, DoCheck, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';


@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit,OnChanges,DoCheck {

  @Input()
  country:string=''
  data:any[] =[
    {"country":"uk","states":["London"]},
    {"country":"india","states":["maharashtra", "UP","MP"]},
    {"country":"ireland","states":["ire1","ire2"]},
    {"country":"usa","states":["Illinois","SFO"]}
  ]
  @Input()
  employee={"name":""}
  countrystates:any[]=[]
  constructor() { 
    console.log(`child consturtor ${this.country}`)
  }
  ngDoCheck(): void {
    console.log(`child ng do check ${this.country}:${this.employee.name}`)
  }
  ngOnInit(): void {
    console.log(`child oninit ${this.country}`)
    
  }
  ngOnChanges(changes: SimpleChanges): void {
    console.log(`child Onchange ${this.country}`);
    this.countrystates=this.data.filter(item=>item.country===this.country)
  }
  

  

}
