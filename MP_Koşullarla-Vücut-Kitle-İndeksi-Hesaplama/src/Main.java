
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        /*
        Kullanıcıdan alınan boy ve kilo değerlerine göre vücut kitle indeksini hesaplayalım 
        ve aşağıdaki kurallara göre ekrana yazdıralım.
        
        Vücut Kitle İndeksi=Kilo/Boy(m)*Boy(m)
        
        VKİ 18.5 in altındaysa ---->Zayıf
        VKİ 18.5 ile 25 arasındaysa ---->Normal
        VKİ 25 ile 30 arasındaysa ---->Fazla Kilolu
        VKİ 30 un üzerindeyse ---->Obez
        */
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kilonuzu girin:");
        int kilo=scanner.nextInt();
        System.out.print("Boyunuzu girin:(Ornek:1,65)");
        double boy=scanner.nextDouble();
        
        double vki= kilo/(boy*boy);
        System.out.println("Vucut Kitle Indeksiniz:" +vki);
        
        if(vki<=18.5){
            System.out.println("Zayıf");
        }
        
        else if(vki>=18.5 && vki<25){
            System.out.println("Normal");
        }
        
        else if(vki>=25 && vki<30){
            System.out.println("Fazla Kilolu");
        }
        
        else{
            System.out.println("Obez");
        }
        
        
        
        
    }
}
