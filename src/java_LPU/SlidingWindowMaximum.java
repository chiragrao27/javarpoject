package java_LPU;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum{

    public static void main(String[] args){
        int a[] ={4,1,3,5,1,2,3,2,5};

        printMax(a,3);
    }




   static void printMax ( int a[], int k ){

        Deque<Integer> Qi = new ArrayDeque<Integer>();

        int n = a.length;

        for(int i =0;i<k;i++){
            while(!Qi.isEmpty() && a[i]>=a[Qi.peekLast()]){
                Qi.removeLast();
            }
            Qi.addLast(i);
        }

        for(int i =0;i<n;i++){
            System.out.print(a[Qi.peek()]);

            while ((!Qi.isEmpty())&&Qi.peek()<=i-k){
                Qi.removeFirst();
            }
            while ((Qi.isEmpty()) && a[i]>=a[Qi.peekLast()]){
                Qi.removeLast();
            }

            Qi.addLast(i);

            System.out.println(a[Qi.peek()]);
        }

    }


}
