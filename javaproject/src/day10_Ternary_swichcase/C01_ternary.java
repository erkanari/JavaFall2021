package day10_Ternary_swichcase;

import java.util.Scanner;

public class C01_ternary {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi1 =scan.nextDouble();
        System.out.println("lutfen bir sayi daha giriniz");
        double sayi2 =scan.nextDouble();
        
        
        System.out.println(sayi1>sayi2 ? sayi2 :sayi1);
        
        scan.close();

	}

}
