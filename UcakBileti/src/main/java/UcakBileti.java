import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int km, yas, yolculukTipi;
        double oran=0.1, fiyat, indirim;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz.(1 => Tek Yön, 2 => Gidiş Dönüş): ");
        yolculukTipi = input.nextInt();

        if(km<=0 || yas<=0){
            System.out.println("Hatalı veri girdiniz!");
        }
        if(yolculukTipi!=1){
            if(yolculukTipi!=2){
                System.out.println("Hatalı veri girdiniz!");
            }
        }

        fiyat = km * oran;

        if(yas>0 && yas<12){
            fiyat -= (fiyat/2);
        } else if(yas>=12 && yas<24){
            fiyat -= (fiyat/10);
        } else if(yas>65){
            fiyat -= ((fiyat*65)/100);
        }

        switch(yolculukTipi){
            case 2:
                fiyat -= (fiyat/5);
                fiyat *= 2;
                System.out.println("Toplam tutar: " + fiyat + " TL");
                break;
            case 1:
                System.out.println("Toplam tutar: " + fiyat + " TL");
        }



    }
}
