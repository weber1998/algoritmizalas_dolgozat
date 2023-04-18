
package rendezes;

import java.util.Random;

public class Rendezes {

    
    public static void main(String[] args) {
        int tomb[] = new int[10];
        feltolt(tomb);
        kiir(tomb);
        rend(tomb, 10);
        rendKiir(tomb);
        ell(tomb);
    }
    
    static void rend(int array[], int n) {
        
        int interval = n / 2;
        while(interval > 0) {
            for (int i = interval; i < n; i++) {
                int temp = array[i];
                int j = i;
                while(j >= interval && array[j - interval] > temp) {
                    array[j] = array[j - interval];
                    j -= interval;
                }
                array[j] = temp;
            }
            interval /= 2;
        }
    }
    
    static void feltolt(int array[]) {
        Random r = new Random();
        for(int i = 0; i < array.length; i++) {
            int rand = r.nextInt(100);
            array[i] = rand;
        }
    }
    
    static void kiir(int array[]) {
        System.out.print("A tömb elemei:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
    }
    
    static void rendKiir(int array[]) {
        System.out.print("A tömb elemei rendezve:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
    }
    
    static void ell(int array[]) {
        System.out.println("");
        int x = array[0];
        boolean hiba = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < x) {
                hiba = true;
            } else {
                x = array[i];
            }
        }
        if (hiba) {
            System.out.println("Nincs rendezve a tömb");
        } else {
            System.out.println("Rendezve van a tömb");
        }
    }
    
}
