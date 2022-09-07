import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'power'
})
export class PowerPipe implements PipeTransform {
  
  
  transform(value: number, ...args: number[]): number {
    console.log(value)
    console.log(args)
    let power = 0;
    if(args.length==0)
    power=2;
    else
    power=args[0]
    return value**args[0];
  }

}
