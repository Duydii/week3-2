package com.vektorel;

import java.util.Scanner;

public class runner_aritmetikoperatorler {

	public static void main(String[] args) {
		int s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Sayi...: ");
		s1 = sc.nextInt();
		// shift+üst ok - ctrl+c/ctrl+v
		// kopyalam yöntemi - ctrl+insert, / shift+insert x2
		//ctrl+alt+alt ok    alta kopyalamak için kýsayol
		System.out.println("2. Sayi...: ");
		s2 = sc.nextInt();
			// Toplama -- +
		int toplam = s1+s2;
		System.out.println("Toplam: "+ toplam);
		int fark = s1-s2;
		System.out.println("Fark: "+ fark);
		int çarpma = s1*s2;
		System.out.println("Çarpým: "+ çarpma);
		int bölme = s1/s2;
		System.out.println("Bölüm: "+ bölme);
		int mod = s1%s2;
		System.out.println("Mod: "+ mod);
		
		
	}

}
