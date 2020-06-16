/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Scanner;

/**
 *
 * @author ANSHUL
 */
public class BubbleSort {

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
//        int[] arr2 = arr;
//        for (int i = 0; i < arr2.length; i++)
//        {
//            System.out.print(" "+arr2[i]);
//        }
//        int[] arr2 = new int[size];
//        arr2 = arr;
//        System.out.println("\nSorted array : ");
//        for (int i = 0; i < arr2.length; i++)
//        {
//            System.out.print(" "+arr2[i]);
//        }
        bubbleSort2(arr);
        //int[] arr2 = new int[size];
        //arr2 = arr;
        System.out.println("\nSorted array by 2 : ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        
        bubbleSort1(arr2);
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
    
    public static void bubbleSort1(int[] arr)   //biggest element go to last
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    swap (arr, j, j+1);
                }
            }
            System.out.print("\nArray : ");
            for (int k = 0; k < arr.length; k++)
            {
                System.out.print(" "+arr[k]);
            }
        }
    }
    
    public static void bubbleSort2(int[] arr)   //smallest element go to first
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    swap (arr, i, j);
                }
            }
            System.out.print("\nArray : ");
            for (int k = 0; k < arr.length; k++)
            {
                System.out.print(" "+arr[k]);
            }
        }
    }
}
