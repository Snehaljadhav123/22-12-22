package com.Exercises.pll;

import com.Exercises.bll.*;

public class TestInvoiceItem {

	public static void main(String[] args) {
		 
         InvoiceItem i=new InvoiceItem("Pen","Writes",10,10);
         
         
         System.out.println("\n ID :"+ i.getId());
 		System.out.println(" Discription :"+i.getDesc());
 		System.out.println(" Quantity :"+i.getQty());
 		System.out.println(" Unit Price :"+i.getUnitPrice());
 		System.out.println(" Total Amount  :"+i.getTotal());
 		
 		
 		i.setQty(15);
 		i.setUnitPrice(15);
 		
 		System.out.println("\n New Quantity :"+i.getQty());
 		System.out.println("  New Unit Price :"+i.getUnitPrice());
 		System.out.println("  New Total Amount  :"+i.getTotal());
 		
 		System.out.println(i.toString());
       
	}

}