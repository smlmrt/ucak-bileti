import java.util.Scanner;

public class ticket{

    public static void main(String[] args){
        /*
         KM birim fiyatı 0.10 $
         12 yaşından küçükse toplam fiyattan %50 indirim
         12-24 yaş aralığı için %10 indirim
         65 yaşından  büyükse %30 indirim
         Gidiş/Dönüş alırsa %20 indirim
         */

        Scanner input = new Scanner(System.in);
        System.out.printf("Gidilecek mesafe kaç km: ");
        int KM = input.nextInt();
        System.out.printf("Yaşınız: ");
        int yas = input.nextInt();
        System.out.println("Bilet yönünü seçiniz: \n1.Gidiş \n2.Gidiş/Dönüş");
        int sec = input.nextInt();

        double normalFiyat,yasIndirimi,tipIndirimi;

        if (KM > 0 && yas > 0 && (sec == 1 || sec == 2)){
            normalFiyat = KM * 0.10;
            if (yas < 12){
                yasIndirimi = normalFiyat * 0.5;
            }else if (yas >= 12 && yas <= 24){
                yasIndirimi = normalFiyat * 0.10;
            }else if (yas >= 65){
                yasIndirimi = normalFiyat * 0.30;
            }else{
                yasIndirimi = 0;
            }
            normalFiyat -= yasIndirimi;
            if (sec == 2){
                tipIndirimi = normalFiyat * 0.20;
                normalFiyat = (normalFiyat - tipIndirimi) * 2;
            }

            System.out.printf("Bilet fiyatı: " + normalFiyat + " $");
        }else{
            System.out.println("Geçersiz bir işlem gerçekleştirdiniz.");
        }
    }
}