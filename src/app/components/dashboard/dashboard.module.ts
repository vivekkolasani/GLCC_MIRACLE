
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DashboardRoutingModule } from './dashboard-routing.module';
import { NgxChartsModule } from '@swimlane/ngx-charts';
import { MaterialModule } from '../../shared/material/material.module';

import { BarChartComponent } from './../bar-chart/bar-chart.component';
import { DashboardComponent } from './../dashboard/dashboard.component';
import { ToolbarComponent } from '../toolbar/toolbar.component';
import { DashboardRoutingComponent } from './DashboardRoutingComponent';
import { OrdersComponent } from './orders/orders.component';



@NgModule({
  declarations: [
    BarChartComponent,
    DashboardComponent,
    ToolbarComponent,
    DashboardRoutingComponent,
    OrdersComponent,
  ],
  imports: [
    CommonModule,
    DashboardRoutingModule,
    NgxChartsModule,
    MaterialModule,
  ]
})
export class DashboardModule { }
