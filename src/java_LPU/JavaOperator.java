package java_LPU;

public class JavaOperator {

    public static void main(String[] args){
        typeComparisonOperator();
    }

    static void arithmeticOperator(){

        int addResult = 1+2;
        int subResult = 5-2;
        int multiplicationResult = 5*3;
        int divideResult =5/2;
        int remResult = addResult%subResult;

    }
    static void unaryOperator(){
        int res = +1;
        res = -1;
        res++;
        res--;

    }

    static void conditionalOperator () {
        int x = 1, y =2;
        if((x==1) && (y==2)){
            System.out.println("AND");
        }
        if((x==1)|| (y==2)){
            System.out.println("OR");
        }
        if(!(x==1)){
            System.out.println("NOT");
        }
        boolean boolVar = true;

        int result = boolVar?x:y;



    }

    static  void typeComparisonOperator() {
        Integer iObj = Integer.valueOf(5);
        System.out.println( iObj instanceof Integer);
    }

}
