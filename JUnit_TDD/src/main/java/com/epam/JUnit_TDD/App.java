package com.epam.JUnit_TDD;

import java.util.Scanner;

public class App
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       String result=removeChars(s);
       System.out.println(result);
   }
   public static String removeChars(String s) {
       int index=s.indexOf('A');
       if(index==-1 || index>1)
       {
           return (s);
       }
       else
       {
           if(index==0)
           {
               if(s.charAt(1)=='A')
               {
                   return (s.substring(2));
               }
               else
               {
                   return (s.substring(1));
               }
           }
           else if(index==1)
           {
               return (s.charAt(0)+s.substring(2));
           }
           return null;
       }
   }
}