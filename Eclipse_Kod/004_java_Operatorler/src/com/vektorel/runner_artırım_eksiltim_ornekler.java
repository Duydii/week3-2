package com.vektorel;

public class runner_art�r�m_eksiltim_ornekler {

	public static void main(String[] args) {
	
		int s1=8, s2=5;
		//1- artt�rma ya da eksiltme i�lemi i�lemin oldu�u anda olmaz
		// bir sonraki ad�mda olur. Ancak prefix ise durum de�i�ir
		//2- Prefix, Suffix (�n ek, son ek)
		// e�er �nde ise i�lem hemen uygulan�r
		// e�er sonda ise i�lem sonraki kullan�mda uygulan�r
		//           8   + 6     +  5   -   4  + 9  
		int toplam = s1++ + ++s2 + --s2 - --s2 + s1++;
		
		System.out.println("Toplam: "+toplam);
		
	}

}
