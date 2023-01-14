package java_LPU;

import java.util.*;

public class tree {

    static Scanner sc = null;
    static int max_level=0;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node n = CreateTree();

        int d = diameter(n);





    }

     static Node CreateTree() {
        Node root = null;
        System.out.println("Enter Data : ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        root = new Node(data);

        System.out.print("Enter Left for " + data);
        root.left = CreateTree();

        System.out.print("Enter Right for " + data);
        root.right = CreateTree();

        return root;
    }

    static void inOrder (Node root){
        if(root ==null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }

    static void preOrder (Node root){
        if(root ==null){
            return;
        }

        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void  postOrder(Node root ){
        if(root ==null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+" ");
    }

    static int  height(Node root){
        if(root == null){
            return 0;
        }

        return Math.max(height(root.left),height(root.right))+1;
    }

    static int size (Node root ){
        if(root==null){
            return 0;
        }

        return size(root.left) + size(root.right) + 1;
    }

    static int maximum(Node root) {
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left),maximum(root.right)));

    }

    static void printCurrentLevel(Node root, int lvl){
        if(root==null){
            return;
        }
        if(lvl == 1){
            System.out.println(root.data+" ");
        } else if (lvl>1) {
            printCurrentLevel(root.left, lvl-1);
            printCurrentLevel(root.right, lvl -1);
        }
    }

    static void printLeftView(Node root){
        max_level = 0;
        printLeftViewUtil(root,1);
    }

    static void printLeftViewUtil(Node root, int level){

        if(root == null){
            return;
        }
        if (max_level<level){
            System.out.print(root.data+" ");
            max_level=level;
        }

        printLeftViewUtil(root.left,level+1);
        printLeftViewUtil(root.right,level+1);

    }

    static void topView (Node root){
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer,Integer> map = new TreeMap<>();

        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair cur = q.poll();
            if(!map.containsKey(cur.hd)){
                map.put(cur.hd, cur.node.data);
            }
            if(cur.node.left!=null){
                q.add(new Pair(cur.hd-1,cur.node.left));
            }
            if(cur.node.right!=null) {
                q.add(new Pair(cur.hd +1,cur.node.right));
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        for (int i =0;i< ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }

    }

    static Node prev = null , head = null;

    static void convertToDLL(Node root){
        if(root == null){
            return ;
        }
        convertToDLL(root.left);
        if(prev ==null){
            head = root;
        }else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        convertToDLL(root.right);
    }

    static int diameter (Node root ){
        if(root == null){
            return 0;
        }
        int dl = diameter(root.left);
        int dr = diameter(root.right);
        int cur = height(root.left) + height(root.right) + 1;
        return Math.max(cur,Math.max(dl,dr));

    }





}
class Pair{
    int hd;
    Node node;

    public Pair(int hd,Node node){
        this.node=node;
        this.hd=hd;
    }
}
class Node {
    Node right,left;
    int data;

    public  Node (int data){
        this.data = data;
    }
}