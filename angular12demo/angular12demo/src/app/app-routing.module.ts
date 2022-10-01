import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmpformComponent } from './empform/empform.component';
import { EmployeeComponent } from './employee/employee.component';
import { LoginComponent } from './login/login.component';
import { MainComponent } from './main/main.component';
import { ProfileComponent } from './profile/profile.component';
import { ProfileinfoComponent } from './profileinfo/profileinfo.component';
import { AuthService } from './service/auth.service';

const routes: Routes = [
  {path:'', redirectTo:'login', pathMatch:'full'},
  {path:'login',component:LoginComponent},
  // {path:'list',component:MainComponent},
  // {path:'list/:id',component:ProfileComponent},
  // {path:'register',component:EmpformComponent},
  {path:'register',loadChildren:()=> import('./lazy-loading/lazy-loading.module')
  .then(m=>m.LazyLoadingModule)},
  {path:'employee',component:MainComponent,canActivate:[AuthService]},
  {path:'employee/:id',component:ProfileComponent,children:[{path:'info',component:ProfileinfoComponent}]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
