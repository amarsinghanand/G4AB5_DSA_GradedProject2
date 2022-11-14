package com.gl.iitr.fsd.gp.dsa.mnctransactions;

public class MNCTransactionService {

	public static void main(String[] args) {
		SkewedBinarySearchTree tree = new SkewedBinarySearchTree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		int order = 0;
		tree.createSkewedTree(tree.node, order);
		System.out.println("The converted binary search tree into a skewed tree is: ");
		tree.traverseRightSkewed(tree.headNode);

	}

}
