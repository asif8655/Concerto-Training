import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { MainComponent } from './main/main.component';
import { EmployeeComponent } from './employee/employee.component';
import { ParentComponent } from './lifecycle/parent.component';
import { ChildComponent } from './lifecycle/child.component';
import { DirectivesComponent } from './directives/directives.component';
import { HoverDirective } from './directives/hover.directive';
import { PowerPipe } from './pipe/power.pipe';
import { PipeComponent } from './pipe/pipe.component';
import { EmpformComponent } from './empform/empform.component';
import { EmpreactiveformComponent } from './empreactiveform/empreactiveform.component';
import { ServComponent } from './service/serv.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import {MatButtonModule} from '@angular/material/button';
import {MatCardModule} from '@angular/material/card';
import {MatInputModule} from '@angular/material/input';
import { LoginComponent } from './login/login.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ObservableComponent } from './observable/observable.component';
import { EmpeditformComponent } from './empeditform/empeditform.component';
import { ProfileComponent } from './profile/profile.component';
import { ProfileinfoComponent } from './profileinfo/profileinfo.component';
import { TokenService } from './service/token.service';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    MainComponent,
    EmployeeComponent,
    ParentComponent,
    ChildComponent,
    DirectivesComponent,
    HoverDirective,
    PowerPipe,
    PipeComponent,
    EmpformComponent,
    EmpreactiveformComponent,
    ServComponent,
    LoginComponent,
    ObservableComponent,
    EmpeditformComponent,
    ProfileComponent,
    ProfileinfoComponent,
    
  ],
  imports: [
    BrowserModule,ReactiveFormsModule,
    AppRoutingModule,FormsModule,
    HttpClientModule,MatCardModule,MatInputModule,MatButtonModule,BrowserAnimationsModule
  ],
  providers: [{
    provide:HTTP_INTERCEPTORS,
    useClass:TokenService,
    multi:true
  }],
  bootstrap: [AppComponent],
})
export class AppModule { }
