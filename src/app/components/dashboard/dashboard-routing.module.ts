import { OrdersComponent } from './orders/orders.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BarChartComponent } from '../bar-chart/bar-chart.component';
import { DashboardRoutingComponent } from './DashboardRoutingComponent';


const dashroutes: Routes = [
  {
    path: '', component: DashboardRoutingComponent,
    children: [
      {
        path: 'barchart', component: BarChartComponent

      },
      {
        path: 'order-table', component: OrdersComponent
      },
      {
        path: '', redirectTo: '/order-table', pathMatch: 'full'
      }
  ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(dashroutes)],
  exports: [RouterModule]
})
export class DashboardRoutingModule { }
