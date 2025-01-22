package tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left,right;
	Node(int val)
	{
		data=val;
		left=right=null;
	}
}
public class BinaryTree {
	Node root;
	void insert(int val)
	{
		Node newnode=new Node(val);
		if(root==null)
		{
			root=newnode;
			return;
		}
		Queue<Node> q=new LinkedList<>();
		q.add(root);
	while(!q.isEmpty())
	{
		Node curr=q.poll();
		if(curr.left==null)
		{
			curr.left=newnode;
			return;
		}
		else
		{
			q.add(curr.left);
		}
		if(curr.right==null)
		{
			curr.right=newnode;
			return;
		}
		else
		{
			q.add(curr.right);
		}
	}
	}
	public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
	}
	public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        System.out.print("In-order Traversal: ");
        tree.inOrder(tree.root);
}
}
