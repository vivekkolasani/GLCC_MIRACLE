import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { MaterialModule } from './shared/material/material.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { ToolbarComponent } from './components/toolbar/toolbar.component';
import { BarChartComponent } from './components/bar-chart/bar-chart.component';
import { ProductSelectionComponent } from './components/product-selection/product-selection.component';
import { NgxChartsModule } from '@swimlane/ngx-charts';
import { AgGridModule } from 'ag-grid-angular';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { OrderDetailsComponent } from './components/order-details/order-details.component';
import { PagenotfoundComponent } from './components/pagenotfound/pagenotfound.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    ToolbarComponent,
    BarChartComponent,
    ProductSelectionComponent,
    OrderDetailsComponent,
    PagenotfoundComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MaterialModule,
    BrowserAnimationsModule,
    FormsModule,
    NgxChartsModule,
    AgGridModule,
    HttpClientModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
