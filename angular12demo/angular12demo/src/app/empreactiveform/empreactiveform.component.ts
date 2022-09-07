import { Component, OnInit } from '@angular/core';
import { FormControl, FormControlName, FormGroup, Validators } from '@angular/forms';
import { hasExclamationMark } from '../data/password';

@Component({
  selector: 'app-empreactiveform',
  templateUrl: './empreactiveform.component.html',
  styleUrls: ['./empreactiveform.component.css']
})
export class EmpreactiveformComponent implements OnInit {

  subsemail:FormControl;
  empform:FormGroup;
  email:FormControl;
  address:FormGroup;
  city:FormControl;
  password:FormControl;
  constructor() {
    this.subsemail = new FormControl('',Validators.required);
    this.email=new FormControl('',Validators.required);
    this.city=new FormControl('',Validators.required);
    this.password=new FormControl('',hasExclamationMark)
    this.address=new FormGroup({city:this.city})
    this.empform = new FormGroup({
      ename:new FormControl('',[Validators.required,Validators.minLength(5)]),
      email:this.email,password:this.password,
      address:this.address})
    
    
   }

  ngOnInit(): void {
  }
  subscribe(){
    console.log(this.subsemail.value);
  }

}
