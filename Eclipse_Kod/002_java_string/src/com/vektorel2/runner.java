package com.vektorel2;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string - references data type
		// karakter dizisi �eklinde ifade edilebilir
		// char [] value
		// D�KKAT: string metodlar� ile i�lem yapt���m�zda 
		//string ifadenin de�eri de�i�mez
		
		
		String ifade = "Bug�n hava g�zel"; // { "B", "u", ....} �eklinde pc de tututlur
		// diziler her zaman0 indexten ba�lar o y�zden 5. harf yaz�ld�
		// 1 bit , iki de�er al�r. De�eri 0 ya da 1 olabilir
		// charAt index de�eri verilen karakteri verir.
		
		System.out.println(ifade.charAt(4));
		
		
		System.out.println(ifade.concat("Bu nedir??"));
		System.out.println(ifade+" bu ne?");
		
		//contain - bir string ifade i�inde aran�lan de�erimn
		//olup olmad���n� sorgulat varsa tru yoksa false
		System.out.println(ifade.contains("hava"));
		
		//equals - iki string ifadenin e�itli�ini kontrol eder
		// e�it ise true de�ilse false
	
		String kullanici_adi = "Admin";
		System.out.println(kullanici_adi.equals("administrator"));
		System.out.println(kullanici_adi.equals("Admin"));
		
		//indexof - bir string ifadede aran�lan ifade ya da karakterin
		// index olarak konumunu verir. e�er aran�lan de�er yoksa
		// -1 de�eri d�ner. -1 yok demektir indexte
		System.out.println(ifade.indexOf("�"));
		System.out.println(ifade.indexOf("hav"));
		System.out.println(ifade.indexOf("��"));
		
		
		//�rnek: internette url adresleri, bo�luk i�ermez. �zel karakter
		// i�ermez.
		//replace  - bir string ifade i�inde de�i�tirilmesi istenilen
		// de�erleri yeni de�erinde d�n��t�r�r. bo�lukta bir karakterdir
		String resim_url = "Yeni evim foto.jpg";
		String yeni_ifade = resim_url
									.replace(" ","-")
									.replace("im","inin");
		System.out.println(yeni_ifade);
		System.out.println(resim_url);
	}
	

}
