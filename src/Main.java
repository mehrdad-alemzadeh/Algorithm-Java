import java.util.ArrayList;

public class Main {
	public static void main (String[] arg) {
	ArrayFunctionality arrayFun = new ArrayFunctionality();
	ArrayList<String> list = new ArrayList<String>();
	String[] arg1 = new String[]{"firstarg", "secondarg", "thirdarg"};
	String[] arg2 = new String[]{"firstarg", "secondarg", "thirdarg"};
	System.out.println(arrayFun.mergeArrays(arg1, arg2));
	
	System.out.println(arrayFun.concatString(arg1));
		
	System.out.println(arrayFun.isUnique("abcdefghi"));
	///////////////////LINKED LIST///////////////////////////////////
	LinkedListing ls = new LinkedListing();
	LinkedListing.Node node1 = ls.new Node(1);
	LinkedListing.Node node2 = ls.new Node(2);
	LinkedListing.Node node3 = ls.new Node(3);
	LinkedListing.Node node4 = ls.new Node(4);
	node1.appendToTail(5);
	node2.appendToTail(6);
	node3.appendToTail(7);
	
	Stacks<Integer> s = new Stacks<Integer>();
	s.push(1);
	s.push(2);
	s.push(3);
	System.out.println("stack output: "+s.pop()+s.pop()+s.pop());
	
	Queues<Integer> q = new Queues<Integer>();
	q.add(1);
	q.add(2);
	q.add(3);
	System.out.println("Queues output: "+q.remove()+q.remove()+q.remove());
	
	System.out.println("Tree in order Travesal:");
	Trees<Integer> t = new Trees<Integer>();
	t.inOrderTraversal(t.buildSampleTree());
	//t.get();
	}
}
