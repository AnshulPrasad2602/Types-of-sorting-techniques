/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radixsort;

import java.util.Scanner;

/**
 *
 * @author ANSHUL
 */
public class RadixSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int size;
        System.out.println("Enter size of array : ");
        size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the array : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        //int[] arr = { 4725, 4586, 1330, 8792, 1594, 5729 };
        radixSort(arr, 10, 4);
        
        System.out.println("\nSorted array by 1 : ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    
    
    public static void radixSort (int[] arr, int radix, int width)
    {
        for (int i = 0; i < width; i++)
        {
            radixSingleSort (arr, i, radix);
        }
    }
    
    public static void radixSingleSort (int[] arr, int position, int radix)
    {
        int numItems = arr.length;
        
        int[] countArr = new int[radix];
        
        for (int value : arr)
        {
            countArr[getDigit (position, value, radix)]++;
        }
        
        //Adjusting the count array
        
        for (int i = 1; i < radix; i++)
        {
            countArr[i] += countArr[i - 1];
        }
        
        int[] temp = new int[numItems];
        
        for (int i = numItems - 1; i >= 0; i--)
        {
            temp[--countArr[getDigit (position, arr[i], radix)]] = arr[i];
        }
        
        for (int i = 0; i < numItems; i++)
        {
            arr[i] = temp[i];
        }
        
        System.out.print("\nArray : ");
        for (int k = 0; k < arr.length; k++)
        {
            System.out.print(" "+arr[k]);
        }
    }
    
    public static int getDigit (int position, int value, int radix)
    {
        int digit;
        
        digit = value / (int) Math.pow (radix, position) % radix;
        
        return digit;
    }
}
