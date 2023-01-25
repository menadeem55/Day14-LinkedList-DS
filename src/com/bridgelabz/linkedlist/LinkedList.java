package com.bridgelabz.linkedlist;

import java.util.Scanner;

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

	// Add position
	public void addPosition(Object data, int position) {
		int index = 0;
		Node newNode = new Node(data);
		Node left = head;
		Node right = left.next;

		while (index < (position - 1)) {
			left = left.next;
			right = right.next;
			index++;

		}
		newNode.next = right;
		left.next = newNode;

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

	// Delete position
	public void deleteFirst() {
		head = head.next;
	}

	// delete last element
	public void deletelast() {
		if (head == null)
			System.out.println("List is empty");
		else if (head.next == null)
			head = null;
		else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	// Search method
	public Object searhElement(Object input) {

		Node temp = head;
		int index = 0;
		/*
		 * loop is used to search the entire linked Gradually increases index while
		 * traversing through the linked list return result of that particular input
		 */
		while (temp != null) {
			index++;
			if (temp.data == input) {
				String result = temp.data + " element found at index " + index;
				return result;
			}
			temp = temp.next;
		}
		return null;
	}

	// Insert the Element of position
	public void insertElement(Object input, Object value) {

		Node newNode = new Node(value);
		Node temp = head;
		int index = 0;

		while (temp.data != input) {
			index++;
			temp = temp.next;
		}
		Node left = head;
		Node right = left.next;
		int index1 = 0;

		while (index < index) {
			index++;
			left = left.next;
			right = right.next;

		}
		newNode.next = right;
		left.next = newNode;

	}

	// Delete specific position
	public void deleteSpecificPosition(Object data) {
		int index = 0;
		Node left = head;
		Node right = left.next;
		while (right.data != data) {
			left = left.next;
			right = right.next;
			index++;

		}
		left.next = right.next;
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		System.out.println("Welcome to Linked List Problem");
		list.addFirst(56);
		list.addLast(30);
		list.addLast(40);
		list.addLast(70);
		list.display();

		list.deleteSpecificPosition(40);
		list.display();
	}

}