
package osszetett.feladat;
import java.util.Scanner;

public class OsszetettFeladat {


    public static void main(String[] args) {
 System.out.println("\n ÖSSZETETT FELADATSOR\nDankó István Levente 113C");
        Scanner bemenet = new Scanner(System.in);
        char valasz;
        do{
            int darabszam = (int) (Math.random() * 10 + 30);
        
        int szamok1[] = new int[darabszam];
        int szamok2[] = new int[darabszam];

        for (int i = 0; i < darabszam; i++) {
            szamok1[i] = (int) (Math.random() * -50) + 50;
            szamok2[i] = (int) (Math.random() * -50) + 50;
        }
        System.out.println("\nA szamok1 tömb elemei: ");
        for (int i = 0; i < szamok1.length; i++) {
            System.out.print(String.format("%,4d", szamok1[i]) + " ");
        }
        System.out.println("\nA szamok2 tömb elemei: ");
        for (int i = 0; i < szamok2.length; i++) {
            System.out.print(String.format("%,4d", szamok2[i]) + " ");
        }

        int ujTomb[] = new int[darabszam];
        int ujTombdb = 0;
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] % 5 == 0) {
                ujTomb[i] = szamok1[i];
            }
        for (int j = 0; j < darabszam; j++) {
            if (szamok2[j] % 5 == 0){
                ujTomb[j+1] = szamok2[j];
            }    
        } 
        }
        System.out.println("\nAz ujTomb elemei: ");
        for (int i = 0; i < ujTomb.length; i++) {
            System.out.print(String.format("%,4d", ujTomb[i]) + " ");
        }
        
        int legkisebb = ujTomb[0];
        int legnagyobb = ujTomb[0];
            for (int i = 1; i < ujTomb.length; i++) { 
                if (ujTomb[i] > legnagyobb) {
                    legnagyobb = ujTomb[i];
                }
            }
        for (int i = 0; i < ujTomb.length; i++) {
            if (ujTomb[i] < legkisebb) {
                legkisebb = ujTomb[i];
            }
        }
        
            System.out.println("\nA legnagyobb elem: " + legnagyobb + ", a legkisebb elem: " + legkisebb);
        
        for (int i = 0; i < ujTomb.length; i++) {
            if (ujTomb[i] == 0) {
                System.out.println("Az ujTomb 0-t tartalmaz");
                break;
            }
        }
        System.out.println("Újra lefuttatja a programot? i/n: ");
        valasz = bemenet.next().charAt(0);
    } while ((valasz == 'i') || (valasz == 'I'));
}
}
