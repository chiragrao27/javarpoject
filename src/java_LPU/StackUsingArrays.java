package java_LPU;

public class StackUsingArrays {

    public static void main(String[] args) throws Exception {

        MyStack m1 = new MyStack();
        m1.push(55);




    }


}
class  MyStack {
        int a[];
        int top;
        int capacity;

        public MyStack(){
            this.capacity = capacity;
            top=-1;
            a = new int[capacity];
        }
        void push(int data) throws Exception {

            if(top == capacity-1){
                throw new Exception();
            }

            top++;
            a[top] = data;
        }

        int pop() throws Exception {
            if(top==-1){
                throw new Exception();
            }
            int res = a[top];
            top--;
            return res;
        }

        int peek() throws Exception {
            if(top == - 1){
                throw new Exception();
            }
            return a[top];
        }


}



