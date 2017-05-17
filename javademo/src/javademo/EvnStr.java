package javademo;

public class EvnStr {
	public static void main(String[] args) {
		String  rc = null;
		String s="abcdefwtuoypefgwz";
		int j = 0;
		char c[] = s.toCharArray();
		char d[] = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if( i%2 == 0)
			{
				d[j] = c[i];
				j++;
			}
				
		}
		
		for(int i=j-1;i>=0;i--)
		{
			System.out.print(d[i]+" ");
		}

	}	
}