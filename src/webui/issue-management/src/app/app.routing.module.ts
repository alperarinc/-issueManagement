import {NgModule} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";
import {AppComponent} from "./app.component";

const routes: Routes=[
  {
    path:'',
    children: [
      { path: '', pathMatch: 'full', redirectTo: 'dashboard' },
      { path: 'dashboard', loadChildren: () => import('./pages/dashboard/dashboard.module').then(x => x.DashboardModule) },
      { path: 'issue', loadChildren: () => import('./pages/issue/issue.module').then(x => x.IssueModule) },
      { path: 'project', loadChildren: () => import('./pages/project/project.module').then(x => x.ProjectModule) },

    ]
  }
];

@NgModule({
  imports:[RouterModule.forRoot(routes)],
  exports:[RouterModule]
})
export class  AppRoutingModule{}
