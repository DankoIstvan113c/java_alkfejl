
package megszamlalas;

public class Megszamlalas {

    public static void main(String[] args) {
     System.out.println("\n\tMEGSZÁMLÁLÁS TÉTELE\n");
     int[] tomb = new int [5];
     
     int szamlalo=0; //számláló változó létrehozása a dbszámok eltárolásához
     int parosSzamlalo=0;
     for (int i=0;i < 5; i++){
         tomb[i] = (int) (Math.random() * 99) +1;
         szamlalo++; //minden szám előállításakor nő az értéke eggyel
          if (tomb[i]%2==0) {
             parosSzamlalo++;
         }
     }
     System.out.print("A tömb elemei: \n");
     for (int i = 0; i < 5; i++) {
         System.out.print(i+1+". elem: "+" ");
          if (tomb[i]%2!=0) {
              System.out.print("páratlan");
          } 
          else
         System.out.print(String.format("%,8d", tomb[i])+" \n");
     }
     System.out.println("");
     System.out.println(szamlalo+" elemű a tömbünk\n");
     System.out.println("Ebből a tömbből "+parosSzamlalo+" db paros szám van");
     
     System.out.println("Készítette: Dankó István Levente ");
    }
    }
