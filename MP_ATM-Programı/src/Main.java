
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        /*
            While döngüsü yardımıyla bir ATM programı yapalım.
        
          İşlemler
        1-Bakiye Öğrenme
        2-Para Çekme
        3-Para Yatırma
        4-Çıkış(q)
        
        
        */
        
        Scanner scanner =new Scanner(System.in);
        
        int bakiye=500;
        String islemler="1.islem: Bakiye Ogrenme \n"
                      + "2.islem: Para Cekme\n"
                      + "3.islem: Para Yatirma\n"
                      + "Cikis icin q ya basin";
        
        System.out.println("********************************************");
        System.out.println(islemler);
        System.out.println("********************************************");
        
        
        while(true){
            System.out.print("Islemi seciniz:");
            String islem=scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan Cikiliyor...");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiye:" +bakiye);
            }
            else if(islem.equals("2")){
                System.out.print("Cekmek istediginiz tutar:");
                int tutar=scanner.nextInt();
                scanner.nextLine(); //Hata 
                
                
                if(bakiye-tutar<0){
                    System.out.println("Yeterli Bakiye Yok. Bakiye:" +bakiye);
                }
                else{
                    bakiye-=tutar;
                    System.out.println("Yeni Bakiyeniz:" + bakiye);
                }
                
                
                
            }
            else if(islem.equals("3")){
                System.out.print("Yatirmak Istediginiz Tutar:");
                int tutar=scanner.nextInt();
                scanner.nextLine(); //Hata 
                
                bakiye+=tutar;
                System.out.println("Yeni Bakiyeniz:" +bakiye);
            }
            else{
                System.out.println("Gecersiz Islem...");
            }
            
        }
              
        
        
        
        
        
    }
}
