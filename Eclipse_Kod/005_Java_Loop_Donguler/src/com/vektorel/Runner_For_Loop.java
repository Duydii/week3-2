package com.vektorel;

public class Runner_For_Loop {

	public static void main(String[] args) {
		
		//index in kýsaltmasý i
		// !!! Lütfen FOR dönügüsü sonunda süslü parantezin önüne ; koymayýnýz
		//Örnek: for(int i=0;i<40;i++);{} 
		for(int i=0;i<5;i++) {
			// bu iki süslü parantez arasý for döngüsünün gövdesidir
			//döngüye sokulacak kodlar buraya yazýlýr
			System.out.println(i+". Dinç ÖZMEN");
			System.out.println("bunu da yaz");
		}
		
		// For Loop da syntax gövdesiz kullanýn
		// For döngüsünde gövde eklenmemiþ ise yani süslü parantez yoksa sonraki ; e kadarki
		//ilk kod bloðu döngüye girer
		for (int i=0;i<5;i++)
			System.out.println("2 For Loop Gövdesiz");
			System.out.println("bunu yazacak mý");
		
		System.out.println("Program Sonlandý");

		
		
	}

}
