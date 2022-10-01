import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { List } from '../model/data';

@Component({
  selector: 'app-allitem',
  templateUrl: './allitem.component.html',
  styleUrls: ['./allitem.component.css']
})
export class AllitemComponent implements OnInit,OnChanges {

  public lists : List[]=[];
  list:List | null;
  constructor() { 
    this.list = null;
  }
  ngOnChanges(changes: SimpleChanges): void {
    if(this.newdata !== undefined)
    this.lists.push(this.newdata);
    console.log(this.lists)
  }

  ngOnInit(): void {
  }
  @Input()
  newdata:any={};
}
