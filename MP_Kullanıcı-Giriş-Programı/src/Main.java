
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        // While döngüsü kullanarak bir kullanıcı giriş programı yapalım.
        
        
       Scanner scanner=new Scanner(System.in);
       
       int giris_hakki=3;
        
        String sys_kullanici_adi="Simge";
        String sys_parola="abcde";
        
        System.out.println("#####################################################");
        System.out.println("Kullanici Girisine Hosgeldiniz...");
        System.out.println("#####################################################");
         
         
         
         while(true){
             
             System.out.print("Kullanici Adi:"); 
            String kullanici=scanner.nextLine();
            
             System.out.print("Parola:");
             String parola=scanner.nextLine();
             
         //    parola==sys_parola;// Bu şekilde bir kullanım yanlış olur. Stringleri direk eşitleyemeyiz.
             
           //  parola.equals(sys_parola);
           
           if(kullanici.equals(sys_kullanici_adi)  && parola.equals(sys_parola)){
               System.out.println("Hosgeldiniz ," +kullanici);
               break;
           }
           else if(kullanici.equals(sys_kullanici_adi) &&  !parola.equals(sys_parola)){
               System.out.println("Parolaniz Hatali!!");
               giris_hakki-=1;
               System.out.println("Giris Hakki:" +giris_hakki);
           }
     
           else if(!kullanici.equals(sys_kullanici_adi) &&  parola.equals(sys_parola)){
               System.out.println("Kullanici Adi Hatali!!");
               giris_hakki-=1;
                System.out.println("Giris Hakki:" +giris_hakki);
           
         }
           else{
               System.out.println("Kullanici Adiniz ve Parolaniz Hatali !!!");
               giris_hakki-=1;
                System.out.println("Giris Hakki:" +giris_hakki);
           }
         
           
           
           
           if(giris_hakki==0){
               System.out.println("Giris Hakkiniz Bitti. Tekrar Bekleriz...");
               break;
           }
         
         
      } 
         
         
         
         
         
         
         
         
         
         
    }
}
