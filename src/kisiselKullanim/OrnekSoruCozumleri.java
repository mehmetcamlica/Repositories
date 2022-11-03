package kisiselKullanim;

import java.util.Scanner;

public class OrnekSoruCozumleri {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        asalSayiKontrol();

    }

    private static void asalSayiKontrol() {
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();
        boolean kontrol = false;
        if (sayi > 0) {
            for (int i = 2; i < sayi - 1; i++) {
                if (sayi % i == 0) ;
                kontrol = true;
            }

        }
        if (kontrol == false) {
            System.out.println("sayi asaldir");
        }else {
            System.out.println();
        }
    }
}