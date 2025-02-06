package tree;
import java.util.*;
public class InorderPredecessor {
	public static void Inorder(Node root,List<Integer> res)
    {
        
        if(root==null) return;
        Inorder(root.left,res);
        res.add(root.data);
        Inorder(root.right,res);
    }
public static void find(Node root,int val )
{
    List<Integer> li=new ArrayList<>();
    Inorder(root,li);
    for(int i=0;i<li.size();i++)
    {
        if(li.get(i)== val)
        {
            if(i>0) System.out.print(li.get(i-1));
        }
    }
    
}
public static void main(String[] args) {
	Integer[] arr={1,2,3,4,5,6};
	Node node=insert(arr);
   find(node,3);
}

}
