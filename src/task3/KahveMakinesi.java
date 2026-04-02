package task3;

import java.util.Scanner;

public class KahveMakinesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // TODO 1
        String hangiKahve = "";
        while (true) {
            System.out.println("Hangi kahveyi istersiniz? (Türk Kahvesi - Filtre Kahve - Espresso) ");
            hangiKahve = input.nextLine();

            if (hangiKahve.equalsIgnoreCase("Türk Kahvesi")) {
                System.out.println(hangiKahve + " ->Türk kahvesi hazırlanıyor...");
                break;
            }
            else if (hangiKahve.equalsIgnoreCase("Filtre Kahve")) {
                System.out.println(hangiKahve + " ->Filtre kahve hazırlanıyor...");
                break;
            }
            else if (hangiKahve.equalsIgnoreCase("Espresso")) {
                System.out.println(hangiKahve + " ->Espresso hazırlanıyor...");
                break;
            }
            else {
                System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin.");
            }
        }

        // TODO 2
        String sut = "";
        while (true) {
            System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız):");
            sut = input.nextLine();

            if (sut.equalsIgnoreCase("evet")) {
                System.out.println("Süt ekleniyor...");
                break;
            }
            else if (sut.equalsIgnoreCase("hayır") || sut.equalsIgnoreCase("hayir")) {
                System.out.println("Süt eklenmiyor.");
                break;
            }
            else {
                System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin.");
            }
        }

        // TODO 3
        String seker = "";
        int kacSeker = 0;

        while (true) {
            System.out.println("Şeker ister misiniz? (Evet veya Hayır olarak cevaplayınız):");
            seker = input.nextLine();

            if (seker.equalsIgnoreCase("evet")) {
                System.out.print("Kaç şeker istersiniz?: ");
                kacSeker = input.nextInt();
                input.nextLine();
                System.out.println(kacSeker + " şeker ekleniyor.");
                break;
            }
            else if (seker.equalsIgnoreCase("hayır") || seker.equalsIgnoreCase("hayir")) {
                System.out.println("Şeker eklenmiyor.");
                break;
            }
            else {
                System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin.");
            }
        }

        // TODO 4
        String boyut = "";
        while (true) {
            System.out.println("Hangi boyutta istersiniz? (Büyük - Orta - Küçük olarak giriniz.) : ");
            boyut = input.nextLine();

            if (boyut.equalsIgnoreCase("büyük") || boyut.equalsIgnoreCase("buyuk")) {
                boyut = "Büyük";
                System.out.println("Kahveniz " + boyut + " boyutta hazırlanıyor.");
                break;
            }
            else if (boyut.equalsIgnoreCase("orta")) {
                boyut = "Orta";
                System.out.println("Kahveniz " + boyut + " boyutta hazırlanıyor.");
                break;
            }
            else if (boyut.equalsIgnoreCase("küçük") || boyut.equalsIgnoreCase("kucuk")) {
                boyut = "Küçük";
                System.out.println("Kahveniz " + boyut + " boyutta hazırlanıyor.");
                break;
            }
            else {
                System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin.");
            }
        }

        // Sonuç
        System.out.println(hangiKahve + ", " + boyut.toLowerCase() + " boy, hazır. Afiyet olsun!");
    }
}