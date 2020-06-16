/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.Scanner;

/**
 *
 * @author ANSHUL
 */
public class InsertionSort {

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
        
        insertionSort(arr);
        System.out.println("\nSorted array by 1 : ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    
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
    
    public static void insertionSort(int[] arr)
    {
        int j;
        for (int i = 0; i < arr.length; i++)
        {
            j = i;
            while (j > 0)
            {
                if (arr[j] < arr[j-1])
                {
                    swap(arr, j, j-1);
                }
                j--;
            }
            
            System.out.print("\nArray : ");
            for (int k = 0; k < arr.length; k++)
            {
                System.out.print(" "+arr[k]);
            }
        }
    }
}
