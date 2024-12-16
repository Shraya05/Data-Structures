package tries;

import java.util.Arrays;
import java.util.List;

public class TrieMethods {
public static void  insert(TrieNode root,String s)
{
	TrieNode curr=root;
	for(char c:s.toCharArray())
	{
		if(curr.child[c-'a']==null)
		{
			TrieNode node=new TrieNode();
			curr.child[c-'a']=node;
		}
		curr=curr.child[c-'a'];
	}
	curr.wordEnd=true;
}
public static boolean search(TrieNode root,String s)
{
	TrieNode curr=root;
	for(char c:s.toCharArray())
	{
		if(curr.child[c-'a']==null)
			return false;
		curr=curr.child[c-'a'];
	}
	return curr.wordEnd;
}
public static void main(String[] args)
{
	TrieNode root=new TrieNode();
	List<String> list=Arrays.asList("and","ant");
	for(String s:list)
	{
		insert(root,s);
	}
	if(search(root,"and"))
	{
		System.out.print("present");
	}
	else
	{
		System.out.print("Not present");
	}
}
}
