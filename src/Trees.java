/*
 * a bin search tree, is a bin tree that left node is <= its root, and right
 * node is >. 
 * balanced tree: the left and right sub tree's height differ by at
 * most 1. left sub tree is balanced and right sub tree is balanced. there are
 * two kinds of balanced trees: 
 * 1. red-black: is a kind of balanced bin search
 * tree, that has a color property which keeps the tree balanced at insertions
 * and deletions. 
 * 2. AVL: similar to red-black, but faster. 
 * Complete bin tree: a bin tree, that all the levels are full, and if blank 
 * they are pending on the right side. 
 * full bin tree: a bin tree that every node has 0 or 2 children.
 * perfect bin tree: full+complete, it has to have 2^k-1 node (k=levels). 
 * min heap tree: a complete bin tree, that each node is smaller than it's children,
 * therefore root holds the min. min heap has two methods, insert and
 * extract_min. insert will place the node at the right most and then bubble it
 * up to locate it at the appropriate location; O(lon n).
 * Trie/prefix tree: it's a tree with empty root and each node has a char which 
 * when traversed down the combination of nodes represents a word. int his way 
 * prefixes can be found in O(k).
 * a tree is a connected graph without cycles. A graph is simply a collection of 
 * nodes with edges between (some of) them. graphs can be directed/undirected, 
 * with cycles or acyclic, connected/isolated. we can represent the connections
 * between nodes using an adjacency matrix. The two most common ways to search a 
 * graph are depth-first search (DFS) and breadth-first (BFS) search. if we are 
 * interested to visit all the nodes we can use DFS, but if we want to find the 
 * shortest path BFS is used.
 * Additional Reading: Topological Sort (pg 632), Dijkstra's Algorithm (pg 633), 
 * AVL Trees (pg 637), RedBlackTrees (pg 639).
 */

public class Trees<T> {

	private static class TreeNode<T> {
		private T data;
		private TreeNode<T> left, right;

		public TreeNode(T data) {
			this.data = data;
		}

	}// end of TreeNode class

	public TreeNode<Integer> buildSampleTree() {
		TreeNode<Integer> a = new TreeNode<Integer>(1);
		TreeNode<Integer> b = new TreeNode<Integer>(2);
		TreeNode<Integer> c = new TreeNode<Integer>(3);
		TreeNode<Integer> d = new TreeNode<Integer>(4);
		TreeNode<Integer> e = new TreeNode<Integer>(5);
		TreeNode<Integer> f = new TreeNode<Integer>(6);
		TreeNode<Integer> g = new TreeNode<Integer>(7);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		f.right = g;
		return a;
	}

	public void inOrderTraversal(TreeNode<Integer> root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.println(root.data);
			inOrderTraversal(root.right);
		}
	}

	public void preOrderTraversal(TreeNode<Integer> root) {
		if (root != null) {
			System.out.println(root.data);
			inOrderTraversal(root.left);
			inOrderTraversal(root.right);
		}
	}

	public void postOrderTraversal(TreeNode<Integer> root) {
		if (root != null) {
			inOrderTraversal(root.left);
			inOrderTraversal(root.right);
			System.out.println(root.data);
		}
	}
}
