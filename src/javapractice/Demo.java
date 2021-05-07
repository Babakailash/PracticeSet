package javapractice;

import java.util.Stack;

public class Demo {
	
       private static void doListDemo() {
    	   Stack<String> stack = new Stack<>();
    	      stack.push("ajay");
    	      stack.push("Garvit");
    	      stack.push("Amit");
    	      stack.push("Garima");
    	     System.out.println(stack); 
    	      String pop = stack.pop();
	
}
       public static void main(String[] args) {
    	    Demo.doListDemo();
    	   
    	  
}
}