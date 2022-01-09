package com.vektorel;

import java.util.Scanner;

public class runner_mantýkoperatorleri {

	public static void main(String[] args) {
		
		// Sistemdeki bilgiler (Veritabaný-Database) de tutulur
				
		String kullaniciadi = "dincozmen";
		String sifre = "Dd123?";
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("******************");
		System.out.println("****LOGIN PAGE****");
		System.out.println("******************");
		System.out.println();
		System.out.println("Kullanici Adi.....: ");
		String giris_adi = sc.nextLine();
		System.out.println("Þifre.....: ");
		String giris_sifresi = sc.nextLine();
		// Burada sistemde olan kullanýcý bilgileri ile
		//ekrandan girilen bilgileri karþýlaþtýrmalýyýz
		// == iki deðer birbriine eþitmidir
		// !!! Kodlama yaklaþýmý 1
		boolean ka = kullaniciadi.equals(giris_adi);
		boolean sf = sifre.equals(giris_sifresi);
		// giriþ yapýlabilmesi için iki deðerde true olmalý
		// VE - iki durumda ayný anda doðru olmasýný irdeler
		// yani birleþtirilen yapýlarýn tümünün doðru olduðu zman true
		
		boolean sonuc = ka && sf;
		System.out.println("Giriþ Yapýldý mý? " +sonuc);
		
		// !!! Kodlama yaklaþýmý 2
		// UYARI - Console ekranýndan alýnan string ifadelerin 
		// karþýlaþtýrmasý == ile yapýlýrsa hatalý çýkar
		// bunun yerine "EQUALS" ý kullanýn
		sonuc = kullaniciadi == giris_adi && sifre == giris_sifresi;
		System.out.println("Giriþ Yapýldý mý? " +sonuc);
		
		// örnek bir kayýt mekanizmasýnda, kullanýcýnýn girmesi istenilen
		// deðerlerin doðruluðu kontrol ediliyor olsun.
		System.out.println("Üyelik Ekraný");
		System.out.println("email...: ");
		String ad = sc.nextLine();
		System.out.println("sifre...: ");
		String pss = sc.nextLine();
		System.out.println("sifre dogrula...: ");
		String pss2 = sc.nextLine();
		// KURALLAR: 
		//1. kullanýcý adý 3 karakterden fazla olmalý
		//2. email olmalý
		//3. sifre en az 8 karakter olmalý
		//4. þifreler ayný olmalý
		
		// Kullanýcý adýnýn 2 karakterden uzun olup olmadýðýný kontrol eder
		boolean kullanici_karakter_uzunlugu = ad.length()>2;
		boolean kullanici_email_mi = ad.contains("@");
		boolean sifre_uzunlugu = pss.length()>7;
		boolean sifre_dogrulama = pss.equals(pss2);
		boolean uyelik = kullanici_email_mi &&
						kullanici_karakter_uzunlugu &&
						sifre_uzunlugu &&
						sifre_dogrulama;
		System.out.println("Üye oldu mu?" + uyelik);
		
		
		
		
		
		
		
	}

}
