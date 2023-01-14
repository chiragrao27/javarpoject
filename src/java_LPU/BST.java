package java_LPU;

public class BST {

    static Node insert(Node root,int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(root.data>data){
            root.left = insert(root.left,data);
        }else if (root.data<data) {
            root.right = insert(root.right,data);
        }
        return root;

    }

    Node root;

    void insertRec(int data){
        root = insert(root,data);
    }




    public static void main(String[] args){
        BST tree = new BST();
        tree.insertRec(1);
        tree.insertRec(2);
        tree.insertRec(3);
        tree.insertRec(24);
        tree.insertRec(10);
        tree.insertRec(23);

    }

    static void print(Node root){
        if(root==null){
            System.out.println(0);
        }

    }




}


