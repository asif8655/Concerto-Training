import { Component, OnInit } from '@angular/core';
import { observable, Observable } from 'rxjs';

@Component({
  selector: 'app-observable',
  templateUrl: './observable.component.html',
  styleUrls: ['./observable.component.css']
})
export class ObservableComponent implements OnInit {

  data:Observable<string> | null;
  fruits: Array<string> = [];
  anyErrors: boolean = false;
  finished: boolean = false;
  start(){
    this.data = new Observable (observer =>{
      setTimeout(()=>{observer.next('Apple');},1000);
      setTimeout(()=>{observer.next('mango');},2000);
      setTimeout(()=>{observer.next('orange');},3000);
      setTimeout(()=>{observer.next('banana');},4000);
      setTimeout(()=>{observer.next('strawbarry');},5000);
      setTimeout(()=>{observer.next('custardapple');},6000);
      setTimeout(()=>{observer.next('watermelon');},8000);
      setTimeout(()=>{observer.next('melon');},9000);
      setTimeout(()=>{observer.next('pineapple');},10000);
      //setTimeout(()=>{observer.error('something went wrong');},4000);
      setTimeout(()=>{observer.complete();},11000);
    })
    let sub = this.data.subscribe(fruit=>{console.log(fruit);this.fruits.push(fruit)}, ()=> this.anyErrors= true, ()=>this.finished=true)

    setTimeout(()=>sub.unsubscribe(),5000)
  }
  constructor() { 
    this.data = null;
  }

  ngOnInit(): void {
  }

}
