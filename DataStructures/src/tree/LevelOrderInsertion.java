package tree;
import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int val)
    {
        data=val;
        left=right=null;
    }
}
public class LevelOrderInsertion {
	public static Node insert(Integer[] arr)
    {
        if(arr.length==0 && arr[0]==null) return null;
        
        Node root=new Node(arr[0]);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<arr.length && !q.isEmpty())
        {
            Node curr=q.poll();
            if(arr[i]!=null)
            {
                curr.left=new Node(arr[i]);
                q.add(curr.left);
            }
            i++;
            if(i<arr.length && arr[i]!=null)
            {
                curr.right=new Node(arr[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    public static void print(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node curr=q.poll();
            System.out.print(curr.data);
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
        }
    }
	public static void main(String[] args) {
		Integer[] arr={1,2,3,null,5,6};
		Node node=insert(arr);
		print(node);
	}

}
