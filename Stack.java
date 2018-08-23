public class Stack {
	
	
	private int currentElementPosition = 0;
	private String[] elements;
	private int INITIAL_SIZE = 10;
 
	/**
	 * Constructor which initializes the array to be used as the stack
	 */
	public Stack() {
		elements = new String[INITIAL_SIZE];
	}
 
	public String pop() {
		String t =  elements[--currentElementPosition];
		elements[currentElementPosition] = null;
		return t;
	}
	
	public void push(String elementToPush) {
		elements[currentElementPosition] = elementToPush;
		currentElementPosition++;
	}
 
	public int size() {
		return currentElementPosition;
	}
 
	public static void main(String[] args) {
		Stack c = new Stack();
		c.push("drive");
		c.push("car");
		c.push("animal");
		c.push("fast");
		c.push("home");
		c.push("casa");

		System.out.println(c.pop());
		System.out.println(c.pop());
		System.out.println(c.size());
		
		System.out.println(c.pop());
		System.out.println(c.pop());
		System.out.println(c.pop());
		System.out.println(c.pop());
		//System.out.println(c.pop());
		
		System.out.println(c.size());

		
		
		
		
	}
}