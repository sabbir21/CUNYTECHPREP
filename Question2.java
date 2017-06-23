//StringBuider is java's basic library used here

import java.util.*;
import java.lang.*;

public class Question2
{
     
    public static void main(String []args)
    {
        String a = "2-4a0r7-4k";
        System.out.println(stringReformatting(a,4));
    } 
     
    public static String stringReformatting(String s, int k)
    {
        String x = s.replaceAll("-", ""); //we can use for loop also to eliminate delimeter and append chars to build new string
        StringBuilder str = new StringBuilder(x);
        int m = x.length() % k;
        int n = x.length() / k;
        int offset = m+k;
        
        if (m != 0)
        {
            str.insert(m, '-');
            //System.out.println(str);
            offset += 1;
        }
        for (int i =1; i<n; i++)
        {
            str.insert(offset, '-');
            //System.out.println(str);
            offset = offset+k+1;
        }
        
        return str.toString();
    }
}