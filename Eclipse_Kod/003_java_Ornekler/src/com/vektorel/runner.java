package com.vektorel;

import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
		// Kodlamalar main methodunun gövdesine yazýlýr.
		
		int sayi;
	
		//IO - input/output
		//ctrl+space - intellisence açmak için kullanýlýr
		Scanner sc = new Scanner(System.in);
		System.out.println("bir int sayý giriniz: ");
		sayi = sc.nextInt();
		System.out.println("sayi...: "+sayi);
		
		double dsayi;
		System.out.println("double bir sayý giriniz: ");
		dsayi = sc.nextDouble();
		System.out.println("Double sayi: "+dsayi);
		
		// DÝKKAT: Bug var.. 
		String ifade;
		sc = new Scanner (System.in);
		System.out.println("Bir ifade giriniz: ");
		ifade = sc.nextLine();
		System.out.println("ifade: ");
		
		
		
		
		
	}// main sonu

}//class sonu
