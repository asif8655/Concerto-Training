import { isExpressionFactoryMetadata } from '@angular/compiler/src/render3/r3_factory';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { ModelformComponent } from './modelform.component';

describe('ModelformComponent', () => {
  let component: ModelformComponent;
  let fixture: ComponentFixture<ModelformComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModelformComponent ],
      imports : [ReactiveFormsModule,FormsModule]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ModelformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
    component.ngOnInit();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
  it('form invalid when empty',()=>{
    expect(component.form.valid).toBeFalsy();
  })
  it('email field validity',()=>{
    let errors = {};
    let email = component.form.controls['email'];
    expect(email.valid).toBeFalsy();

    expect(email.errors?.['required']).toBeTruthy();

    email.setValue("test");

    expect(email.errors?.['required']).toBeFalsy();
    expect(email.errors?.['pattern']).toBeTruthy();

    email.setValue("test@example.com");

    expect(email.errors?.['required']).toBeFalsy();
    expect(email.errors?.['pattern']).toBeFalsy();
    
  });

});
