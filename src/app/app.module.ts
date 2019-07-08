import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { MaterialModule } from './shared/material/material.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { ToolbarComponent } from './components/toolbar/toolbar.component';
<<<<<<< HEAD
import { BarChartComponent } from './components/bar-chart/bar-chart.component';
=======
import { ProductSelectionComponent } from './components/product-selection/product-selection.component';

import { FormsModule }   from '@angular/forms';
>>>>>>> c246894d41f5fe0f0eb0212da5ceebd4a0ed4164

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    ToolbarComponent,
<<<<<<< HEAD
    BarChartComponent
=======
    ProductSelectionComponent
>>>>>>> c246894d41f5fe0f0eb0212da5ceebd4a0ed4164
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MaterialModule,
    BrowserAnimationsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
