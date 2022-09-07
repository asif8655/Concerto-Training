import { AbstractControl } from "@angular/forms";


export function hasExclamationMark(input:AbstractControl){
    console.log(typeof(input.value))
    const hasExclamation = input.value?.indexOf('!')>=0;
    return hasExclamation ? null : {needsExclamation:true};
}