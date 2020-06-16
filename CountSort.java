/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countsort;

import java.util.Scanner;

/**
 *
 * @author ANSHUL
 */
public class CountSort {

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
        int[] countArr = new int[size];
        System.out.println("Enter the array <= size but greater than -1 : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
            countArr[i] = 0;
        }
        
        
        int min, max;
        
        min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
            }
        }
        
        max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        //countSort(arr, countArr);
        countSort (arr, max, min);
        System.out.println("\nSorted array by 1 : ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    
//    public static void countSort (int[] arr, int[] countArr)
//    {
//        for (int i = 0; i < arr.length; i++)
//        {
//            countArr[arr[i] - 1]++;
//        }
//        
//        System.out.println("Count Array : ");
//        for (int i = 0; i < countArr.length; i++)
//        {
//            System.out.print(" " + countArr[i]);
//        }
//        
//        int k = 0;
//        
//        for (int j = 0; j < countArr.length; j++)
//        {
//            for (int l = 0; l < countArr[j]; l++)
//            {
//                arr[k++] = j + 1;
//            }
//        }
//        
////        System.out.print("\nArray : ");
////        for (int x = 0; x < arr.length; x++)
////        {
////            System.out.print(" "+arr[x]);
////        }
//    }
    
    public static void countSort (int[] arr, int max, int min)  //more efficient way in which size is optimized
    {
        
        int[] countArr = new int[(max - min) + 1];
        //System.out.println("" + countArr[0]);
        for (int i = 0; i < arr.length; i++)
        {
            countArr[arr[i] - min]++;
        }
        
        System.out.println("Count Array : ");
        for (int i = 0; i < countArr.length; i++)
        {
            System.out.print(" " + countArr[i]);
        }
        
        int k = 0;
        
        for (int j = 0; j < countArr.length; j++)
        {
            for (int l = 0; l < countArr[j]; l++)
            {
                arr[k++] = j + min;
            }
        }
                
    }
}
