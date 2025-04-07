package list;

public class ReverseList {
public static void reverse(int arr[])
{
	Node head;
	Node prev=null,curr=head,next=null;
	while(curr!=null)
	{
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
	}
	head=prev;
}
//using stack
public static void reverseUsingStack(Node head)
{
	Stack<Node> st=new Stack<>();
	Node temp=head;
	while(temp!=null)
	{
		st.push(temp);
		temp=temp.next;
	}
	if(!st.isEmpty())
	{
		head=st.pop();
		temp=head;
		while(!st.isEmpty())
		{
			temp.next=st.pop();
			temp=temp.next;
		}
	}
	temp.next=null;
}
return head;
}
