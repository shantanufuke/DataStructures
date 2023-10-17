package com.linkedlist;

public class LinkedListImplementation{
	Node head;
	
	public boolean isEmpty() {
		if(head==null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void deleteLink(int data) {
		if(isEmpty()) {
			System.out.println("LinkList is Empty");
		}
		
		if(head.data==data) {
			head=head.addressOfNext;
			return;
		}
		Node current=head;
		while(current.addressOfNext!=null && current.addressOfNext.data !=data) {
			current=current.addressOfNext;
		}
		
		current.addressOfNext=current.addressOfNext.addressOfNext;
	}
	
	
	public void insertLink(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node current=head;
		while(current.addressOfNext!=null) {
			current=current.addressOfNext;
		}
		current.addressOfNext=newNode;
	}
	
	public void displayLinkList() {
		Node current=head;
		while(current!=null) {
			System.out.println("The First Node data is: "+current.data);
			current=current.addressOfNext;
		}
	}

}
