package uygulama;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("1.sayiyi giriniz");
		int sayi1=scan.nextInt();
		System.out.print("2.sayiyi giriniz");
		int sayi2=scan.nextInt();
		
		System.out.println("girilen sayilar�n toplami :"+(sayi1+sayi2));
				
		System.out.println("girilen sayilar�n farki :"+(sayi1-sayi2));
		
		System.out.println("girilen sayilar�n �arpm�  :"+(sayi1*sayi2));
		
		System.out.println("girilen sayilar�n b�l�m� :"+(sayi1/sayi2));
		

		
		
		
		
		
		
	}

}
