import java.util.NoSuchElementException;

/*
	 * FIFO. methods: add, remove, peek, isEmpty. used is in breadth-first search or in implementing a cache
	 * ###work on mixed data structures like array or LL of Queues
	 */
public class Queues<T> {
	private static class QueueNode<T> {
		private T data;
		private QueueNode<T> next;

		public QueueNode(T data) {
			this.data = data;
		}
	}// end of QueueNBode

	private QueueNode<T> first;
	private QueueNode<T> last;

	public void add(T item) {
		QueueNode<T> t = new QueueNode<T>(item);
		if (last != null) {
			last.next = t;
		}
		last = t;
		if (first == null) {
			first = last;
		}
	}// end of add

	public T remove() {
		if (first == null)
			throw new NoSuchElementException();
		T item = first.data;
		first = first.next;
		if (first == null) {
			last = null;
		}
		return item;
	}// end of remove

	public T peek() {
		if (first == null)
			throw new NoSuchElementException();
		return first.data;
	}//end of peek

	public boolean isEmpty() {
		return first == null;
	}//end of isEmpty
}
