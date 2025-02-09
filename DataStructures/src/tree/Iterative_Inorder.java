package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iterative_Inorder {
	public static List<Integer> inorder(Node node)
	{
List<Integer> li=new ArrayList<>();
Stack<Node> st=new Stack<>();
while(true)
{
	if(node!=null)
	{
		st.push(node);
		node=node.left;
	}
	else
	{
		if(st.isEmpty()) break;
		node=st.pop();
		li.add(node.data);
		node=node.right;
	}
}
return li;
	}
}
