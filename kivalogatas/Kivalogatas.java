package kivalogatas;


public class Kivalogatas {


    public static void main(String[] args) {

        System.out.println("\n\tKIVÁLOGATÁS TÉTELE\n");
        int[] erdemjegyek=new int[5];
        int[] masolat=new int[5];
        
        System.out.println("Érdemjegyek: ");
        
        erdemjegyek[0]=1;
        erdemjegyek[1]=2;            
        erdemjegyek[2]=2;            
        erdemjegyek[3]=4;            
        erdemjegyek[4]=5;   
        
        for (int i =0; i <5; i++) {
            System.out.println(i+1+". jegy: "+String.format("%,2d", erdemjegyek[i]));
        }
        System.out.println("");
        
        int kettesekDb=0;
        for (int i =0; i < 5; i++) {
            if (erdemjegyek[i]==2) {
                masolat[kettesekDb++]=erdemjegyek[i];
            }
        }
        System.out.print("Másolat tömb elemei: ");
        for (int i = 0; i < kettesekDb; i++) {
            System.out.print(masolat[i]+" ");
        }
        System.out.println("\nKettesek száma: "+kettesekDb);
            }
        }
