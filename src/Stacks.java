import java.util.EmptyStackException;

/*
	 * LIFO, methods: push, pop, peek, isEmpty. Unlike an array, a stack does not
	 * offer constant-time access to the ith item. However, it does allow constant
	 * time adds and removes, as it doesn't require shifting elements around.
	 */
public class Stacks<T> {
	// a genearalized impleemtaiton of stacks

	private static class StackNode<T> {
		private T data;
		private StackNode<T> next;

		public StackNode(T data) {
			this.data = data;
		}
	}

	private StackNode<T> top;

	public T pop() {
		if (top == null)
			throw new EmptyStackException();
		T item = top.data;
		top = top.next;
		return item;
	}

	public void push(T item) {
		StackNode<T> t = new StackNode<T>(item);
		t.next = top;
		top = t;
	}
	
	public Boolean isEmpty() {
		/*if(top == null) return true;
		return false;*/
		return top == null;//nice code minimizing
	}
	
	
}
