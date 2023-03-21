
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        /*
         Kullanıcıdan Vize1 ,Vize2 ve Final notunu alarak bir harf hesaplama sistemi yapalım.
         Ayrıca kullanıcıdan okuldaki genel ortalamayı alarak ,
        DD alma ve 2.50 nin altında olma koşuluna göre ekrana bir tavsiye mesajı yazalım.
        
        Vize1 toplam notun %30 una etki edecek.
        Vize2 toplam notun %30 una etki edecek.
        Final toplam notun %40 ına etki edecek.
        
        Toplam Not >=90 ----> AA
        Toplam Not >=85 ----> BA
        Toplam Not >=80 ----> BB
        Toplam Not >=75 ----> CB
        Toplam Not >=70 ----> CC
        Toplam Not >=65 ----> DC
        Toplam Not >=60 ----> DD
        Toplam Not >=55 ----> FD
        Toplam Not <55  ----> FF
        
         */
        
        Scanner scanner =new Scanner(System.in);
        System.out.print("Vize1:");
        int vize1=scanner.nextInt();
        System.out.print("Vize2:");
        int vize2=scanner.nextInt();
        System.out.print("Final:");
        int finalnot=scanner.nextInt();
        
        
        System.out.print("Okul Ortalamaniz (Ornek:2,75):");
        double ortalama=scanner.nextDouble();
        double toplamNot=(vize1* 3/10.0)+(vize2* 3/10.0)+(finalnot* 4/10.0);
        
        if(toplamNot>=90){
            System.out.println("AA aldiniz...");
        }
        else if(toplamNot>=85){
            System.out.println("BA aldiniz...");
        }
        else if(toplamNot>=80){
            System.out.println("BB aldiniz...");
        }
        else if(toplamNot>=75){
            System.out.println("CB aldiniz...");
        }
        else if(toplamNot>=70){
            System.out.println("CC aldiniz...");
        }
        else if(toplamNot>=65){
            System.out.println("DC aldiniz...");
        }
        else if(toplamNot>=60){
            System.out.println("DD aldiniz...");
            if(ortalama<2.50)
            {
                System.out.println("DD aldiniz ve Not Ortalamaniz Dusuk. Bu dersi tekrardan almayi dusunebilirsiniz...");
            }
        }
        else if(toplamNot>=55){
            System.out.println("FD aldiniz ve Kaldiniz...");
        }
        else{
            System.out.println("FF aldiniz ve Kaldiniz...");
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
