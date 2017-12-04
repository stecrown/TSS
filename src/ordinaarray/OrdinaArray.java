/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordinaarray;

/**
 *
 * @author tss
 */
public class OrdinaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeri = {15, 2, 6, 8, 75, 4, 6, 1};
        boolean scambiato = true;

        while (scambiato) {
            scambiato = false;
            int index = 0;

            while (index < numeri.length - 1) {
                if (numeri[index] > numeri[index + 1]) {
                    //scambio
                    int tmp = numeri[index];
                    numeri[index] = numeri[index + 1];
                    numeri[index + 1] = tmp; 
                    scambiato = true;
                    
                }
                index++;
            }

        }
        for (int i = 0; i < numeri.length; i++) {
            int valore = numeri[i];
            System.out.println(valore);
            
        }
    }
}


        