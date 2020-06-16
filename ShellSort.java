/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shellsort;

import java.util.Scanner;

/**
 *
 * @author ANSHUL
 */
public class ShellSort 
{

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
        int[] arr2 = new int[size];
        System.out.println("Enter the array : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }
        
        shellSort(arr);
        System.out.println("\nSorted array by 1 : ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    
    public static void shellSort (int[] arr)
    {
        int gap = arr.length / 2;
        
        while (gap > 0)
        {
            for (int i = gap; i < arr.length; i++)
            {
                int j = i;
                
                while (j >= gap)
                {
                    if (arr[j - gap] > arr[j])
                    {
                        swap(arr, j - gap, j);
                    }
                    j -= gap;
                }
                
                System.out.print("\nArray : ");
                for (int k = 0; k < arr.length; k++)
                {
                    System.out.print(" "+arr[k]);
                }
            }
            
            gap = gap / 2;
        }
        
//        if (gap == 1)
//        {
//            insertionSort (arr);
//        }
    }
    
//    public static void shellSort (int[] arr)
//    {
//        int gap = arr.length / 2;
//        
//        while (gap > 0)
//        {
//            for (int i = gap; i < arr.length; i++)
//            {
//                int newEle = arr[i];
//                int j = i;
//                while ( j >= gap && arr[j - gap] > newEle)
//                {
//                    
//                    arr[j] = arr[j-gap];
//                    j = j - gap;
//                }
//                
//                arr[j] = newEle;
//                
//                System.out.print("\nArray : ");
//                for (int k = 0; k < arr.length; k++)
//                {
//                    System.out.print(" "+arr[k]);
//                }
//            }
//            
//            gap = gap / 2;
//        }
//        
////        if (gap == 1)
////        {
////            insertionSort (arr);
////        }
//    }
    
    public static void swap (int [] arr, int i, int j)
    {
        if (i == j)
        {
            return;
        }
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
