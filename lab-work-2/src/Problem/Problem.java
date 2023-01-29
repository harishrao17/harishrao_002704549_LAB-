/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem;

import java.util.Arrays;

/**
 *
 * @author Harish
 */
public class Problem {
    public static void main(String[] args){
        int[] array = {2,5,3,4,9,4,6,8,6,5};
        for (int i=0;i<array.length;i++){
            if(i%2==0){
                array[i]=array[i]*2;
            }
            else {
                array[i]=array[i]*3;
            }
        }
        System.out.println("Result-> " + Arrays.toString(array));
    }
    
}
