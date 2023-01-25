package com.bridgelabz.linkedlist;

import java.util.Scanner;

public class LinkedList {

	Node head; // head of list

	/* Linked list Node */
	class Node {
		int data;
		Node next;

		Node(int data) { // reference to next object in the sequence
			this.data = data;
			this.next = null;
		}
	}

	/*
	 * ADD - FIRST POSITION create new node to be added
	 */
	public void addFirst(int data) {
		Node newNode = new Node(data); // new node with given data
		newNode.next = head;
		head = newNode;
		return;
	}

	/*
	 * ADD - LAST POSITION if the linked list empty then make the new node as head
	 */
	public void addlast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
		return;
	}

// PRINT METHOD
	public void display() {
		if (head == null) {
			System.out.println("List is Empty");
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("null");

	}

//   Search Method
	public Object searchElement(int input) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == input)
				return temp.data + "  is in that LinkedList The Value";
			temp = temp.next;
		}
		return "Not In LinkedList";
	}

	public void sortByNumber() {

		// Node current will point to head
		Node currNode = head, index = null;

		int temp;

		if (head == null) {
			return;
		} else {
			while (currNode != null) {
				index = currNode.next;

				while (index != null) {
					if (currNode.data > index.data) {
						temp = currNode.data;
						currNode.data = index.data;
						index.data = temp;
					}

					index = index.next;
				}
				currNode = currNode.next;
			}
		}
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.addFirst(56);
		list.addlast(30);
		list.addFirst(40);
		list.addlast(70);
		System.out.println("Before The Sorting");
		list.display();
		list.sortByNumber();
		System.out.println("After The Sorting");
		list.display();

	}
}