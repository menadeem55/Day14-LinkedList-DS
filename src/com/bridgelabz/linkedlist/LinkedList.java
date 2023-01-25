package com.bridgelabz.linkedlist;

public class LinkedList {

	Node head; // head of list

	/*
	 * LinkedList Node
	 */

	class Node {
		Object data;
		Node next; // reference to next object in the sequence

		Node(Object data) {

			this.data = data;
		}

	}

	/*
	 * Create list method create new node to be added
	 */

	public void CreateList(Object data) {

		Node newNode = new Node(data); // new node with given data
		System.out.println(newNode.data + " "); // print data at current node
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		System.out.println("welcome to LinkedList Problem");
		list.CreateList(56);
		list.CreateList(30);
		list.CreateList(70);

	}

}
