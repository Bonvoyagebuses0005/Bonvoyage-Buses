import { SearchbusComponent } from './searchbus/searchbus.component';
import { TermsofservicesComponent } from './termsofservices/termsofservices.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';



const routes: Routes = [
  { path: '', component:SearchbusComponent },
  { path: 'login', component:LoginComponent },
  { path: 'signup', component:SignupComponent },
  { path: 'aboutus', component:AboutusComponent },
  { path: 'feedback', component:FeedbackComponent },
  { path: 'termsofservices', component:TermsofservicesComponent},
  { path: 'searchbus', component:SearchbusComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
