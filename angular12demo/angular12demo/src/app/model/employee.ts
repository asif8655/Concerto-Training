export interface Employee{
    eid:number,
    ename:string,
    email:string,
    phone:string,
    address:{city?:string,state?:string,country:string}
}