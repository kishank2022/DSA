package com.practice.dsa.java8.linkedList;

public class LinkedList {

	Node head = null;
	
	public void insertAtBegining(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void insertAtPosition(int data, int position) {
		Node newNode = new Node(data);
		if(position < 0) {
			System.out.println("Invalid position!");
			return;
		}
		if(position == 0) {
			newNode.next = head;
			head = newNode;
		}
		Node temp = head;
		int index = 0;
		while(temp.next != null) {
			temp = temp.next;
			index = index+1;
			if(index == (position -1)) {
				break;
			}
		}		
		if(temp == null) {
			System.out.println("Position out of bound!!!");
			return;
		}		
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void printData() {
		if(head == null) {
			System.out.println("LinkedList is empty!!");
			return;
		}
		Node temp = head;
		while(temp != null) {
			
			if(temp.next == null) {
				System.out.println(temp.data);
			}else {
			System.out.print(temp.data+" -> ");
			}
			temp = temp.next;
		}
	}
}
