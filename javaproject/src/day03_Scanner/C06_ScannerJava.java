package day03_Scanner;

import java.util.Scanner;

public class C06_ScannerJava {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen isminizi giriniz...");
		
		String isim=scan.nextLine();
		
		System.out.println("lutfen soyisminizi girin");
		
  String soyisim=scan.nextLine();
  
  System.out.println("girilen isim :"+ isim+ " "+soyisim);
  
 scan .close();
 
	}

}
