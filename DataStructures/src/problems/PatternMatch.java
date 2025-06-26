package problems;

public class PatternMatch {
	public static void isMatch(String str,String pattern)
    {
        
        int i=0,j=0;
        while(i<str.length() && j<pattern.length())
        {
            char c=pattern.charAt(j);
            if(j+1<pattern.length() && pattern.charAt(j+1)=='+')
            {
                if(i>str.length() || str.charAt(i)!=c) return;
                while(i<str.length() && str.charAt(i)==c)
                {
                    i++;
                }
                j+=2;
            }
            else if(j+1<pattern.length() && pattern.charAt(j+1)=='*')
            {
                while(i<str.length() && str.charAt(i)==c)
                {
                    i++;
                }
                j+=2;
            }
            else
            {
                if(str.charAt(i)==c)
                {
                i++;
                j++;
                }
            }
        }
        Boolean found=(i==str.length());
        System.out.print(found);
        
    }
    public static void main(String[] args) {
     String str="bbc";
     String pattern ="a+b*cd*";
     //whether the given string has followed up th pattern or not
     isMatch(str,pattern);
    }
}
