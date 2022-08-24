import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardOverviewComponentComponent } from './dashboard-overview-component/dashboard-overview-component.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { ProfileOverviewComponentComponent } from './profile-overview-component/profile-overview-component.component';

const routes: Routes = [
  {
    path:'dashboard',
    children:[
      {
        path: 'overview',
        component: DashboardOverviewComponentComponent

      }
      {
        path: 'profile',
        component: ProfileOverviewComponentComponent
      }


    ]
    
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
