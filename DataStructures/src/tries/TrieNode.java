package tries;

public class TrieNode {

	TrieNode[] child;
	boolean wordEnd;
	public TrieNode()
	{
		child=new TrieNode[26];
		wordEnd=false;
	}
}
