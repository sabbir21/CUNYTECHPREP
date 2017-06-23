//Java's basic stack class used 

import java.util.*;
public class Question3 
{
    public static void main(String[] args) 
    {
        String inp =  "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
        int opening_pos = 10;
        int x = getClosingParen(inp, opening_pos);
        System.out.println(x);      
    }
    public static int getClosingParen(String inp, int opening_pos)
    {
        Stack<String> stk = new Stack<String>();
        for(int i=0;i<inp.length();i++)
        {
            if(inp.charAt(i)=='(')
            {
                if(i==opening_pos)
                {
                    stk.push("*(*");
                }
                else
                {
                    stk.push("(");
                }
            }
            else if(inp.charAt(i)==')' && !stk.isEmpty() && stk.peek()=="*(*")
            {
                return i;
            }
            else if(inp.charAt(i)==')' && !stk.isEmpty() && stk.peek()=="(")
            {
                stk.pop();
            }
        }
        return -1;
    }
}