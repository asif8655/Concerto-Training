import { Component, OnDestroy, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit,OnDestroy {

  enabled:boolean=true;
  pcountry:string='india';
  emp={"name":"Asif"};
  constructor() { 
    console.log(`parent constructor`)
  }
  ngOnDestroy(): void {
    console.log('Destroy')
  }

  ngOnInit(): void {
    console.log(`parent ng oninit`)
  }

}
