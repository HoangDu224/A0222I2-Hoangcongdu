import {Component, OnInit} from '@angular/core';
import {ProductService} from '../service/product.service';
import {Product} from '../model/product';
import {Observable} from 'rxjs';
import {Router} from '@angular/router';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products: Product[] = [];

  constructor(private  productService: ProductService, private router: Router) {
    this.productService.getAll().subscribe(next => {
      this.products = next;
    });
  }

  ngOnInit(): void {
  }

  deleteProduct(id: number) {
    this.productService.deleteProductById(id).subscribe(next => {
      this.router.navigateByUrl('');
    });
  }
}
