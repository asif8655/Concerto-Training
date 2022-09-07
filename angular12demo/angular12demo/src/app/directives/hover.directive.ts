import { Directive, ElementRef, HostBinding, HostListener, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appHover]'
})
export class HoverDirective {

  @HostBinding("src")
  imgSrc:string="";

  constructor(private el:ElementRef,private render:Renderer2) {
  console.log(el.nativeElement);
  render.setStyle(el.nativeElement,'border','2px solid black');
  render.setStyle(el.nativeElement,'padding','10px');
  this.imgSrc="../../assets/images/egg-biryani.jpeg";
   }
@HostListener('mouseenter')
mouseenter()
{
  this.render.setStyle(this.el.nativeElement,'border','2px solid blue')
}
@HostListener('mouseleave')
mouseleave(){
  this.render.setStyle(this.el.nativeElement,'border','2px solid black')
}
}
