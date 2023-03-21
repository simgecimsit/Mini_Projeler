
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Switch-Case kullanarak 4 işlem yapan bir hesap makinası  tasarlayalım.
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("*******************************************");
        String islemler= "1.Toplama islemi\n"
                      +  "2.Cikarma islemi\n"
                      +  "3.Carpma islemi \n"
                      +  "4.Bolme islemi";
        
        System.out.println(islemler);
        System.out.println("*******************************************");
        
        System.out.print("Islemi Seciniz:");
        String islem=scanner.nextLine();
        
        int a;
        int b;
        
        
        switch(islem){
            case "1":
                System.out.print("Birinci sayi:");
                 a=scanner.nextInt();
                System.out.print("Ikinci sayi:");
                 b=scanner.nextInt();
                System.out.println(" Girilen Degerlerin Toplami=" +(a+b));
                break;
            case "2":
                System.out.print("Birinci sayi:");
                 a=scanner.nextInt();
                System.out.print("Ikinci sayi:");
                 b=scanner.nextInt();
                System.out.println("Girilen Degerlerin Farki=" +(a-b));
                break;
            
            case "3":
                System.out.print("Birinci sayi:");
                 a=scanner.nextInt();
                System.out.print("Ikinci sayi:");
                 b=scanner.nextInt();
                System.out.println("Girilen Degerlerin Carpimi=" +(a*b));
                break;
            case "4":
                System.out.print("Birinci sayi:");
                 a=scanner.nextInt();
                System.out.print("Ikinci sayi:");
                 b=scanner.nextInt();
                System.out.println("Girilen Degerlerin Bolumu =" +((double)a/b));
                break;
            default:
                System.out.println("Gecersiz islem ...");
        }
        
        
        
        
    }
}
