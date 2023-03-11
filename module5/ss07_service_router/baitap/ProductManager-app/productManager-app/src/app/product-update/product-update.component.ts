import {Component, OnInit} from '@angular/core';
import {Product} from '../model/product';
import {ActivatedRoute, Router} from '@angular/router';
import {ProductService} from '../service/product.service';
import {FormControl, FormGroup} from '@angular/forms';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {
  product: Product;
  productForm: FormGroup = new FormGroup(
    {
      id: new FormControl(),
      name: new FormControl(),
      price: new FormControl(),
      description: new FormControl()
    }
  );

  constructor(private activatedRoute: ActivatedRoute, private productService: ProductService, private router: Router) {
    this.activatedRoute.paramMap.subscribe(next => {
        const id = next.get('id');
        productService.findProductById(id).subscribe(next => {
          this.product = next;
        }, error => {
          alert('lỗi');
        });
      },
      error => {
      }, () => {

      }
    );
  }

  ngOnInit(): void {
  }

  submit() {
    const product = this.productForm.value;
    this.productService.updateProduct(product.id, product).subscribe(next => {
      this.productForm.reset();
      this.router.navigateByUrl('');
    });
  }

}
