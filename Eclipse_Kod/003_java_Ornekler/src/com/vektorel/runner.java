package com.vektorel;

import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
		// Kodlamalar main methodunun g�vdesine yaz�l�r.
		
		int sayi;
	
		//IO - input/output
		//ctrl+space - intellisence a�mak i�in kullan�l�r
		Scanner sc = new Scanner(System.in);
		System.out.println("bir int say� giriniz: ");
		sayi = sc.nextInt();
		System.out.println("sayi...: "+sayi);
		
		double dsayi;
		System.out.println("double bir say� giriniz: ");
		dsayi = sc.nextDouble();
		System.out.println("Double sayi: "+dsayi);
		
		// D�KKAT: Bug var.. 
		String ifade;
		sc = new Scanner (System.in);
		System.out.println("Bir ifade giriniz: ");
		ifade = sc.nextLine();
		System.out.println("ifade: ");
		
		
		
		
		
	}// main sonu

}//class sonu
