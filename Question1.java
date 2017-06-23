// considered duplicates,non-negative and negative numbers
// complexity O(n)

import java.util.*;

public class Question1
{

     public static void main(String []args)
     {
        int a [] = {1,5,2,6,5};
        int b [] = {3,4};
        System.out.println(sumOfTwo(a,b,15));
     }  
     
     public static boolean sumOfTwo(int a[], int b[], int v)
     {
         int c [];
         int d [];
         // find the bigger array
         {
             if (a.length <= b.length){
                c = b;
                d = a;
             }
             else{
                 c = a;
                 d = b;
             }
         }
         HashSet<Integer> set=new HashSet<Integer>();
         
         for (int i=0; i<c.length; i++)
         {
             set.add(c[i]);
             
         }
         
         boolean x;
         for (int i=0; i<d.length; i++)
         {
             x = set.contains(v-d[i]);
             if (x == true)
                return true;
         }
         return false;
     }
}