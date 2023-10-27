import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     String s="The quick brown fox jumps over the lazy dog";
	     s=s.toLowerCase();
	Set<Character> set=new HashSet<>();
	for(int i=0;i<s.length();i++){
	     char c=s.charAt(i);
	     if(c>='a'&&c<='z'){
	          set.add(c); 
	     }
	    
	}
	if(set.size()==26){
	     System.out.println("Yes, this string is a pangram");
	}else{
	     System.out.println("No, this string is not a pangram");
	}
	}
}
