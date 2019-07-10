import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";

import {
  FormsModule,
  FormGroup,
  FormBuilder,
  FormControl
} from "@angular/forms";

@Component({
  selector: "app-order-details",
  templateUrl: "./order-details.component.html",
  styleUrls: ["./order-details.component.scss"]
  // providers: [ProductService]
})
export class OrderDetailsComponent implements OnInit {
  public products = [];
  public Order = [];
  private formGroup: FormGroup;
  orderPrice: number;
  totalAmount: number;
  tax: number;
  selectedProductDetails = [];
  constructor(
    private router: Router,
    private fb: FormBuilder // private formGroup: FormGroup // private _productService: ProductService
  ) {
    this.createForm();
  }
  createForm() {
    debugger;
    this.formGroup = this.fb.group({
      orderNumber: new FormControl(""),
      customer: new FormControl("")
    });
  }
  ngOnInit() {
    debugger;
    let productDetailsData = JSON.parse(localStorage.getItem("productDetails"));
    this.orderPrice =
      productDetailsData.unitPrice * productDetailsData.quantity;
      this.tax = (10/100) * +this.orderPrice;

    this.totalAmount =
      this.orderPrice +
      this.tax +

    this.selectedProductDetails.push(productDetailsData);
    // this.products = this._productService.getProducts();
  }

  productSelection() {
    this.router.navigate(["/product-selection"]);
  }
  onSubmitOrders() {
    debugger;
    let orderDetails = {
      orderNumber: this.formGroup.value.orderNumber,
      customer: this.formGroup.value.customer,
      productDetails: this.selectedProductDetails,
      orderPrice: this.orderPrice,
      totalAMount: this.totalAmount ? this.totalAmount : 0
    };
    console.log(orderDetails);
  }
}
