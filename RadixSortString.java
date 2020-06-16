/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radixsort;





/**
 *
 * @author ANSHUL
 */
public class RadixSortString 
{
    
    
    public static void radixSort (String[] arrString, int radix, int width)
    {
        for (int i = width - 1; i >= 0; i--)
        {
            radixSingleSort (arrString, i, radix);
        }
    }
    
    public static void radixSingleSort (String[] arrString, int position, int radix)
    {
        int numItems = arrString.length;
        
        int[] countArr = new int[radix];
        
        for (String value : arrString)
        {
            countArr[getIndex(position, value)]++;
        }
        
        //Adjusting the count array
        
        for (int i = 1; i < radix; i++)
        {
            countArr[i] += countArr[i - 1];
        }
        
        String[] temp = new String[numItems];
        
        for (int i = numItems - 1; i >= 0; i--)
        {
            temp[--countArr[getIndex(position, arrString[i])]] = arrString[i];
        }
        
        for (int i = 0; i < numItems; i++)
        {
            arrString[i] = temp[i];
        }
        
        System.out.print("\nArray : ");
        for (int k = 0; k < arrString.length; k++)
        {
            System.out.print(" "+arrString[k]);
        }
    }
    
    public static int getIndex(int position, String value) 
    {
        return value.charAt(position) - 'a';
    }
    
    public static void main(String[] args) 
    {
//        Scanner sc = new Scanner (System.in);
//        int size;
//        System.out.println("Enter size of array : ");
//        size = sc.nextInt();
//        
//        String[] arr = new int[size];
//        System.out.println("Enter the array : ");
//        for (int i = 0; i < arr.length; i++)
//        {
//            arr[i] = sc.nextInt();
//        }
        //int[] arr = { 4725, 4586, 1330, 8792, 1594, 5729 };
        String[] arrString = { "bcdef", "dbaqe", "abcde", "omadd", "bbbbb" };
        radixSort(arrString, 26, 5);
        
        System.out.println("\nSorted array by 1 : ");
        for (int i = 0; i < arrString.length; i++)
        {
            System.out.print(" "+arrString[i]);
        }
    }
}
