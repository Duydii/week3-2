package com.vektorel;

import java.util.Random;
import java.util.Scanner;

public class runner_dowhile_ornek {

	public static void main(String[] args) {

		//0-8 arasýnda sayý tahmin oyunu
		// Bu rastgele bir sistem ile sayý üretmek için kullanýlan yapýdýr
		Random rd = new Random ();
		int sayi = rd.nextInt(8);
		Scanner sc = new Scanner(System.in);
		boolean buldunmu;
		int tahminsayisi=0;
		do {
			System.out.println("Tahmininizi giriniz..: ");
			int tahmin = sc.nextInt();
			buldunmu = sayi == tahmin;
			tahminsayisi++;
						
		}while(!buldunmu); // ! deðillemek gerekli
		
		System.out.println("Aferin " +tahminsayisi+".tahminde buldun");
	}

}
