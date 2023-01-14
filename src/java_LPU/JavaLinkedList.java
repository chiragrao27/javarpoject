package java_LPU;

public class JavaLinkedList {

    public static void main(String[] args){

        Node1 n1 = new Node1(1);
        Node1 n2 = new Node1(2);
        Node1 n3 = new Node1(3);
        Node1 n4 = new Node1(4);
        Node1 n5 = new Node1(5);

        Node1 head = n1;
        head.next = n2;
        head.next = n3;
        n2.next = n3;
        n2.next = n1;
        n3.next = n4;
        n3.next = n3;
        n4.next = n5;
        n4.next = n2;
        n5.next = n4;


        insertion(23,head,2);
        delete(head,1);

        System.out.println(detectCycle(head));



    }

    static void traverse(Node1 head){
        Node1 cur = head;
        while(cur!=null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    static void insertion (int data, Node1 head,int pos){

        Node1 toAdd = new Node1(data);
        if (pos==0){
            toAdd.next = head;
            head = toAdd;
            return;
        }
        Node1 prev = head;
        for(int i =0;i<pos-1;i++){
            prev = prev.next;
        }
        toAdd.next = prev.next;
        prev.next = toAdd;

    }

    static void delete(Node1 head, int pos){

        if(pos==0){
            head = head.next;
            return;
        }
        Node1 prev = head;
        for(int i=0;i<pos-1;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;

    }

    static boolean detectCycle(Node1 head){
        Node1 slow = head;
        Node1 fast = head;
        while(fast!=null && slow!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }

        }
        return false;
    }
    // not completed ///
    static void  duplicate  (Node1 head) {

        Node1 cur = head;
        while (cur!=null){
            Node1 temp = cur.next;

        }

    }

}

class Node1 {
    int data;
    Node1 next;

    Node1 (int data){
        this.data = data;
    }
}
