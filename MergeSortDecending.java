/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Scanner;
import static mergesort.MergeSort.mergeSort;


/**
 *
 * @author ANSHUL
 */
public class MergeSortDecending 
{
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
        
        mergeSort(arr, 0, arr.length);
        
        System.out.println("\nSorted array by 1 : ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
     
     public static void mergeSort (int[] arr, int start, int end)
    {
        int mid = (start + end) / 2;
        
        if (end - start < 2)   //terminating condition
        {
            return;
        }
        
        mergeSort (arr, start, mid);    //left array
        mergeSort (arr, mid, end);  //right array
        merge (arr,start, mid, end);    //merging while sorting
    }
    
    public static void merge (int[] arr, int start, int mid, int end)
    {
        if (arr[mid - 1] >= arr[mid])   //terminating condition, shows already in sorted position
        {
            return;
        }
        
        int i = start;
        int j = mid;
        int tempInd = 0;
        
        int[] temp = new int[end - start];
        
        while (i < mid && j < end)
        {
            if (arr[i] >= arr[j])   //sorting and putting in temporary array
            {
                temp[tempInd++] = arr[i++];
            }
            else
            {
                temp[tempInd++] = arr[j++];
            }
        }
        
        //2 while loops for coping remaining elements of left and right array
        while (i < mid) 
        {
            temp[tempInd++] = arr[i++];
        }
        
        while (j < end)
        {
            temp[tempInd++] = arr[j++];
        }
        
        //intstead of while loop you can use this
        
        //System.arraycopy (arr, i, arr, start + tempInd, mid - i);
        
        //coping temporary array to main array
        
        System.arraycopy(temp, 0, arr, start, tempInd);
        
        //OR you can use loop for coping
        
//        int l = start;
//        
//        for (int x = 0; x < tempInd; x++)
//        {
//            arr[l++] = temp[x];
//        }

        //printing each interation
        System.out.print("\nArray : ");
        for (int k = 0; k < arr.length; k++)
        {
            System.out.print(" "+arr[k]);
        }
    }
}


