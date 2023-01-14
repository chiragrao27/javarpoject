package java_LPU;

public class prac {

    public static void main(String[] args) {

        Palindrome(232);
        Armstrong(153);

        int[] a = {0,1,3,5,11,13};
        Array(a);
        reverse(a);


    }

    static void Palindrome(int a){

        int r ,sum=0,temp;
        temp=a;

        while(a>0){
            r = a%10;
            sum = sum*10+r;
            a= a/10;
        }
        if(temp==sum){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }

    static  void Armstrong(int a){

        int temp,digits = 0,last =0,sum=0;
        temp = a;

        while(temp>0){
            temp = temp/10;
            digits++;
        }
        temp = a;

        while (temp>0){
            last = temp%10;
            sum+=(Math.pow(last,digits));
            temp = temp/10;
        }

        if(a == sum){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not Armstrong");
        }

    }

    static void Array(int[] a){

        int sum=0;
        for (int i=0;i<a.length;i++){
            sum += a[i];
        }
        System.out.println("Sum : " + sum);
        int big=a[0];
        for(int i =1;i<a.length;i++){
            if(big<a[i]){
                big=a[i];
            }
        }
        System.out.println("Big : " + big);
        int small=a[0];
        for(int i =1;i<a.length;i++){
            if(big>a[i]){
                big=a[i];
            }
        }
        System.out.println("Smaller : " + small);
    }

    static void reverse(int[] a){
        int n = a.length;
        int b[] = new int[a.length+1];
        for(int i=0;i< n;i++){
            b[n-i] = a[i];
        }
        for (int i=0;i<n;i++){
            System.out.print(b[i] + " ");
        }
    }


}
