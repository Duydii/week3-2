package com.vektorel;

import java.util.Scanner;

public class runner_for_loop_ornek1 {

	public static void main(String[] args) {

		//1- 20 ile 100 arasýndaki sayýlarýekrana yazdýran program
		
		for (int i=20;i<100;i++) {
			
			System.out.println(i);
		}
		
		//2- 40 ile 18 arasýndaki sayýlarý azalarak yazdýran program
		// koþul ifadelerinde koþulu KENDÝNÝZE sorun doðru ise devam et!!!
		for (int i=40;i>18;i--) {
			
			System.out.println(i);
		}
		
		//3- 100 ile 200 arasýndaki5  in katý olansayýlarý listele
		
		for (int i = 100; i <=200; i+=5) {
			
			System.out.println(i);
			
		}
		
		//4- 1 ile 40 arasýndaki teksayýlarý
		
		for (int i = 1; i < 40; i+=2) {
			
			System.out.println(i);
		}
	
		// 5- 1 ile 50 arasýndaki çift sayýlarýn toplamý
		int toplam = 0;
		for (int i = 0; i <= 50; i+=2) {
			toplam +=i;
			
			
		}
		System.out.println("toplam..: "+toplam);
	
		
		// kullanýcýdan aldýðýnýz deðerin faktöriyel hesaplamasýný bulunuz.
		
		System.out.println("bir sayi giriniz..: ");
		Scanner sc = new Scanner(System.in); 
		int sayi = sc.nextInt();
		int faktoriyel=1;
		//5! 5*4*3*2*1
		
		for (int i = sayi; i > 1; i--) {
			faktoriyel *=i;
			
		}
		
		 System.out.println("Faktöriyel : " +faktoriyel);

		
		
		}
	}


