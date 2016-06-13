package com.cts;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bus {
	
	
	public static void main(String args[]){
		
		String input_date="17/05/2016";
		  SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		  Date dt1 = null;
		try {
			dt1 = format1.parse(input_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  DateFormat format2=new SimpleDateFormat("EEEE"); 
		  String finalDay=format2.format(dt1);
		System.out.println(finalDay);
		System.out.println("Git integrated");
		
		
		
	}
	

}
