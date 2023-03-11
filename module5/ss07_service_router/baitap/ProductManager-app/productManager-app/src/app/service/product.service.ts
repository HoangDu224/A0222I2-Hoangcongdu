import {Injectable} from '@angular/core';
import {Product} from '../model/product';
import {forEachComment} from 'tslint';
import {Observable} from 'rxjs';
import {HttpClient, HttpClientModule} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<Product[]> {
    return this.httpClient.get<Product[]>('http://localhost:3000/products/');
  }


  saveProduct(event: any): Observable<any> {
    return this.httpClient.post('http://localhost:3000/products/', event);

  }

  deleteProductById(id: number): Observable<any> {
    return this.httpClient.delete('http://localhost:3000/products/' + id);
  }

  updateProduct(id: number, product: Product): Observable<any> {
    return this.httpClient.put('http://localhost:3000/products/' + id, product);
  }

  findProductById(id: any): Observable<Product> {
    return this.httpClient.get<Product>('http://localhost:3000/products/' + id);
  }
}
