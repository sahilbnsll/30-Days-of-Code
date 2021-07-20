import java.util.*;

class Node3{
    int data;
    Node3 next;
    Node3(int d){
        data=d;
        next=null;
    }
}

class Solution {

    public static Node3 removeDuplicates(Node3 head) {
        if (head == null || head.next == null){
            return head;
        }
        if (head.data == head.next.data){
            head.next = head.next.next;
            removeDuplicates(head);
        }else{
            removeDuplicates(head.next);
        }
        return head;
    }


    public static  Node3 insert(Node3 head,int data) {
        Node3 p=new Node3(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else {
            Node3 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }


    public static void display(Node3 head) {
        Node3 start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Node3 head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
    }
}
