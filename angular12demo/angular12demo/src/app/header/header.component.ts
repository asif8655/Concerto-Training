import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(public us:UserService,private router:Router) {

   }

  ngOnInit(): void {
  }
  logoutuser(){
    this.us.logout();
    this.router.navigate(['/'])

  }
}
