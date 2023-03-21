
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        //Kullanıcıdan alınan iki sayının değerlerini değiştirme
        
        Scanner scanner=new Scanner(System.in);
        int birinci_sayi;
        int ikinci_sayi;
        System.out.print("Birinci Sayi:");
        birinci_sayi=scanner.nextInt();
        System.out.print("Ikici Sayi:");
        ikinci_sayi=scanner.nextInt();
        
        System.out.println("Degistirilmeden Once ...");
        System.out.println("Birinci Sayi:" +birinci_sayi +" Ikinci sayi:"+ikinci_sayi);
        int gecici=birinci_sayi;
        birinci_sayi=ikinci_sayi;
        ikinci_sayi=gecici;
        
        System.out.println("Degistirildikten Sonra...");
        System.out.println("Birinci Sayi:"+birinci_sayi + " Ikinci Sayi:"+ ikinci_sayi);
        
    }
}
