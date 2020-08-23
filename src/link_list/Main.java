package link_list;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
    	LinkedLists list = new LinkedLists();
        LinkedList<String> linkedList = new LinkedList<>();
        list.addInOrder(linkedList, "A");
        list.addInOrder(linkedList, "B");
        list.addInOrder(linkedList, "C");
        list.addInOrder(linkedList, "E");
        list.addInOrder(linkedList, "F");
        list.addInOrder(linkedList, "G");
        list.addInOrder(linkedList, "H");
        list.printList(linkedList);

        list.addInOrder(linkedList, "is");
        list.addInOrder(linkedList, "D");
        list.printList(linkedList);
        list.visit(linkedList);
    }



























}
