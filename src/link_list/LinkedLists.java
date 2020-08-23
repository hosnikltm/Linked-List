package link_list;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedLists {

    public  void printList(LinkedList<String> linkedList) {
        for (String s : linkedList) {
            System.out.println("Now Element " + s);
        }
        System.out.println("=========================");
    }

    public void addInOrder(LinkedList<String> linkedList, String newElement) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newElement);
            if(comparison == 0) {
                // equal, do not add
                System.out.println(newElement + " is already in File");
                return;
            } else if(comparison > 0) {
                
                stringListIterator.previous();
                stringListIterator.add(newElement);
                return;
            }  // move on next char

        }

        stringListIterator.add(newElement);
    }

    @SuppressWarnings("resource")
	public  void visit(LinkedList<String> list) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = list.listIterator();

        if(list.isEmpty()) {
            System.out.println("No cities in the iterator");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0 -> {
                    System.out.println("Empty Not have Letters over");
                    quit = true;
                }
                case 1 -> next(true, listIterator);
                case 2 -> previous(true, listIterator);
                case 3 -> printMenu();
            }

        }
        scanner.close();
    }

	public  void previous(boolean goingForward, ListIterator<String> listIterator) {
		if(goingForward) {
		    if(listIterator.hasPrevious()) {
		        listIterator.previous();
		    }
        }
		if(listIterator.hasPrevious()) {
		    System.out.println("Now Letters " + listIterator.previous());
		} else {
		    System.out.println("We are at the start of the list");
        }
		
	}

	public void next(boolean goingForward, ListIterator<String> listIterator) {
		if(!goingForward) {
		    if(listIterator.hasNext()) {
		        listIterator.next();
		    }
        }
		if(listIterator.hasNext()) {
		    System.out.println("Now Letters " + listIterator.next());
		} else {
		    System.out.println("Reached the end of the list");
        }
		
	}

    public  void printMenu() {
        System.out.println("Available Actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }

}
