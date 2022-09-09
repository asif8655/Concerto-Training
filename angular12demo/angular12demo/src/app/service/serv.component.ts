import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { DemoService } from './demo.service';


@Component({
  selector: 'app-serv',
  templateUrl: './serv.component.html',
  styleUrls: ['./serv.component.css']
})
export class ServComponent implements OnInit {

  title:string;

  constructor(public service:DemoService) { 
    this.title=service.message
  }
  
  changeTitle(){
    this.service.setMessage(this.title);
  }
  ngOnInit(): void {
  }
  
}
