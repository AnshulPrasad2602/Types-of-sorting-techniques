/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Scanner;

/**
 *
 * @author ANSHUL
 */
public class SelectionSort {

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
        selectionSort1(arr);
        System.out.println("\nSorted array by 1 : ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        
        selectionSort2(arr2);
        System.out.println("\nSorted array by 1 : ");
        for (int i = 0; i < arr2.length; i++)
        {
            System.out.print(" "+arr2[i]);
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
    
    public static void selectionSort1 (int[] arr)   //lowest element at start
    {
        int low, num;
        for (int i = 0; i < arr.length - 1; i++)
        {
            low = arr[i];
            num = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (low > arr[j])
                {
                    low = arr[j];
                    num = j;
                }
            }
            swap (arr, num, i);
            System.out.print("\nArray : ");
            for (int k = 0; k < arr.length; k++)
            {
                System.out.print(" "+arr[k]);
            }
        }
        
    }
    
    public static void selectionSort2 (int[] arr)   //highest element at end
    {
        int high, num;
        for (int i = arr.length - 1; i > -1; i--)
        {
            high = arr[i];
            num = i;
            for (int j = i - 1; j > -1; j--)
            {
                if (high < arr[j])
                {
                    high = arr[j];
                    num = j;
                }
            }
            swap (arr, num, i);
            System.out.print("\nArray : ");
            for (int k = 0; k < arr.length; k++)
            {
                System.out.print(" "+arr[k]);
            }
        }
        
    }
}
