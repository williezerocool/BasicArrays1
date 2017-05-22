/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicarrays1;

/**
 *
 * @author kendrabooker
 */
public class BasicArrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        for(int i=0; i<10; i++){
        
            int arr[] = new int[10];
            arr[i] = -113;
            System.out.println("slot " + i + " contains a " + arr[i]);
        }
        
    }
    
}
