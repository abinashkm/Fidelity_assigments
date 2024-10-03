package com.assigmentDay7;

import java.util.Scanner;

public class preorder {
    Node head=null;
    Node tail=null;
    public static void main(String[] args) {
        preorder obj=new preorder();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n=Integer.parseInt(sc.nextLine());
        System.out.printf("Enter %d the elements :",n);
        while(n>0){
            int k=Integer.parseInt(sc.nextLine());
            obj.addTail(k);
            n=n-1;
        }
        obj.reverse();


    }

    void addTail(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    void reverse(){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        while(prev!=null){
            System.out.println(prev.data);
            prev=prev.next;
        }

    }
    void display(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }

    }

}