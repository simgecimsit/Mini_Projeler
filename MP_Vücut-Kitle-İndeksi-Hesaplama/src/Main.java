
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        /* Kullanıcıdan alınan boy ve kilo verilerine göre Vücut Kitle İndeksini hesaplayalım.
        
           Vücut Kitle İndeksi = Kilo / Boy(m) * Boy(m)
        */
        
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kilonuzu girin:");
        int kilo=scanner.nextInt();
        System.out.print("Boyunuzu girin:(Ornek:1,65)");
        double boy=scanner.nextDouble();
        
        double VKİ= kilo/(boy*boy);
        System.out.println("Vucut Kitle Indeksiniz:" +VKİ);
        
        
        
        
        
        
        
        
    }
}
