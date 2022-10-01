import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LazyLoadingRoutingModule } from './lazy-loading-routing.module';
import { EmpformComponent } from '../empform/empform.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [EmpformComponent],
  imports: [
    CommonModule,
    LazyLoadingRoutingModule,
    FormsModule
  ]
})
export class LazyLoadingModule { }
