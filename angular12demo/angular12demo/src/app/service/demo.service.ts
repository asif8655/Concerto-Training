import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DemoService {

  message:string;
  constructor( public httpservice:HttpClient) { 
    this.message='from service';
    console.log('demo Serivce')
  }
  getAllTodos(){
    console.log('getAllTodos from services')
    return this.httpservice.get('http://localhost:3000/empolyees')
  }
  setMessage(msg:string){
    this.message=msg;
  }
  
}
