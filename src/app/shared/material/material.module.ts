import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatButtonModule, MatIconModule, MatSidenavModule,
  MatToolbarModule, MatListModule, MatCardModule,
  MatTableModule, MatMenuModule, MatFormFieldModule,
  MatInputModule, MatDatepickerModule, MatNativeDateModule,
  MatSnackBarModule } from '@angular/material';

const exportedMatModule = [
MatButtonModule,
MatIconModule,
MatSidenavModule,
MatToolbarModule,
MatListModule,
MatCardModule,
MatTableModule,
MatMenuModule,
MatFormFieldModule,
MatInputModule,
MatDatepickerModule,
MatNativeDateModule,
MatSnackBarModule,
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    ...exportedMatModule,
  ],
  exports: [
    ...exportedMatModule,
  ]
})
export class MaterialModule { }
