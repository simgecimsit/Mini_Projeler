
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        // a ve b dik kenarlar, h ise hipotenüs
        Scanner scanner=new Scanner(System.in);
        
        int a;
        int b;
        System.out.print("Birinci kenar:");
        a=scanner.nextInt();
        System.out.print("Ikinci kenar:");
        b=scanner.nextInt();
        
        double h=Math.sqrt(a*a + b*b); //Karekök alma --->Math.sqrt()
        System.out.println("Hipotenus:" +h);
        
                
        
        
    }
}
