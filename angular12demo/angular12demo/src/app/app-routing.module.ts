import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmpformComponent } from './empform/empform.component';
import { EmployeeComponent } from './employee/employee.component';
import { LoginComponent } from './login/login.component';
import { MainComponent } from './main/main.component';
import { ProfileComponent } from './profile/profile.component';

const routes: Routes = [
  {path:'', redirectTo:'login', pathMatch:'full'},
  {path:'login',component:LoginComponent},
  // {path:'list',component:MainComponent},
  // {path:'list/:id',component:ProfileComponent},
  {path:'register',component:EmpformComponent},
  {path:'employee',component:MainComponent},
  {path:'employee/:id',component:ProfileComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
