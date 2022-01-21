package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> fruits = new LinkedList<>();

		// Add elements
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("strawberry");
		fruits.add("blueberry");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		System.out.println(fruits);

		// Peek first element
		System.out.println("Peek first element " + fruits.peek());

		// Print first element
		System.out.println("Print first element " + fruits.element());

		// Remove one element
		System.out.println("Remove mango " + fruits.remove("mango"));

		// Poll (peak and remove)
		fruits.poll();
		System.out.println("After first poll" + fruits);

		// Check if it contains garlic
		System.out.println("Check if it queue contains banana : " + fruits.contains("banana"));

		System.out.println(" print elements after second poll using for each loop ");
		// Poll again and print all element with for each
		fruits.poll();
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println(" print elements after second poll using iterator ");
		Iterator<String> it = fruits.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
