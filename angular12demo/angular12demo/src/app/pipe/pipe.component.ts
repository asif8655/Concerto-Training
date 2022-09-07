import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe',
  templateUrl: './pipe.component.html',
  styleUrls: ['./pipe.component.css']
})
export class PipeComponent implements OnInit {

  
  constructor() { }
  a:number =2;
  bdate=new Date();
  ngOnInit(): void {
  }

}
