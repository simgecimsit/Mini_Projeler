
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       /*
        
        Faiz Uygulaması 
        Kullanıcıdan anapara  değerini ve parasını kaç yıl vadeli yatırmak istediği bilgilerini alıp 
        her sene sonunda toplam para miktarını ekranan yazdıralım.
        
        Faiz oranı: %6
        */ 
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bankamiza Hosgeldiniz.. Faiz orani: %6");
        
        
        int anapara;
        int vade;
        
        System.out.print("Yatirmak istediginiz tutar:");
        anapara=scanner.nextInt();
        System.out.print("Paranizi kac yil vadeli yatirmak istiyorsunuz?  :" );
        vade=scanner.nextInt();
        
        
        double toplampara=anapara;
        double faizOrani=0.06;
        
        
        for(int i=1; i<=vade; i++){
            
            toplampara=(toplampara*faizOrani)+toplampara;
            System.out.println(i+ ". yilin sonunda toplam para:" +(int)toplampara);
        }
        
    }
}
