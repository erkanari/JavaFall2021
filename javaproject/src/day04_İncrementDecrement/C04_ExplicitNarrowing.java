package day04_�ncrementDecrement;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
		
		int sayi1=55;
				
		short sayi2=(short) sayi1;
		
		System.out.println("sayi2 : "+sayi2);
		
		byte sayi3=(byte) sayi2;
				
		System.out.println("sayi3 : "+sayi3);
		
		double sayi4=87.3;
		
		int sayi5=(int) sayi4;
		
		System.out.println("sayi5 : "+sayi5);
		
		int sayi6=27;
		
		int sayi7=4;
		
		System.out.println(sayi6/sayi7);//b�lme i�lemi sonucu virg�ll� olsa bile 
		//int oldu�u i�in tam say� olarak yazar sonu� 6 yazar
		
		double sayi8=4;
		
		System.out.println(sayi6/sayi8);

	}
	
	

}
