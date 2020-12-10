/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keresztmetszet;

import java.util.Scanner;

/**
 *
 * @author danko
 */
public class Keresztmetszet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n Keresztmetszet\nDankó István Levente 113C");
        
        Scanner bemenet;
        bemenet=new Scanner(System.in);
        char val;
        do{

//      2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 5 és 10 között.

        int elemszam=(int) (Math.random()*6)+5;               //azonos elemszam gerator!   
        
//      1. Hozz létre HÁROM azonos elemszámú tömböt: szamtomb1, szamtomb2, szamtomb3 néven!  
        int [] szamtomb1=new int[elemszam];                   //azonos elemszam 
        int [] szamtomb2=new int[elemszam];
        int [] szamtomb3=new int[elemszam];
        
//    3. Az elemek a -100 és +100 értéktartományba essenek.
         for (int i = 0; i < elemszam; i++) {
           szamtomb1[i] = (int) (Math.random()*201)-100;           //generál -100 és 100 között
           szamtomb2[i] = (int) (Math.random()*201)-100;   
           szamtomb3[i] = (int) (Math.random()*201)-100;   
        }
//    4. Írasd ki a három tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
        System.out.println("Szamtomb1 tömb elemei:");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%,4d",  szamtomb1[i])+" ");    // (String.format("%,4d") ez felel a helyiértékért!
        }
        System.out.println("\n");
        System.out.println("Szamtomb2 tömb elemei:");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%,4d",  szamtomb2[i])+" ");   // (String.format("%,4d") ez felel a helyiértékért!
        }
        System.out.println("\n");
        System.out.println("Szamtomb3 tömb elemei:");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%,4d", szamtomb3[i])+" ");    // (String.format("%,4d") ez felel a helyiértékért!
        }
        System.out.println("\n");
        
       
        
//5. Írasd ki az azonos indexű tömbelemeket egymás mellé az összegükkel az alábbi módon (az 1. index esetén):  1. számok: 98 + 65 + 34 = 197
        int db=1;                           //szamlalo
        for (int i = 0; i < elemszam; i++) {
            int osszeg=szamtomb1[i]+szamtomb2[i]+szamtomb3[i];
            System.out.println(db++ +".számok:"+szamtomb1[i]+"+"+szamtomb2[i]+"+"+szamtomb3[i]+"="+osszeg );
            
        }
        System.out.println("\n");
       
//  6. Írasd ki a páros indexű tömbelemek legkisebb elemét.  Legkisebb számok:  56 (2. ), -44 (4.), -5 (6.), ...
        int index=2;                    //index és majd növekszik 2 esevel mivel paros kell 
        System.out.println("Legkisebb számok (indexenként):");
        for (int i = 0; i <=elemszam; i++) {
            if(index>elemszam || index>elemszam-1  ){break;}
            else if (szamtomb1[index]<szamtomb2[index] && szamtomb1[index]<szamtomb3[index]){
              System.out.println(String.format("Legkisebb:"+szamtomb1[index])+" ("+index+".)");
              index+=2;
            }
            else if (szamtomb2[index]<szamtomb1[index] && szamtomb2[index]<szamtomb3[index]){
               System.out.println(String.format("Legkisebb:"+szamtomb2[index])+" ("+index+".)");
               index+=2;
            }
            else if (szamtomb3[index]<szamtomb1[index] && szamtomb3[index]<szamtomb2[index]){
               System.out.println(String.format("Legkisebb:"+szamtomb3[index])+" ("+index+".)");
               index+=2;
            }

        }
 //  7. Fésüld össze a három tömböt egy közös tömbbe teljesTomb néven és írasd ki az elemeket sorbarendezve! 
            int [] teljes=new int [elemszam*3];    //háromszor kell az elemszám mivel összefésüljük a 3 azonos elemszam hosszu tömböt
            int teljesTombdb = 0;                   //szamlalo jelen esetben index
          
            
            for (int i = 0; i < elemszam; i++) {
               teljes[teljesTombdb++] += szamtomb1[i];
               teljes[teljesTombdb++] += szamtomb2[i];
               teljes[teljesTombdb++] += szamtomb3[i];
            }
// sorbarendezés
            for (int i = 0; i < teljesTombdb-1; i++) {
                for (int j = 0; j <teljesTombdb-i-1 ; j++) {
                     if (teljes[j]>teljes[j+1]){
                         int csere=teljes[j];                           //csere ebbe töltjük majd ebböl töltjük vissza
                         teljes[j]=teljes[j+1];
                         teljes[j+1]=csere;
                 }           
            }
        }
            System.out.println("\nA teljesTomb elemei:");   //kiiratjuk a teljes tombot
            for (int i = 0; i < teljesTombdb; i++) {
               System.out.print(String.format("%,4d", teljes[i]) + " ");

      }
// 8. Írasd ki azokat az elemeket, melyekből több is található a teljesTombben! (sorbarendezés tételét gondold újra....)

            System.out.println("\n");
            System.out.println("Több is szerepel belőlük a teljes tömbben:");
            
            int len=-1;                                              //szamlalo
            int ho=0;                                               //szamlalo
            for (int j = 0; j < teljesTombdb-1 ; j++) {
                if (teljes[j]==teljes[j+1]){
                     len+=1;   
                     ho+=1;
                     int tobb [] =new int[ho];
                     tobb[len]+=teljes[j];
                     System.out.println(tobb[len]+" ");
                 }
                     }
            if (len==-1){System.out.println("Nincs ilyen szam!");} 
               
                            
           
            
            
        
           
           
  //  9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...
            System.out.println("\n");
            System.out.print("Szeretnéd újra futtatni a programot? Ha igen üss egy 'i' betűt!\nHa nem üss egy 'n' karaktert!");
            val = bemenet.nextLine().toLowerCase().charAt(0);
            }while (val == 'i');  
            bemenet.close();
         
            
        }
       
        
    }
    
