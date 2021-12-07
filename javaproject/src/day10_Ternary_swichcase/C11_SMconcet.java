package day10_Ternary_swichcase;

public class C11_SMconcet {

	public static void main(String[] args) {
		// String olarak verilen bir degisken + ile baska bir degiskenle isleme sokulursa
        // jAVA bunlari yan yana ekler. Buna Concatenation denir.
        
        String isim="Ali";
        String soyisim="Can";
        
        System.out.println(isim + " " + soyisim); // Ali Can
        
        // ayni islemi + sembolu yerine concat() ile de yapabiliriz
        
        System.out.println(isim.concat(soyisim));
        
        System.out.println(isim.concat(" ").concat(soyisim)); // Ali Can
 
	}

}
