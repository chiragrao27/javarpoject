package java_LPU;

import java.util.ArrayList;
import java.util.Scanner;


public class Practice {
     static public   void main(String[] args){

         Scanner sc = new Scanner(System.in);

         int h = sc.nextInt();
         int  f=0,s=1;
         int sum=0;

         for(int i =0;i<h;i++){

             System.out.print(f + " ");
             sum+=f;


             int next = f + s;
             f = s;
             s= next;

         }
         System.out.println();
         System.out.println("SUM : " + sum);



    }
}
