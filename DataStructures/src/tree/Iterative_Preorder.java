package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iterative_Preorder {
public static List<Integer> preorder(Node root)
{
	List<Integer> li = new ArrayList<>();
	Stack<Node> st=new Stack<>();
	if (root==null) return li;
	st.push(root);
	while(!st.isEmpty())
	{
		Node curr=st.pop();
		li.add(curr.data);
		if(curr.right!=null) st.push(curr.right);
		if(curr.left!=null) st.push(curr.left);
	}
	return li;
}
}
