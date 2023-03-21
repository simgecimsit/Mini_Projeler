
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        
        /*Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı bilgileri alınarak 
           sürücünün ödemesi gereken yakıt tutarını hesaplama
        */
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Araciniz kilometrede kac TL yakiyor? (Ornek:1,50):");
        double TL=scanner.nextDouble();
        System.out.print("Aracinizla kac kilometre gittiniz? :");
        int km=scanner.nextInt();
        System.out.println("Toplam odemeniz gereken tutar:"+(TL*km)+" TL dir");
        
        
    }
}
