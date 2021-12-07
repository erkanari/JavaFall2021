package uygulama;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		/*
	      * kullanicinin ad soyad yas boy kilosunu alt alata yazdiriniz
	      */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("lütfen adinizi giriniz :");
		
		String name=scan.next();
		
		System.out.print("soyadinizi giriniz :");
		
		String surName=scan.next();
		
		System.out.print("yasinizi giriniz :");
		
		int age=scan.nextInt();
		
		System.out.print("boyunuzu giriniz :");
		
		int boy=scan.nextInt();
		
		System.out.print("kilonuzu yazýnýz :");
		
		int kilo=scan.nextInt();
		
		 System.out.println("benim adim:"+name+"\n"
                 +"soyadim :"+surName+"\n"
        		 +"yasim:"+age+"\n"
                 +"boyum:"+boy+"\n"
        		 +"kilom:"+kilo);
		
		
		
		
		
		
		


	}

}
