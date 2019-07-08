import { Component, OnInit, NgModule } from '@angular/core';
import { FormsModule, FormGroup, FormControl } from '@angular/forms';


@NgModule({
  imports: [
     FormsModule,
     FormGroup,
     FormControl

  ]
})

@Component({
  selector: 'app-product-selection',
  templateUrl: './product-selection.component.html',
  styleUrls: ['./product-selection.component.scss']
})
export class ProductSelectionComponent implements OnInit {

  constructor() { }
  ngOnInit() {
  }

 submitProductInfo(form){
   console.log(form.value);
   alert("The form was submitted");
   form.reset();
 }

}
