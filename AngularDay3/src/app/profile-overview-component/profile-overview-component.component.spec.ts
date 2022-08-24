import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfileOverviewComponentComponent } from './profile-overview-component.component';

describe('ProfileOverviewComponentComponent', () => {
  let component: ProfileOverviewComponentComponent;
  let fixture: ComponentFixture<ProfileOverviewComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfileOverviewComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProfileOverviewComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
