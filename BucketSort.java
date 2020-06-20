/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucketsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ANSHUL
 */
public class BucketSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] arr = { 54, 46, 83, 66, 95, 92, 43 };
        
        bucketSort(arr);
        
        System.out.println("Sorted Array -> ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
    
    
    public static void bucketSort(int[] arr)
    {
        List<Integer>[] buckets = new List[10];
        
        for (int i = 0; i < buckets.length; i++)
        {
            buckets[i] = new LinkedList<Integer>(); //or arraylist or vectors
        }
        
        for (int i = 0; i < arr.length; i++)    //puttuing values in buckets
        {
            int index = hash(arr[i]);
            buckets[index].add(arr[i]);
        }
        
        for (List b : buckets)
        {
            Collections.sort(b);
        }
        
        int j = 0;
        for (int i = 0; i < buckets.length; i++)
        {
            for (int value : buckets[i])
            {
                arr[j++] = value;
            }
        }
    }
    
    public static int hash(int value)
    {
        return value / (int) 10 % 10;
    }
}
