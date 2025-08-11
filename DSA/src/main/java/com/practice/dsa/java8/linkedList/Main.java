package com.practice.dsa.java8.linkedList;

public class Main {

	public static void main(String[] args) {
		/*
		Node node1 = new Node(30);
		System.out.println(node1.data);
		System.out.println(node1.next);
		
		Node node2 = new Node(87);
		node1.next = node2;
		
		System.out.println(node2.data);
		System.out.println(node1.next); // com.practice.dsa.java8.linkedList.Node@4aa8f0b4
		System.out.println(node1.next.data); // print the actual data 
		*/
		LinkedList linkedList = new LinkedList();
		linkedList.insertAtBegining(2);
		linkedList.insertAtBegining(4);
		linkedList.insertAtEnd(2);
		linkedList.insertAtBegining(6);
		linkedList.insertAtBegining(8);
		linkedList.insertAtEnd(20);
		linkedList.printData();
		linkedList.insertAtPosition(30, 3);
		linkedList.printData();
		
	}
}
