import { Component, OnInit } from '@angular/core';
import { List } from '../model/data';

@Component({
  selector: 'app-displayitem',
  templateUrl: './displayitem.component.html',
  styleUrls: ['./displayitem.component.css']
})
export class DisplayitemComponent implements OnInit {

  list:List
  constructor() {
    this.list={Iname:""}
   }

  ngOnInit(): void {
  }

}
