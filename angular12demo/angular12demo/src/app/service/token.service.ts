import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TokenService implements HttpInterceptor{

  constructor() { }
  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    console.log('intercept');
    let token = localStorage.getItem('token')
    let reqclone = req.clone({
      setHeaders:{Authorization:`Bearer ${token}`}
    })
    return next.handle(req)
  }
}
