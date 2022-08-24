import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { EmployeePageComponent } from './employee-page/employee-page.component';
import { AdminPageComponent } from './admin-page/admin-page.component';
import { DashboardOverviewComponentComponent } from './dashboard-overview-component/dashboard-overview-component.component';
import { ProfileOverviewComponentComponent } from './profile-overview-component/profile-overview-component.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginPageComponent,
    EmployeePageComponent,
    AdminPageComponent,
    DashboardOverviewComponentComponent,
    ProfileOverviewComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
