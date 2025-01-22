package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelMax {

	public void maximum(Node root)
	{
		Queue<Node> q=new LinkedList<>();
		List<Integer> li=new ArrayList<>();
		
		if(root==null) return;
		q.add(root);
		while(!q.isEmpty())
		{
			int size=q.size();
			int max=Integer.MIN_VALUE;
			
			for(int i=0;i<size;i++)
			{
				Node curr=q.poll();
				if(curr.left!=null) q.add(curr.left);
				if(curr.right!=null) q.add(curr.right);
				max=Math.max(max,curr.data);
			}
			li.add(max);
		}
		System.out.print(li);
	}
}
