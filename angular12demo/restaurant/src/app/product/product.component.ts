import { Component, OnInit } from '@angular/core';
import { Product } from '../model/product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  product:Product;
  constructor() { 
    this.product={
      id: 1,
      ename: "Ambur Biryani",
      description:"",
      rating: 4.3,
      price: 13,
      img: "images/biryani/Ambur-Chicken-Biryani.jpg",
      
    }
  }

  ngOnInit(): void {
  }

}
