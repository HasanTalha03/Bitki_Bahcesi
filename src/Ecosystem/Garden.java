package Ecosystem;

import java.util.Random;
import java.util.Scanner;

public class Garden extends Flowers
    


{
	Scanner scan=new Scanner(System.in);
    public Garden(int rose,int daisy,int violet,int lily)
    {
    	super(rose,daisy,violet,lily);
    	
    }
	

	
	private int empty_soil=5;
	private String secim;
	
	public void AddFlower()
	{
		boolean durum=true;
		
		String cicek="Rose(Gul)\n"+"Daisy(Papatya)\n"+"Violet(Menekse)\n"+"Lily(Zambak)";
		System.out.println("Hangi cicegi ekmek istiyorsunuz");
		System.out.println(cicek);
		System.out.println("Eğer islemden cikmak istiyorsaniz 0 ı tuslayin");
		
		
		
		secim=scan.nextLine();
		
		
		if(empty_soil!=0) {
		   switch (secim) {
			
		     case "Rose":
			   System.out.println("Bahcenize 1 adet Gul eklendi");
			   setNumber_of_roses(getNumber_of_roses()+1);
			   empty_soil-=1;
			
			   while(durum && empty_soil!=0) {
				System.out.println("Bahceye 1 gul daha eklemek ister misiniz (Evet/Hayir)"); 
				secim=scan.nextLine();
				
				if(secim.equals("Evet")) {
					System.out.println("Bahceye 1 gul daha eklendi");
					empty_soil-=1;
					setNumber_of_roses(getNumber_of_roses()+1);	
				}
				
				else if(secim.equals("Hayir")) {
					durum=false;
				}
				}
				
			   
			   
			if (empty_soil==0) {
				
				System.out.println("Bahcenizde ekecek alan kalmamistir");
			}
			
			
			break;
			
			
			
		    case "Daisy":
			  System.out.println("Bahcenize 1 adet Papatya eklendi");
			  empty_soil-=1;
			  setNumber_of_daisy(getNumber_of_daisy()+1);
			
			while(durum && empty_soil!=0) {
				System.out.println("Bahceye 1 Papatya daha eklemek ister misiniz (Evet/Hayir)"); 
				secim=scan.nextLine();
				
				if(secim.equals("Evet")) {
					System.out.println("Bahceye 1 Papatya daha eklendi");
					setNumber_of_daisy(getNumber_of_daisy()+1);
					empty_soil-=1;	
				}
				
				
				else if(secim.equals("Hayir")) {
					durum=false;
				}
			}
			
			
			if (empty_soil==0) {
			  System.out.println("Bahcenizde ekecek alan kalmamistir");
			}
			
			
			break;
			
			
			
	     	case  "Violet":
			
			
			 System.out.println("Bahcenize 1 adet Menekse eklendi");
			 setNumber_of_violet(getNumber_of_violet()+1);	
			 empty_soil-=1;
			
			 while(durum && empty_soil!=0) {
				 
				System.out.println("Bahceye 1 Menekse daha eklemek ister misiniz (Evet/Hayir)"); 
				secim=scan.nextLine();
			
				
				if(secim.equals("Evet")) {
					System.out.println("Bahceye 1 Menekse daha eklendi");
					empty_soil-=1;
					setNumber_of_violet(getNumber_of_violet()+1);	
				}
				
				else if(secim.equals("Hayir")) {
					durum=false;
				}
				}
		
			if (empty_soil==0) {	
				System.out.println("Bahcenizde ekecek alan kalmamistir");
			    }
			
			
			break;
			
			
			
		     case "Lily":
			
		     System.out.println("Bahcenize 1 adet Zambak eklendi");
			 empty_soil-=1;
			 setNumber_of_lily(getNumber_of_lily()+1);
				
				while(durum && empty_soil!=0) {
					System.out.println("Başka Zambak eklemek istiyor musunuz? (Evet/Hayir)");
					String secim=scan.nextLine();
					
					if(secim.equals("Evet")) {
					System.out.println("Bahcenize 1 adet Zambak eklendi");
					empty_soil-=1;
					 setNumber_of_lily(getNumber_of_lily()+1);
					}
					
					else if (secim.equals("Hayir")) {
						
						durum=false;
					}
					
					
					
				}
	          if (empty_soil==0) {	
		       System.out.println("Bahcenizde ekecek alan kalmamistir");
	           }
				

			break;
			
			
			
		        case "0":
			    System.out.println("Ana menuye donuluyor");
			   return;
		       }
		       }
		
		else {
			System.out.println("Cicek ekecek alaniniz yoktur");
		}
		
		
		
		
		
	}

	
	public void BahceyiGoster() {
		
	
		System.out.println("Bahcenize Hos geldiniz");
		System.out.println("********************************");
		System.out.println("Bahcenizde "+getNumber_of_roses()+"adet gul vardir");
		System.out.println("Bahcenizde "+getNumber_of_daisy()+"adet papatya vardir");
		System.out.println("Bahcenizde "+getNumber_of_violet()+"adet menekse vardir");
		System.out.println("Bahcenizde "+getNumber_of_lily()+"adet zambak vardir");
		System.out.println("Bahcenizde "+ empty_soil + " adet bos alan vardir");
	
	     }
	
	
	
