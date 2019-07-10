import { PagenotfoundComponent } from './components/pagenotfound/pagenotfound.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { BarChartComponent } from './components/bar-chart/bar-chart.component';
import { OrderDetailsComponent } from './components/order-details/order-details.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductSelectionComponent } from './components/product-selection/product-selection.component';


const routes: Routes = [
  {
    path: 'product-selection', component: ProductSelectionComponent
  },
  {
    path: 'order-details', component: OrderDetailsComponent
  },
  {
    path: 'barchart', component: BarChartComponent
  },
  {
    path: 'dashboard', component: DashboardComponent
  },
  {
    path: '', redirectTo: '/dashboard', pathMatch: 'full'
  },
  {
    path: '**', component: PagenotfoundComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
