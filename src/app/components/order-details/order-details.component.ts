import { Component, OnInit } from "@angular/core";
// import { Product } from "../product";
import { Router } from "@angular/router";
// import { ProductService } from "../product.service";

@Component({
  selector: "app-order-details",
  templateUrl: "./order-details.component.html",
  styleUrls: ["./order-details.component.scss"]
  // providers: [ProductService]
})
export class OrderDetailsComponent implements OnInit {
  public products = [];

  orderPrice: number;
  selectedProductDetails = [];
  constructor(
    private router: Router // private _productService: ProductService
  ) {}

  ngOnInit() {
    // debugger;
    let productDetailsData = JSON.parse(localStorage.getItem("productDetails"));
    this.orderPrice =
      productDetailsData.unitPrice * productDetailsData.quantity;
    this.selectedProductDetails.push(productDetailsData);
    console.log(productDetailsData);
    // this.products = this._productService.getProducts();
  }

  productSelection() {
    this.router.navigate(["/product-selection"]);
  }

  // getOrderPrice() {
  //     this.orderPrice = this.products.reduce(function(unitPrice: number, quantity: number) => {
  //      orderPrice =  (Product.unitPrice * Product.quantity);
  //     },0);
  // }
  //   getTotalAmount() {
  //     if (this.yourdatalist) {
  //         return this.yourdatalist.map(t => t.Amount).reduce((a, value) => a + value, 0);
  //     }
  //     return 0;
  // }

  // <td>{{getTotalAmount()}}</td>
  // this.getALLProducts()

  //       this.orderedDate = new Date().getTime();
  //       this.ProductName = Productselection.items.map(i => {
  //           return {
  //               product: {
  //                   title: i.title,
  //                   unitPrice: i.unitPrice,
  //                  },
  //               quantity: i.quantity,
  //               totalPrice: i.totalPrice // I want to loop this property and sum up

  //           }
  //       })

  //   }
  // }
}
