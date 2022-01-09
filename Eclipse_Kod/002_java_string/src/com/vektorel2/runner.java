package com.vektorel2;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string - references data type
		// karakter dizisi þeklinde ifade edilebilir
		// char [] value
		// DÝKKAT: string metodlarý ile iþlem yaptýðýmýzda 
		//string ifadenin deðeri deðiþmez
		
		
		String ifade = "Bugün hava güzel"; // { "B", "u", ....} þeklinde pc de tututlur
		// diziler her zaman0 indexten baþlar o yüzden 5. harf yazýldý
		// 1 bit , iki deðer alýr. Deðeri 0 ya da 1 olabilir
		// charAt index deðeri verilen karakteri verir.
		
		System.out.println(ifade.charAt(4));
		
		
		System.out.println(ifade.concat("Bu nedir??"));
		System.out.println(ifade+" bu ne?");
		
		//contain - bir string ifade içinde aranýlan deðerimn
		//olup olmadýðýný sorgulat varsa tru yoksa false
		System.out.println(ifade.contains("hava"));
		
		//equals - iki string ifadenin eþitliðini kontrol eder
		// eþit ise true deðilse false
	
		String kullanici_adi = "Admin";
		System.out.println(kullanici_adi.equals("administrator"));
		System.out.println(kullanici_adi.equals("Admin"));
		
		//indexof - bir string ifadede aranýlan ifade ya da karakterin
		// index olarak konumunu verir. eðer aranýlan deðer yoksa
		// -1 deðeri döner. -1 yok demektir indexte
		System.out.println(ifade.indexOf("ü"));
		System.out.println(ifade.indexOf("hav"));
		System.out.println(ifade.indexOf("þþ"));
		
		
		//örnek: internette url adresleri, boþluk içermez. özel karakter
		// içermez.
		//replace  - bir string ifade içinde deðiþtirilmesi istenilen
		// deðerleri yeni deðerinde dönüþtürür. boþlukta bir karakterdir
		String resim_url = "Yeni evim foto.jpg";
		String yeni_ifade = resim_url
									.replace(" ","-")
									.replace("im","inin");
		System.out.println(yeni_ifade);
		System.out.println(resim_url);
	}
	

}
