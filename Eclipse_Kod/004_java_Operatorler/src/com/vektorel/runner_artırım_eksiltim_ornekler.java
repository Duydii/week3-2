package com.vektorel;

public class runner_artýrým_eksiltim_ornekler {

	public static void main(String[] args) {
	
		int s1=8, s2=5;
		//1- arttýrma ya da eksiltme iþlemi iþlemin olduðu anda olmaz
		// bir sonraki adýmda olur. Ancak prefix ise durum deðiþir
		//2- Prefix, Suffix (Ön ek, son ek)
		// eðer önde ise iþlem hemen uygulanýr
		// eðer sonda ise iþlem sonraki kullanýmda uygulanýr
		//           8   + 6     +  5   -   4  + 9  
		int toplam = s1++ + ++s2 + --s2 - --s2 + s1++;
		
		System.out.println("Toplam: "+toplam);
		
	}

}
