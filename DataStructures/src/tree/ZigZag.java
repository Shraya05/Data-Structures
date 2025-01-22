package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZag {

	public void zigzagtraversal(Node root)
	{
		
		Queue<Node> q= new LinkedList<>();
		q.add(root);
		boolean leftToRight=true;
		while(!q.isEmpty())
		{
			int size=q.size();
			List<Integer> li=new ArrayList<>();
			Node curr=q.poll();
			for(int i=0;i<size;i++)
			{
				li.add(curr.data);
				if(curr.left!=null) q.add(curr.left);
				if(curr.right!=null) q.add(curr.right);	
			}
			if(!leftToRight)
			{
				Collections.reverse(li);
			}
			System.out.print(li);
			leftToRight=!leftToRight;
			
		}
	}
}
