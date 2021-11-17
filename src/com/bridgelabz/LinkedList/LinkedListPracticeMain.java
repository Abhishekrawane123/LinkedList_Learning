package com.bridgelabz.LinkedList;

public class LinkedListPracticeMain {
	
	public static void main(String[] args) {
		
		LinkedListPractice linkedListPractice = new LinkedListPractice();
		linkedListPractice.toPrint();
		linkedListPractice.add(70);
		linkedListPractice.add(56);
		linkedListPractice.add(46);

		linkedListPractice.insertAtPosition(3,30);
		linkedListPractice.toPrint();
		
		System.out.println("Deleted key is : " + linkedListPractice.pop());
		linkedListPractice.toPrint();
		
		System.out.println("Deleted last key is : " + linkedListPractice.popLast());
		linkedListPractice.toPrint();
	}

}