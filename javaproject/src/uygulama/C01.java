package uygulama;

public class C01 {

	public static void main(String[] args) {
		
		/* verilen 12345 say�s�n�n rakamlar�n� yukar�dan a�a��ya do�ru yazd�r�n�z
		 ex: input: 12345
       	  output: 1
       	          2
     		      3		   
     		      4
     		      5*/
		
		int sayi=12345;
		
		int birler=sayi%10;
	    int onlar=(sayi/10)%10;
		int y�zler=(sayi/100)%10;
		int binler=(sayi/1000)%10;
		int onBinler=(sayi/10000)%10;

	/*	System.out.println(onBinler);
		System.out.println(binler);
		System.out.println(y�zler);
		System.out.println(onlar);
		System.out.println(birler);*/
		
		System.out.println(onBinler+"\n"+binler+"\n"+y�zler+"\n"+onlar+"\n"+birler);


	}

}
