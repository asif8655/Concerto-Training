import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginInputOutputComponent } from './login-input-output.component';

describe('LoginInputOutputComponent', () => {
  let component: LoginInputOutputComponent;
  let fixture: ComponentFixture<LoginInputOutputComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoginInputOutputComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginInputOutputComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
