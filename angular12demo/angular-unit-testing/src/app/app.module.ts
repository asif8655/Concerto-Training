import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { LoginInputOutputComponent } from './login-input-output/login-input-output.component';
import { ModelformComponent } from './modelform/modelform.component';
import { PowerPipe } from './pipes/power.pipe';
import { HoverfocusDirective } from './directive/hoverfocus.directive';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    LoginInputOutputComponent,
    ModelformComponent,
    PowerPipe,
    HoverfocusDirective
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }