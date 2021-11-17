package com.bridgelabz.LinkedList;

public class LinkedListPractice {

	private Node head;

	class Node {

		int key;
		Node next;

		public Node(int key) {
			this.key = key;
		}
	}

	public boolean add(int data) {

		boolean isAdded = false;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			isAdded = true;
		} else {

			Node temp = head;
			if (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}
		return isAdded;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void insertAtPosition(int position, int data) {
		if (position < 1) {
			System.out.println("invalide position");
		}
		if (position == 1) {
			push(data);
		} else {
			Node newNode = new Node(data);
			Node temp = head;
			int count = 1;
			while (count < position - 1) {
				temp = temp.next;
				count++;
			}
			Node current = temp.next;
			temp.next = newNode;
			newNode.next = current;
		}
	}

	public int pop() {

		if (head == null) {
			System.out.println("delation is not possible becouse empty list");
		}
		Node temp = head;
		head = temp.next;

		return temp.key;
	}

	public int popLast() {
		if (head == null) {
			System.out.println("delation is not possible becouse empty list");
		}

		Node temp = head;

		while (temp.next.next != null) {
			temp = temp.next;
		}

		int popLastKey = temp.next.key;
		temp.next = null;
		return popLastKey;
	}

	public boolean toSearch(int data) {

		if (head == null) {
			System.out.println("List is empty");
			return false;
		}
		Node temp = head;
		boolean isFound = false;
		while (temp != null) {
			if (temp.key == data) {
				isFound = true;
				break;
			}
			temp = temp.next;
		}
		return isFound;
	}

	public void insertAfterSearch(int searchElmt, int data) {

		if (toSearch(searchElmt)) {

			Node temp = head;
			int count = 1;
			while (temp != null) {
				if (temp.key == data) {
					break;
				}
				temp = temp.next;
				count++;
			}
			insertAtPosition(count, data);
			toPrint();
		} else
			System.out.println("insertion not possible becouse search element not matched ");
	}
	
	public boolean delete(int element) {
		
		if(!toSearch(element)) {
			System.out.println("search element not found");
			return false;
		}
		Node temp = head;
		Node prev = null;
		if(temp != null && temp.key==element) {
			head = temp.next;
			return true;
		}
		while(temp !=null) {
			if(temp.key == element) {
				prev.next = temp.next;
				return true;
			}
			prev = temp;
			temp = temp.next;
		}
		return false;
	}

	public void toPrint() {
		if (head == null) {
			System.out.println("linkedList is empty");
		} else {
			Node temp = head;
			System.out.println("LinkedList is : ");
			while (temp != null) {
				System.out.print(temp.key + "-->");
				temp = temp.next;
			}
		}
		System.out.println();
	}
}