	public void CicekSok() {
	boolean kontrol=true;
	while(kontrol) {
	if(getNumber_of_daisy()>0 || getNumber_of_lily()>0 || getNumber_of_roses()>0 || getNumber_of_violet()>0) {
		
		System.out.println("Bahcenizde "+getNumber_of_roses()+" adet gul vardır" );
		System.out.println("Bahcenizde "+getNumber_of_daisy()+" adet papatya vardır" );
		System.out.println("Bahcenizde "+getNumber_of_violet()+" adet menekse vardır" );
		System.out.println("Bahcenizde "+getNumber_of_lily()+" adet zambak vardır" );
		System.out.println("*******************************************************");
		System.out.println("Hangi cicegi sokmek istersiniz");
		System.out.println("Rose(Gul)\nDaisy(Papatya)\nViolet(Menekse)\nLily(Zambak)");
		System.out.println("Ana menuye donmek icin 0 ı tuslayin");
		secim=scan.nextLine();
		
		
		if(secim.equals("Rose")) {
			
			setNumber_of_roses(getNumber_of_roses()-1);
			System.out.println("Bahcenizden 1 adet gul sokuldu");
			empty_soil++;
			System.out.println("Bahcenizde kalan gul sayisi "+ getNumber_of_roses());
			System.out.println("Bahcenizdeki bos toprak sayisi "+empty_soil);
		}
		else if (secim.equals("Daisy")) {
			
			setNumber_of_daisy(getNumber_of_daisy()-1);
			System.out.println("Bahcenizden 1 adet Papatya sokuldu");
			empty_soil++;
			System.out.println("Bahcenizde kalan Papatya sayisi "+ getNumber_of_daisy());
			System.out.println("Bahcenizdeki bos toprak sayisi "+empty_soil);
		}
        else if (secim.equals("Violet")) {
			
			setNumber_of_daisy(getNumber_of_violet()-1);
			System.out.println("Bahcenizden 1 adet Menekse sokuldu");
			empty_soil++;
			System.out.println("Bahcenizde kalan Menekse sayisi "+ getNumber_of_violet());
			System.out.println("Bahcenizdeki bos toprak sayisi "+empty_soil);
		}
		
 else if (secim.equals("Lily")) {
			
			setNumber_of_daisy(getNumber_of_lily()-1);
			System.out.println("Bahcenizden 1 adet Zambak sokuldu");
			empty_soil++;
			System.out.println("Bahcenizde kalan Zambak sayisi "+ getNumber_of_lily());
			System.out.println("Bahcenizdeki bos toprak sayisi "+empty_soil);
		}
 else if(secim.equals("0")) {
	 
	 return;
 }
	}
	
	else 
	{
		System.out.println("Bahcenizde hic cicek yoktur");
		System.out.println("Ana menuye donuluyor");
		kontrol=false;
	}		
	}
	}
	
	public int durum() {
		
		String[] durumlar ={"Çiçeklerinizin büyümesi için su gerekiyor","Çiçekleriniz büyümek için gübreye ihtiyaç duyuyor"};
		System.out.println("Eğer bahcenizde çiçek yoksa işlem yapmanıza gerek yok ana menu için 0 a basınız\n");
		int gubre=10;
		int su=10;
		int secim;
		Random rand=new Random();
		if(getNumber_of_daisy()>0 || getNumber_of_lily()>0 || getNumber_of_roses()>0 || getNumber_of_violet()>0 ) {
		int randomIndex=rand.nextInt(durumlar.length);
		String randomDurum=durumlar [randomIndex];
		System.out.println(randomDurum+"\n");
		
		
		if(randomDurum.equals("Çiçeklerinizin büyümesi için su gerekiyor")) {
			
			String islemler ="1-Çiçeklere su ver"+"\n2-Çiçeklere gübre ver"+"\n3-Hiçbir şey yapma";
			System.out.println(islemler);
			
			secim=scan.nextInt();
			
			switch(secim) {
			
			case 1:
				
				System.out.println("Çiçeklerinize su verildi");
				su=empty_soil;
				System.out.println("Kalan su:"+su);
				
				break;
				
			case 2:
				
				
				System.out.println("Çiçeklerinize gubre verildi");
				gubre=empty_soil;
				System.out.println("Kalan gubre:"+gubre);
				break;
				
				
				
			case 3:
				
				System.out.println("Beklemeyi sectiniz");
				System.out.println("Çiçekleriniz kurudu");
				setNumber_of_daisy(0);
				setNumber_of_lily(0);
				setNumber_of_roses(0);
				setNumber_of_violet(0);
				
				System.out.println("Bahçenizde kalan çiçek sayısı=0");
				empty_soil=5;
				System.out.println("Bahçenizdeki boş alan"+empty_soil);
				
				break;
				
			
		
			}
			
			
			
		}
		else{
			int ana_menu=scan.nextInt();
			System.out.println("Ana menuye gitmek için 0'a basınız");
			if(ana_menu==0) {
				return 0;
			}
			
			
		}
		}
		return 1;
	}
	

}