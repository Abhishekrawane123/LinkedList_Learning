package com.bridgelabz.LinkedList;

import java.util.Scanner;

public class LinkedListPracticeMain {

	public static void main(String[] args) {

		LinkedListPractice linkedListPractice = new LinkedListPractice();
		linkedListPractice.toPrint();

		UserInterface userInterface = new UserInterface();
		while (true) {
		int num = userInterface.showUserMenu();
			switch (num) {
			case 1:
				linkedListPractice.add(userInterface.inputData());
				break;
			case 2 : 
				linkedListPractice.push(userInterface.inputData());
			case 3:
				Scanner scanner = new Scanner(System.in);
				System.out.println("enter insert position : ");
				int positiont = scanner.nextInt();
				System.out.println("enter insert value : ");
				int value = scanner.nextInt();
				linkedListPractice.insertAtPosition(positiont, value);
				linkedListPractice.toPrint();
				break;
			case 4:
				System.out.println("Deleted key is : " + linkedListPractice.pop());
				break;
			case 5:
				System.out.println("Deleted last key is : " + linkedListPractice.popLast());
				break;
			case 6 :
				System.out.println("isFound the element " + linkedListPractice.toSearch(userInterface.inputData()));
			}
			if(num==0) {
				break;
			}
		}
		
		linkedListPractice.toPrint();
	}

}