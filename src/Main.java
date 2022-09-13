import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        double indirimlitutar,yasindirim=0,normaltutar = 0;
        int mesafe, yas, tip;
        System.out.println("Mesafeyi km türünden giriniz :");
        mesafe = input.nextInt();
        System.out.println("Yaşınızı giriniz :");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        tip = input.nextInt();

        if (mesafe < 0 || yas < 0) {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        normaltutar = mesafe * 0.1;
        if (yas < 12) {
            yasindirim = normaltutar * 0.5;
        } else if (yas >= 12 && yas <= 24) {
            yasindirim = normaltutar * 0.1;
        } else if (yas > 65) {
            yasindirim = normaltutar * 0.3;
        }

        switch (tip) {
            case 1:
                indirimlitutar=normaltutar-yasindirim;
                System.out.println("Toplam Tutar:" + indirimlitutar);
                break;
            case 2:
                double gidisdonus = normaltutar * 0.2;
                indirimlitutar = (normaltutar-yasindirim-gidisdonus)*2;
                System.out.println("Toplam Tutar:" + indirimlitutar);
                break;
            default:
                System.out.println("Hatalı Veri Girdiniz !");
                break;


        }*/
        double biletFiyati =0, mesafe, mesafeBasiUcret=0.10;
        int yas, yolculukTipi;
        boolean isHata=false;

        // Değişken Değerleri al
        Scanner sc = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz (Km) : ");
        mesafe = sc.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        yas = sc.nextInt();

        System.out.print("Yolculuk Tipini Giriniz (Tek Yön için: 1, Gidiş Dönüş için: 2): ");
        yolculukTipi = sc.nextInt();

        biletFiyati=mesafe*mesafeBasiUcret;

        // yolculuk tipine göre tutar hesapla
        switch (yolculukTipi){
            case 1:
                biletFiyati= biletFiyati*1;
                break;
            case 2:
                // Gidiş-Dönüş iki bilet olacağı için 2 ile çarpıldı ve %20 ((1-0.2)= 0.8) uygulandı.
                biletFiyati*=2*0.8;
                break;
            default:
                isHata=true;
                break;
        }

        if (!isHata){
            if (0<yas && yas<12){
                biletFiyati*=0.5;
                System.out.println("Bilet Fiyatınız: " + biletFiyati+" TL");
            } else if (12<=yas && yas<24) {
                biletFiyati*=0.9;
                System.out.println("Bilet Fiyatınız: " + biletFiyati+" TL");
            } else if (24<=yas && yas<65) {
                biletFiyati=biletFiyati*1;
                System.out.println("Bilet Fiyatınız: " + biletFiyati+" TL");
            }else if (yas>65) {
                biletFiyati*=0.7;
                System.out.println("Bilet Fiyatınız: " + biletFiyati+" TL");
            }else {
                System.out.println("Hatalı Veri Girdiniz");
            }
        }else {
            System.out.println("Hatalı Yolculuk Tipi Girdiniz. Lütfen 1 veya 2 Giriniz");
        }

    }
}