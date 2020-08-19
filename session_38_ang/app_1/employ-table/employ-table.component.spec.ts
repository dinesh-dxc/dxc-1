import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployTableComponent } from './employ-table.component';

describe('EmployTableComponent', () => {
  let component: EmployTableComponent;
  let fixture: ComponentFixture<EmployTableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployTableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
