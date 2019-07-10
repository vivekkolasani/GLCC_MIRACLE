import { Component, NgModule, ViewChild } from '@angular/core';
import { FormsModule, FormGroup, FormControl } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { AgGridModule } from 'ag-grid-angular';
import { filter } from 'minimatch';
import {Router} from "@angular/router";


@NgModule({
  imports: [
     FormsModule,
     FormGroup,
     FormControl,
     AgGridModule,
     HttpClient,
     Router
  ]
})

@Component({
  selector: 'app-product-selection',
  templateUrl: './product-selection.component.html',
  styleUrls: ['./product-selection.component.scss']
})
export class ProductSelectionComponent{

  private today =  new Date().toISOString().split('T')[0];

  private gridApi;
  private gridOptions;
  private searchText:any;
  private gridColumnApi;

  private columnDefs;
  private rowSelection;
  private rowData: any;
  private searchData;
  private categoryData;

  prod_name = "";
  product_Id = "";
  prod_price:any;
  prod_category:any;


  constructor(private http: HttpClient, private router:Router) {

  this.columnDefs = [
    {
      headerName: "Product ID",
      field: "productId",
      width:200
    },
    {
      headerName: "Product Name",
      field: "productName",
      width:400
    },
    {
      headerName: "Price",
      field: "price",
      width:300
    },
    {
      headerName: "Category",
      field: "category",
      width:300
    }
  ];
  this.rowSelection = "single";
}

  onSelectionChanged() {
    var selectedRows = this.gridApi.getSelectedRows();
    var selectedRowsString = "";
    // var prod_name = "";
    // var product_Id = "";
    // var prod_price = "";
    // var prod_category = "";
    selectedRows.forEach(function(selectedRow, index) {
      if (index !== 0) {
        selectedRowsString += ", ";
      }
      selectedRowsString += selectedRow.productName;
      this.prod_name = selectedRow.productName;
      this.product_Id = selectedRow.productId;
      this.prod_price = selectedRow.price;
      this.prod_category = selectedRow.category;
    });
    console.log(this.prod_name);
    console.log(this.product_Id);
    console.log(this.prod_price);
    console.log(this.prod_category);
  }



  onGridReady(params) {
    this.gridApi = params.api;
    this.gridColumnApi = params.columnApi;

    this.http
      .get(
        "https://my-json-server.typicode.com/haunted-warbler/testJSON/posts"
      )
      .subscribe(data => {
        this.rowData = data;
      });
  }

  quickSearch(){
    this.gridApi.setQuickFilter(this.searchData);
  }
  categorySearch(){
    this.gridApi.setQuickFilter(this.categoryData);
  }

  submitProductInfo(formData){
    console.log(this.prod_price);
    console.log(formData.value);
    let productDetails = {
      category:this.prod_category,
      productName:this.prod_name,
      quantity:formData.value.quantity,
      orderedDate:formData.value.orderDate,
      unitPrice:this.prod_price,
      cust_email:formData.value.emailID,
      orderBy:formData.value.orderPlacedBy
    };
    localStorage.setItem("productDetails",JSON.stringify(productDetails));
    this.router.navigate(["/orders"]);
  }

}
