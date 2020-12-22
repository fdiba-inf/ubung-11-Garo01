package exercise11.1;
import java.util.Stack;
public class LinkedStackDemo {
	 public static void main(String[] args) {
	        Stack stack = new Stack();
	    stack.isEmpty();
	    stack.push("A");
	    stack.push("B");
	    stack.push("C");
	    stack.push("D"); 
	        
	        System.out.println("Stack: " + stack);
	        System.out.println("Pop: " + stack.pop());
	        System.out.println("Stack: " + stack);
	        System.out.println("Pop: " + stack.pop());
	        System.out.println("Stack: " + stack);
	        System.out.println("Pop: " + stack.pop());
	        System.out.println("Stack: " + stack);
	    }
	}

