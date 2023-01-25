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
	 * create list method create new node to be added
	 */

	public void addFirst(Object data) {
		Node newNode = new Node(data); // new node with given data
		newNode.next = head;
		head = newNode;
	}

	/*
	 * Display position No nsertion will take place if list is empty
	 */

	public void display() {
		Node temp = head;
		while (temp != null) {
			if (temp.next != null)
				System.out.print(temp.data + " -> ");
			else
				System.out.println(temp.data);
			temp = temp.next; // advance to next node in the list
		}
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		System.out.println("welcome to LinkedList Problem");
		list.addFirst(70);
		list.display();
		list.addFirst(30);
		list.display();
		list.addFirst(56);
		list.display();

	}

}
