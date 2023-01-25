package com.bridgelabz.linkedlist;

public class LinkedList {

	Node head; // head of list

	/* Linked list Node */
	class Node {
		Object data;
		Node next; // reference to next object in the sequence

		Node(Object data) {
			this.data = data;
		}
	}

	/*
	 * ADD - FIRST POSITION create new node to be added
	 */
	public void addFirst(Object data) {
		Node newNode = new Node(data); // new node with given data
		newNode.next = head;
		head = newNode;
	}

	/*
	 * ADD - LAST POSITION if the linked list empty. then make the new node as head
	 */
	public void addLast(Object data) {
		Node newNode = new Node(data);
		Node temp = head;
		if (head == null) {
			head = newNode;
		}

		else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	/*
	 * Display position No insertion will take place if list empty
	 */
	public void display() {
		Node temp = head;
		while (temp != null) {
			if (temp.next != null)
				System.out.print(temp.data + " -> ");
			else
				System.out.println(temp.data);
			temp = temp.next; // Advance to next node in the list

		}
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		System.out.println("Adding Nodes At First");
		list.addFirst(70);
		list.display();
		list.addFirst(30);
		list.display();
		list.addFirst(56);
		list.display();
		System.out.println();
		System.out.println("Adding Nodes At last");
		list.addLast(56);
		list.display();
		list.addLast(30);
		list.display();
		list.addLast(70);
		list.display();

	}

}