package com.vektorel;

import java.util.Scanner;

public class runner_mant�koperatorleri {

	public static void main(String[] args) {
		
		// Sistemdeki bilgiler (Veritaban�-Database) de tutulur
				
		String kullaniciadi = "dincozmen";
		String sifre = "Dd123?";
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("******************");
		System.out.println("****LOGIN PAGE****");
		System.out.println("******************");
		System.out.println();
		System.out.println("Kullanici Adi.....: ");
		String giris_adi = sc.nextLine();
		System.out.println("�ifre.....: ");
		String giris_sifresi = sc.nextLine();
		// Burada sistemde olan kullan�c� bilgileri ile
		//ekrandan girilen bilgileri kar��la�t�rmal�y�z
		// == iki de�er birbriine e�itmidir
		// !!! Kodlama yakla��m� 1
		boolean ka = kullaniciadi.equals(giris_adi);
		boolean sf = sifre.equals(giris_sifresi);
		// giri� yap�labilmesi i�in iki de�erde true olmal�
		// VE - iki durumda ayn� anda do�ru olmas�n� irdeler
		// yani birle�tirilen yap�lar�n t�m�n�n do�ru oldu�u zman true
		
		boolean sonuc = ka && sf;
		System.out.println("Giri� Yap�ld� m�? " +sonuc);
		
		// !!! Kodlama yakla��m� 2
		// UYARI - Console ekran�ndan al�nan string ifadelerin 
		// kar��la�t�rmas� == ile yap�l�rsa hatal� ��kar
		// bunun yerine "EQUALS" � kullan�n
		sonuc = kullaniciadi == giris_adi && sifre == giris_sifresi;
		System.out.println("Giri� Yap�ld� m�? " +sonuc);
		
		// �rnek bir kay�t mekanizmas�nda, kullan�c�n�n girmesi istenilen
		// de�erlerin do�rulu�u kontrol ediliyor olsun.
		System.out.println("�yelik Ekran�");
		System.out.println("email...: ");
		String ad = sc.nextLine();
		System.out.println("sifre...: ");
		String pss = sc.nextLine();
		System.out.println("sifre dogrula...: ");
		String pss2 = sc.nextLine();
		// KURALLAR: 
		//1. kullan�c� ad� 3 karakterden fazla olmal�
		//2. email olmal�
		//3. sifre en az 8 karakter olmal�
		//4. �ifreler ayn� olmal�
		
		// Kullan�c� ad�n�n 2 karakterden uzun olup olmad���n� kontrol eder
		boolean kullanici_karakter_uzunlugu = ad.length()>2;
		boolean kullanici_email_mi = ad.contains("@");
		boolean sifre_uzunlugu = pss.length()>7;
		boolean sifre_dogrulama = pss.equals(pss2);
		boolean uyelik = kullanici_email_mi &&
						kullanici_karakter_uzunlugu &&
						sifre_uzunlugu &&
						sifre_dogrulama;
		System.out.println("�ye oldu mu?" + uyelik);
		
		
		
		
		
		
		
	}

}
