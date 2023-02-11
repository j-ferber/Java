import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	private static int linearsearch(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		/*
		
		Swapping two variables:
		
		String x = "Bruh ";
		String y = "Moment";
		String temp = y;
		y = x;
		x = temp;
		System.out.println(x + y);
		
		*/
		
//------------------------------------------------------------STACKS--------------------------------------------------------------
		
		/*
		
		stack.push() - Adds an element to the top of the list
		stack.pop() - Removes an element from the top of the list
		stack.peek() - Returns an object from the top of the stack
		stack.search() - Search for an item in the stack
		stack.empty() - Checks if the stack is empty
		
		Stack<String> stack = new Stack<String>();
		stack.push("Minecraft");
		stack.push("DOOM");
		stack.push("Roblox");
		stack.push("Borderlands");
		stack.push("FFVII");
		System.out.println(stack);
		String game = stack.pop();
		System.out.println(game);
		System.out.println(stack);
		System.out.println(stack.search("DOOM"));
		
		*/
		
//------------------------------------------------------------QUEUES--------------------------------------------------------------
		
		/*	
		
		Queue = FIFO data structure. First-In First-Out
		A collection designed for holding elements prior to processing
		Linear data structure
		add -> enqueue = offer()
		remove -> dequeue = poll()
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		
		System.out.println(queue.peek());
		
		queue.poll();
		System.out.println(queue.contains("Karen"));
		
		System.out.println(queue);

		*/

//------------------------------------------------------------PRIORITY QUEUE--------------------------------------------------------------
		
		/* 
		
		Priority Queue = A FIFO data structure that serves elements
    	                 with the highest priorities first 
    					 before elements with lower priority
		
		
		Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		queue.offer("B");
		queue.offer("C");
		queue.offer("A");
		queue.offer("F");
		queue.offer("D");
		
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		*/
		
//------------------------------------------------------------LINKED LISTS--------------------------------------------------------------
	
		/*
		LinkedList =  Nodes are in 2 parts (data + address)
                            Nodes are in non-consecutive memory locations
                            Elements are linked using pointers
		Can be treated as a queue or a stack (can use pop, push, poll, offer)
		Add elements using name.add(index, what you want to add);
		Remove elements using name.remove(what you want to delete);
		Can search linked list using name.indexOf(what you are looking for);
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		
//		linkedlist.push("A"); //Stack
//		linkedlist.push("B");
//		linkedlist.push("C");
//		linkedlist.push("D");
//		linkedlist.push("F");
//		linkedlist.pop();
		
		linkedlist.offer("A"); //Stack
		linkedlist.offer("B");
		linkedlist.offer("C");
		linkedlist.offer("D");
		linkedlist.offer("F");
		//linkedlist.poll();
		
		linkedlist.add(4, "E");
		linkedlist.remove("E");
		System.out.println(linkedlist.peekFirst());
		System.out.println(linkedlist.peekLast());
		linkedlist.addFirst("0");
		linkedlist.addLast("G");
		String first = linkedlist.removeFirst();
		String last = linkedlist.removeLast();
		System.out.println(first);
		System.out.println(last);
	
		
		System.out.println(linkedlist);
		
		*/
		
//------------------------------------------------------------DYNAMIC ARRAYS--------------------------------------------------------------
		
	/*	
		DynamicArray dynamicarray = new DynamicArray(5);
		
		dynamicarray.add("A");
		dynamicarray.add("B");
		dynamicarray.add("C");
		dynamicarray.add("D");
		dynamicarray.add("E");
		dynamicarray.add("F");
		
		dynamicarray.delete("A");
		dynamicarray.delete("B");
		dynamicarray.delete("C");

		
//		dynamicarray.insert(0,  "X");
//		dynamicarray.delete("A");
//		System.out.println(dynamicarray.search("C"));
		
		System.out.println(dynamicarray);
		System.out.println(dynamicarray.size);
		System.out.println(dynamicarray.capacity);
		System.out.println(dynamicarray.isEmpty());
	*/

//------------------------------------------------------------ARRAY LIST--------------------------------------------------------------		
		/*
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		long startTime;
		long endTime;
		long elapsedTime;
		
		for (int i = 0; i < 1000000; i++) {
			linkedlist.add(i);
			arraylist.add(i);
		}
		
		// Linked List
		startTime = System.nanoTime();
		
		linkedlist.get(0);
		
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		
		System.out.println("LinkedList: " + elapsedTime);
		
		// Array List
		*/
		
//------------------------------------------------------------LINEAR SEARCH--------------------------------------------------------------
	
		/*
		int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
		
		int index = linearsearch(array, 10);
		
		if(index != -1) {
			System.out.println(index);
		}
		else {
			System.out.println("Element not found");
		}
	*/
		
//------------------------------------------------------------BINARY SEARCH--------------------------------------------------------------
	
	/*
		// binary search = Search algorithm that finds the position
		 //       of a target value within a sorted array.
		 //       Half of the array is eliminated during each "step"	
		
	int array[] = new int[1000000];
	int target = 777777;
	
	for (int i = 0; i < array.length; i++) {
		array[i] = i;
	}
	
	int index = binarySearch(array, target);
	
	if(index == -1) {
		System.out.println(target + "not found");
	}
	else {
		System.out.println(index + " found");
	}
	

	private static int binarySearch(int[] array, int target) {
		
		int low = 0;
		int high = array.length-1;
		while (low <= high) {
			
			int middle = low + (high - low) / 2;
			int value = array[middle];
			if (value < target) {
				low = middle + 1;
			}
			else if (value > target) {
				high = middle - 1;
				
			}
			else
				return middle;
			
		}
		return -1;
	}
*/

		
	}
}
