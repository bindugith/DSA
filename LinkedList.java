import java.util.*;
class Node{
int data;
Node next;
Node(int x){
data=x;
next=null;
}
}
class singleList{
Node head,tail;
singleList(){
head=tail=null;
}
void create(int x){
Node n=new Node(x);
if(head==null){
head=n;
tail=n;
}else{
    /* insert elements in ascending order */
    if(x<head.data){
        n.next=head;
        head=n;
    }
    Node temp=head;
    while(temp!=null){
        if(temp.next.data<x){
            temp=temp.next;
        }else{
            break;
        }
        if(temp.next==null){
            temp.next=n;
            tail=n;
        }else{
            n.next=temp.next;
            temp.next=n;
        }
    }
}
}
}
void display(){
if(head==null){
System.out.println("List is empty"+" ");
return;
}else{
Node temp=head;
while(temp!=null){
System.out.println(temp.data);
temp=temp.next;
}
}
}
void exit(){
System.out.println("exit");
}
}
class SingleLinkedList{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
singleList obj=new singleList();
for(;;){
System.out.println("1.create \n 2.display \n 3.exit");
System.out.println("Enter any choice");
int ch=s.nextInt();
if(ch==1){
int x;
System.out.println("enter the element");
x=s.nextInt();
obj.create(x);
}
else if(ch==2){
obj.display();
}
else if(ch==3){
obj.exit();
}
}
}
}



