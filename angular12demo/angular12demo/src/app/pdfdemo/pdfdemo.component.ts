import { Component, OnInit } from '@angular/core';
import jsPDF from 'jspdf';
import autoTable from 'jspdf-autotable';

@Component({
  selector: 'app-pdfdemo',
  templateUrl: './pdfdemo.component.html',
  styleUrls: ['./pdfdemo.component.css']
})
export class PdfdemoComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  download(){

    let doc=new jsPDF('p','pt','a4');

    autoTable(doc,{
      margin:{top:10},
      html:'#pdfTable',
      theme:'grid'
    });
    doc.save('tableToPdf.pdf'); 

  }

}
