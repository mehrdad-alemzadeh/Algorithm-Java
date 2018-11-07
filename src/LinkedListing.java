import java.util.HashSet;
import java.util.LinkedList;

/*
 Unlike an array, a linked list does not provide constant time access to a particular "index" within the list.
This means that if you'd like to find the Kth element in the list, you will need to iterate through K elements.
 */
public class LinkedListing {
	// create a singly linked list

	public class Node {
		Node next = null;
		int data;

		public Node(int d) {
			data = d;
		}

		public void appendToTail(int d) {
			Node end = new Node(d);
			Node n = this;// if you have multiple objects accessing the same linked list you need to have
							// a HEAD property. "this" refers to the current Node object that 
							// calls appendToTail
			while (n.next != null) {
				n = n.next;
			}
			n.next = end;
			while (n.next != null) {
				System.out.println(n.data);
				n = n.next;
			}
		}

		/*
		 * remove duplicates from a LL? iterate through the LL and add the elements to a
		 * hash table. if duplicates found remove and continue. O(N)
		 */
		public void removeDuplicates(Node n) {
			HashSet<Integer> set = new HashSet<Integer>();
			Node previous = null;
			while (n != null) {
				if (set.contains(n.data)) {
					previous.next = n.next;
				} else {
					set.add(n.data);
					previous = n;
				}
				n = n.next;
			}
		}

	}// end of class Node

	// find the Kth to the last element of a LL. sol1 iterate through the LL, sol2:
	// recursion
	public void findKthtoTheLastOf(Node n, int k) {
		int count = 0;
		Node runner = n;
		while (runner.next != null) {
			count++;
			if (count == k) {
				System.out.println(runner.data);
				break;
			}
			runner = runner.next;
		}

	}

	/*
	 * given value x in a serie, arrange the serie to have all the values less than
	 * x before it and all the values greater than equal to x after it. sol: if we
	 * do this with arrays it will be very expensive to shifts elements. using 2
	 * linkedlists we insert less than elements in one, and reater than equal in
	 * another one, and then merge them.
	 */
	public Node partition(Node node, int x) {
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;

		while (node != null) {
			Node next = node.next;
			node.next = null;
			if (node.data < x) {
				/* Insert node into end of before list */
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else {
				System.out.println("complete the code for after and merging");
			}
		}
		return beforeEnd;// this should be the merged linkedlist
	}

	/*
	 * add two numbers, represented in a linkedlist. if number 3->2->1 represents
	 * 123 (in reverse). suppose we have two of these, add them together. sol: take
	 * the first elements of each LL and sum them up. if not greater than 10, keep
	 * it in a Int variable, if >10, keep x-10 in the variable and add up 10 to the
	 * second LL element. and so on.
	 */

	/*
	 * see if a LL is a palindrome? Sol1: have two pointers, one will start from the
	 * begining and the second one will traverse till the end and captures the
	 * length too. we come backwards from the end and compare with the head until
	 * the middle. Sol2: if the size of LL is given the well and good, otherwise
	 * traverse and find it. then push the items till the middle one onto a stack
	 * (be careful about an odd size), and keep poping from middle till end if they
	 * are equal. sol3: if we don't know the size, we can have a fast and slow
	 * runners. fast runner runs twice faster than a slow one. once the fast runner
	 * reaches the end, we are at the middle with slow runner. while moving forward
	 * with slow runner, we keep pushing the items onto a stack. Stack<Integer>
	 * stack = Stack<Integer>(); then pop the items from the stack and keep going
	 * forward with the slow runner to compare. sol4: recursive :)
	 */

	/*
	 * we have two LLs which intersect at a node and continue. the size of each are
	 * not the same. find the intersect point. Sol1: traverse to the end starting
	 * from each head and keep pushing each node to a stack. once reached to the end
	 * on both, keep poping. if the first popout was not the same, then they don't
	 * have an intersect. else, keep poping till you get to a difference point, the
	 * next node is your intersection. Sol2: tranverse till the end on both LLs and
	 * keep the size. if the last nodes are different, then no intersection, else
	 * start from the begining, but on the longer LL, start from length minus length
	 * of the smaller LL. keep comparing till they get to the intersect.
	 */

	/*
	 * find if a LL has a loop, find the looping point; i.e. a-b-c-d-e-f-g-c, c is
	 * the looping point. sol1: use the slow/fast runner approach. like two cars
	 * running at different pace, the one running faster will eventually reaches the
	 * slower one. if the slow and fast runner come to the same node, then we have
	 * found the circular point. if the distance between them is 1, that means they
	 * have got to the point too.a b c d e f g h i j k c. once slow and fast runner
	 * met, we will have the count of the nodes based on the slow runner till then,
	 * let's call it l1. we'll move the slow runner further so that we can figure
	 * out the loop size, let's call it l2. l1-l2 points to the begining of the
	 * circle.
	 */

}
