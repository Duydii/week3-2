package com.vektorel;

import java.util.Scanner;

public class runner_iliskiseloperatorler {

	public static void main(String[] args) {
		
		// iki de�i�kenin birbirine g�re durumu irelemek
		// sonu� true/false oalrak verilir
		// > b�y�kt�r, <k���kt�r, >=b�y�k e�it, <=k���k e�it....
		//== e�ittir
		//!= e�it de�ildir
		
		int sayi2, sayi1;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.sayi: " );
		sayi1 = sc.nextInt();
		System.out.println("2.sayi: " );
		sayi2 = sc.nextInt();
		boolean durum; // true - false
		durum = sayi1 > sayi2;
		System.out.println("s1 s2 den b�y�k m�: " +durum);
		
		durum = sayi1 ==sayi2;
		System.out.println("iki say� e�it mi: "+ durum);
		
		durum = sayi1 !=sayi2;
		System.out.println("iki say� e�it de�il mi: "+ durum);
		
		
	}

}
