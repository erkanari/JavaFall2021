package day03_Scanner;

import java.util.Scanner;

public class C05_ScannerJava {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen isminizi giriniz...");
		
		String isim=scan.next();
		
		System.out.println("lutfen soyisminizi girin");
		
  String soyisim=scan.next();
  
  System.out.println("girilen isim :"+ isim+ " "+soyisim);
  
  scan.close();
  
	}

}
