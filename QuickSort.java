/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Scanner;

/**
 *
 * @author ANSHUL
 */
public class QuickSort {

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
        
        quickSort(arr, 0, arr.length);
        
        System.out.println("\nSorted array by 1 : ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    
    public static void quickSort (int[] arr, int start, int end)
    {
        if (end - start < 2)
        {
            return;
        }
        
        int pivotIndex = partition (arr, start, end);
        quickSort (arr, start, pivotIndex);
        quickSort (arr, pivotIndex + 1, end);
    }
    
    public static int partition (int[] arr, int start, int end)
    {
        int pivot = arr[start];
        
        int i = start;
        int j = end;
        
        while (i < j)
        {
            //empty loop
            while ((i < j) && (arr[--j]) >= pivot);
            //j is finding smaller element than pivot from greater side of array (right)
            if (i < j)
            {
                arr[i] = arr[j];
                //coping smaller element to the start
            }
            
            //empty loop
            while ((i < j) && (arr[++i] <= pivot));
            //i is findind greater element than pivot from smaller side of array (left)
            if (i < j)
            {
                arr[j] = arr[i];
                //coping greater element to the end
            }
        }
        
        arr[j] = pivot;
        //j is final position of pivot in the array
        
        System.out.print("\nArray : ");
        for (int k = 0; k < arr.length; k++)
        {
            System.out.print(" "+arr[k]);
        }
        
        return j;
    }
}
