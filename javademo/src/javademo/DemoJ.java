package javademo;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class DemoJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fl = (float)4.5;
	
		System.out.println(fl);
		String input = "1 fish 2 fish red fish blue fish";
	    /** Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();*/
		String input1 = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input);
		s.findInLine("\\s*fish\\s*");
		MatchResult result = s.match();
		for (int i=1; i<=result.groupCount(); i++)
		System.out.println(result.group(i));
		s.close();
		int x=10;
		if(x == 20)
		{
			System.out.println("yes x == 10");
		}
		else
		{
			System.out.println("no x !=20");
		}
		//Scanner sc = new Scanner(System.in);
		
	}

}
