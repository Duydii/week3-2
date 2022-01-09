package com.vektorel;

import java.util.Scanner;

public class runner_iliskiseloperatorler {

	public static void main(String[] args) {
		
		// iki deðiþkenin birbirine göre durumu irelemek
		// sonuç true/false oalrak verilir
		// > büyüktür, <küçüktür, >=büyük eþit, <=küçük eþit....
		//== eþittir
		//!= eþit deðildir
		
		int sayi2, sayi1;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.sayi: " );
		sayi1 = sc.nextInt();
		System.out.println("2.sayi: " );
		sayi2 = sc.nextInt();
		boolean durum; // true - false
		durum = sayi1 > sayi2;
		System.out.println("s1 s2 den büyük mü: " +durum);
		
		durum = sayi1 ==sayi2;
		System.out.println("iki sayý eþit mi: "+ durum);
		
		durum = sayi1 !=sayi2;
		System.out.println("iki sayý eþit deðil mi: "+ durum);
		
		
	}

}
