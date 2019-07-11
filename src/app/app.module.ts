import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { DashboardModule } from './components/dashboard/dashboard.module';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { MaterialModule } from './shared/material/material.module';
import { AppComponent } from './app.component';
import { ProductSelectionComponent } from './components/product-selection/product-selection.component';
import { AgGridModule } from 'ag-grid-angular';


import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { OrderDetailsComponent } from './components/order-details/order-details.component';
import { PagenotfoundComponent } from './components/pagenotfound/pagenotfound.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductSelectionComponent,
    OrderDetailsComponent,
    PagenotfoundComponent,
  ],
  imports: [
    BrowserModule,
    DashboardModule,
    AppRoutingModule,
    MaterialModule,
    BrowserAnimationsModule,
    FormsModule,
    AgGridModule,
    HttpClientModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
