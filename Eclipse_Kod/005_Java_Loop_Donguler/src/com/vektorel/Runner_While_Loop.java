package com.vektorel;

import java.util.Scanner;

public class Runner_While_Loop {

	public static void main(String[] args) {

		// While döngüsü daha çok belli kriterleri
		// saðlama durumlarýnda kullanýlýr
		//!!! tüm döngüler birbirleri yerine kullanýlabilir
		// Parantez içi doðru olduðu sürece döngü devam eder
		// eðer parantez içi mutlak true ise sonsuz döngü oluþur
		boolean kosul =false;
		while (kosul) {
		// gövde kodlar buraya yazýlýr 
		
		}
		
		//-----------------------------------
		Scanner sc = new Scanner(System.in);
		
		String secim = "E";
		while (secim.equals("E")) {
			
			System.out.println("1. sayýyý gir..: ");
			int s1 = sc.nextInt();
			System.out.println("2. sayýyý gir..: ");
			int s2 = sc.nextInt();
			int toplam = s1+s2;
			System.out.println("Toplam: "+toplam);
			sc = new Scanner(System.in); // sistem int ten stringe döndüðü için new eklendi
			
			System.out.println("Devam etmek istiyor musun (E/H)");
			secim =sc.nextLine();
		
			
		}
		
		// 
		int faktoriyel =1;
		System.out.println("sayý gir.: ");
		int sayi = sc.nextInt();
		// 5! 5*4*3*2*1	
		int sayac=sayi; 
		while (sayac>0) {
			faktoriyel*=sayac;
			sayac--;
		}
		System.out.println("FAktöriyel..: " +faktoriyel);
		
	}

}
