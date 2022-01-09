package com.vektorel;

import java.util.Scanner;

public class runner_mantýk_veya {

	public static void main(String[] args) {
		
		// kontrol edilmesi istenilen durumlardan 
		//herhangi birinin doðru olmasý durumu
		
		// Ýnternet site giriþleri kuralý
		// sadece kadýnlar
		// ya da 20 yaþ ile 40 yaþ arasýndakiler
		// ya da 100 yaþ ve üzeri olanlar
		
		System.out.println("Site Giriþi");
		Scanner sc = new Scanner(System.in);
		System.out.println("Cinsiyet (E/K)");
		String cinsiyet = sc.nextLine();
		System.out.println("Yaþ...: ");
		int yas = sc.nextInt();
		boolean kural1= cinsiyet.equals("K") || cinsiyet.contains("Kadýn");
		// DÝKKAT!! 4 ayrý giriþdurumu için yöntem 1
		kural1 = cinsiyet.equals("k") ||
				cinsiyet.equals("K") ||
				cinsiyet.equals("kadýn")||
				cinsiyet.equals("Kadýn");
		
		// Yöntem 2
		// Not: LowerCase bir string ifadede olan tüm karakterleri küçük harfe çevirir
		
		kural1 = cinsiyet.toLowerCase().equals("k")||
				cinsiyet.toLowerCase().equals("kadýn");
		boolean kural2 = yas>=20 && yas<=40;
		boolean kural3 = yas>100;
		
		// VEYA ||  operatörü irdelenen durumlardan herhangi biri doðru ise doðru
		
		boolean giris_onay = kural1 || kural2 || kural3;
		
		System.out.println("sisteme girebilme..: "+giris_onay);
		
	}

}
