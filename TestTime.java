package com.work.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTime {
public static void main(String[] args) throws ParseException {
	Date d = new Date();
	SimpleDateFormat f= new SimpleDateFormat("dd/MM/yyyy");
	String strDate =f.format(d);
	System.out.println(strDate);
	Date pDate=f.parse("23/09/2000");
	System.out.println(pDate);
	
}
}

