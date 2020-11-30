package tombmuveletek;
import java.util.Scanner;


public class Tombmuveletek {


    public static void main(String[] args) {
/*Két, a felhasználó által megadott elemű, 1-1000 közti értéket tartalmazó random szám van.
Páronként egymás mellé kiíratva. Helyiértékre figyelni!*/
        System.out.println("\n\tTÖMBMŰVELETEK\n");
        Scanner bemenet=new Scanner(System.in);
        int elemSzam;
        System.out.print("Hány elemet tartalmazzanak a tömbök: ");
        elemSzam=bemenet.nextInt();
        
        //Tömbök deklarálása
        int tomb1[]=new int[elemSzam];
        int tomb2[]=new int[elemSzam];
        
        //Tömbök feltöltése
        for (int i = 0; i < elemSzam; i++) {
            tomb1[i]=(int)(Math.random()*999)+1;
            tomb2[i]=(int)(Math.random()*999)+1;
        }
        
        //Tömbök kiíratás
        System.out.print("A tömbök elemei: \n")
        for (int i =0; i < elemSzam; i++) {
            int sorOsszeg=0;
            sorOsszeg=tomb1[i]+tomb2[i];
            System.out.print(i+1+".: ");
            System.out.print(String.format("%,3d",tomb1[i])+" + ");
            System.out.print(String.format("%,3d",tomb2[i])+" - ");
            System.out.print(String.format("%,5d",sorOsszeg));
            System.out.println("");
        }    
        bemenet.close();       
    }
    
}