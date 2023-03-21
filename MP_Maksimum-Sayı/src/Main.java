
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan alınan 3 sayı içerisinden en büyük olanını bulma.
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Birinci sayi:");
        int a=scanner.nextInt();
        System.out.print("Ikinci sayi:");
        int b=scanner.nextInt();
        System.out.print("Ucuncu sayi:");
        int c=scanner.nextInt();
        
        int maks=-1;
        
        
        if(a>=b && a>=c){
            maks=a;
        }
        else if(b>=a && b>=c){
            maks=b;
        }
        
        else{
            maks=c;
        }
        
        
        System.out.println("Maksimum sayi:" + maks);
    }
  
}
