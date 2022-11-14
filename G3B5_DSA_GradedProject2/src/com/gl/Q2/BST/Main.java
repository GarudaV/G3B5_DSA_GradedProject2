package com.gl.Q2.BST;

public class Main{

    public static Node node;
    static Node prevNode = null;
    static Node newHead = null;

	    static void BSTprocess(Node root){
	        if(root == null) {
	        	return;
	        }	

	        BSTprocess(root.left);
	        Node rightNode = root.right;

	        if(newHead == null)
	        {
	            newHead = root;
	            root.left = null;
	            prevNode = root;
	        }
	        else
	        {
	        	prevNode.right = root;
	            root.left = null;
	            prevNode = root;
	        }
	        BSTprocess(rightNode);
	    }  
	    static void traverse(Node root){

	        if(root == null)
	        	return;
	        System.out.print(root.val + " ");
	        traverse(root.right);       
	    }

public static void main(String[] args) {

        node = new Node(50);
        node.left = new Node(30);
        node.right = new Node(60);
        node.left.left = new Node(10);
        node.right.left= new Node(55);

        BSTprocess(node);
        traverse(newHead);
    }
}
