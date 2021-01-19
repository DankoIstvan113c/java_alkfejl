  
/*
1. Hozz l�tre egy t�mb�t: szamok n�ven! x
2. A t�mb elemsz�ma 20 legyen.x
3. Az elemek a -50 �s +50 �rt�ktartom�nyba essenek.x
4. �rasd ki a t�mb elemeit egy sorban.x
5. Ekkor k�rdezd meg a felhaszn�l�t, mit szeretne tenni az adatokkal:
     1 - �sszeget sz�moltatni: t�mb�k �sszeg�t ki�ratni
     2 - sz�ls��rt�keket ki�ratni: legkisebb �s legnagyobb �rt�ket ki�ratni
     3 - van-e benne 40-50: megtudni, tartalmaz-e sz�mot 40 �s 50 k�z�tt?
     4 - 5-tel oszthat� p�ros sz�mok db-sz�ma: mennyi?
     5 - adott sz�mot tartalmazza-e: egy felhaszn�l�t�l bek�rt sz�mr�l mondja meg, h tartalmazza-e a t�mb, s ha igen, mi az indexe.
 */
package menu0119;

import java.util.Scanner;
import java.util.Random;

public class Menu0119 {


    public static void main(String[] args) {
        System.out.println("MEN� \n113C AB\n");

        int szamok[] = new int[20];

        for (int i = 0; i < 20; i++) {
            szamok[i] = (int) (Math.random() * 100) - 50;
        }
        System.out.println("\nA szamok t�mb elemei: ");
        for (int i = 0; i < szamok.length; i++) {
            System.out.print(String.format("%,4d", szamok[i]) + " ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nV�lasszon a men�b�l 1-t�l 5-ig!");
        System.out.println("\n1 - �sszeget sz�moltatni: t�mb�k �sszeg�t ki�ratni \n2 - sz�ls��rt�keket ki�ratni: legkisebb �s legnagyobb �rt�ket ki�ratni \n3 - van-e benne 40-50: megtudni, tartalmaz-e sz�mot 40 �s 50 k�z�tt? \n4 - 5-tel oszthat� p�ros sz�mok db-sz�ma: mennyi? \n5 - adott sz�mot tartalmazza-e: egy felhaszn�l�t�l bek�rt sz�mr�l mondja meg, h tartalmazza-e a t�mb, s ha igen, mi az indexe.");
        System.out.print("V�lasz: ");
        int valasztas = sc.nextInt();

        if (valasztas == 1) { // 1 - �sszeget sz�moltatni: t�mb�k �sszeg�t ki�ratni
            int szamokOsszege = 0;
            for (int i = 0; i < szamok.length; i++) {
                szamokOsszege += szamok[i];
            }
            System.out.print("A szamok tomb elemeinek �sszege: " + szamokOsszege);
        } else if (valasztas == 2) { //2 - sz�ls��rt�keket ki�ratni: legkisebb �s legnagyobb �rt�ket ki�ratni
            int max = 0;
            for (int i = 0; i < szamok.length; i++) {
                if (szamok[i] > max) {
                    max = szamok[i];
                }
            }
            System.out.println("A legnagyobb sz�m: " + max);

            int min = szamok[0];
            for (int i = 0; i < szamok.length; i++) {
                if (szamok[i] < min) {
                    min = szamok[i];
                }
            }
            System.out.println("A legkisebb sz�m: " + min);
        } else if (valasztas == 3) { //3 - van-e benne 40-50: megtudni, tartalmaz-e sz�mot 40 �s 50 k�z�tt? 
            for (int i = 0; i < szamok.length; i++) {
                if (szamok[i] >= 40) {
                    if (szamok[i] <= 50) {
                        System.out.println("A szamok lista tartalmaz 40 �s 50 k�z�tti sz�mot");
                        break;
                    } else {
                        System.out.println("A szamok lista nem tartalmaz 40 �s 50 k�z�tti sz�mot");
                        break;
                    }
                }
            }
        } else if (valasztas == 4) { // 4 - 5-tel oszthat� p�ros sz�mok db-sz�ma: mennyi?
            int darabszam = 0;
            for (int i = 0; i < szamok.length; i++) {
                if (szamok[i] % 2 == 0) {
                    if (szamok[i] % 5 == 0) {
                        darabszam++;
                    }
                }
            }
            System.out.println("Az �ttel oszthat� p�ros sz�mok darabsz�ma: " + darabszam);
        } else if (valasztas == 5) { // 5 - egy felhaszn�l�t�l bek�rt sz�mr�l mondja meg, h tartalmazza-e a t�mb, s ha igen, mi az indexe.
            System.out.print("Keresett sz�m: ");
            int bekert = sc.nextInt();
            for (int i = 0; i < szamok.length; i++) {
                if (szamok[i] == bekert) {
                    System.out.println("A keresett sz�m indexe: " + i + "\nA keresett sz�m a(z)" + (i+1) +". elem");
                }
            }
        }
    }
}