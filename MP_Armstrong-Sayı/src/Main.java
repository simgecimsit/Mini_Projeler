
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        /*
              Girilen bir sayının Armstrong sayı olup olmadığını bulmaya çalışalım.
        Örneğin 4 basamaklı bir sayının Armstrong sayısı olması için şu şartı sağlaması gereklidir.
        
        1634=1^4 +6^4 +3^4 +4^4 // 4 basamak sayısı
         371=3^3 +7^3 +1^3      //3 basamak sayısı
        
        Bu programı do-while döngüsü yardımıyla yapabiliriz.
        */
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayiyi Giriniz:");
        int sayi=scanner.nextInt();
        System.out.print("Basamak Sayisi:");
        int basamak_sayisi=scanner.nextInt();
        
        int gecici_sayi=sayi;
        int toplam=0;
        
        do{
            int basamak_degeri=gecici_sayi%10;
            gecici_sayi=gecici_sayi/10;      //gecici_sayi/=10;
            
            toplam+=Math.pow(basamak_degeri,basamak_sayisi);
            
            
        }while(gecici_sayi>0);
        
        
        if(sayi==toplam){
            System.out.println("Bu sayi bir armstrong sayisidir...");
        }
        else{
            System.out.println("Bu sayi bir armstrong sayisi degildir...");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
