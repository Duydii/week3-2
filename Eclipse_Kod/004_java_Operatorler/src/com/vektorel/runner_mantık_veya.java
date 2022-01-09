package com.vektorel;

import java.util.Scanner;

public class runner_mant�k_veya {

	public static void main(String[] args) {
		
		// kontrol edilmesi istenilen durumlardan 
		//herhangi birinin do�ru olmas� durumu
		
		// �nternet site giri�leri kural�
		// sadece kad�nlar
		// ya da 20 ya� ile 40 ya� aras�ndakiler
		// ya da 100 ya� ve �zeri olanlar
		
		System.out.println("Site Giri�i");
		Scanner sc = new Scanner(System.in);
		System.out.println("Cinsiyet (E/K)");
		String cinsiyet = sc.nextLine();
		System.out.println("Ya�...: ");
		int yas = sc.nextInt();
		boolean kural1= cinsiyet.equals("K") || cinsiyet.contains("Kad�n");
		// D�KKAT!! 4 ayr� giri�durumu i�in y�ntem 1
		kural1 = cinsiyet.equals("k") ||
				cinsiyet.equals("K") ||
				cinsiyet.equals("kad�n")||
				cinsiyet.equals("Kad�n");
		
		// Y�ntem 2
		// Not: LowerCase bir string ifadede olan t�m karakterleri k���k harfe �evirir
		
		kural1 = cinsiyet.toLowerCase().equals("k")||
				cinsiyet.toLowerCase().equals("kad�n");
		boolean kural2 = yas>=20 && yas<=40;
		boolean kural3 = yas>100;
		
		// VEYA ||  operat�r� irdelenen durumlardan herhangi biri do�ru ise do�ru
		
		boolean giris_onay = kural1 || kural2 || kural3;
		
		System.out.println("sisteme girebilme..: "+giris_onay);
		
	}

}
