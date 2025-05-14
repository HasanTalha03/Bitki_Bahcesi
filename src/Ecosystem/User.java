package Ecosystem;

import java.util.Scanner;


public class User {
	
	
	

	public static void main(String[] args) {
		
		 
	 menu();
	
	}
	
	
	public static void menu() {
		int rose=0;
		int daisy=0;
		int violet=0;
		int lily=0;
		Garden cagir=new Garden(rose,daisy,violet,lily);
		int islem;
		Scanner scan=new Scanner(System.in);
		
		do {
			
			
			System.out.println("Bahce Simulasyonuna Hos Geldiniz");
			System.out.println("********************************");
			System.out.println("1)Onceden kurulu bir bahceniz varsa gormek icin 1'i");
			System.out.println("2)Cicek ekme islemine gecmek icin 2'yi");
			System.out.println("3)Cicek sokmek icin 3'ü");
			System.out.println("4)Simulasyondan cikmak icin 4'ü tuslayın");
			
			islem=scan.nextInt();
		
			
			
			 if (islem==1) {                               // Bahceyi goster
			
				cagir.BahceyiGoster();
			    cagir.durum();
			    
				
				
			}
			else if (islem==2) {                               //Cicek ekleme
				
				System.out.println("Cicek ekleme islemini sectiniz");

				cagir.AddFlower();
				
				
			}
			else if (islem==3) {                            //cicek sokme islemi
				
				cagir.CicekSok();
			
			}
			else if(islem==4) {                             // programdan cikis
				System.out.println("Programdan cikiliyor...");
				break;
			}
			
			
		}
	while(islem!=4);
		
	
		
		
		
scan.close();
	}
		
	}
		

