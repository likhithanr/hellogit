//reversing even position string with using built in function

package javademo;

public class SentenceRev {

	public static void main(String[] args) {
		String s = "this is madhan";
		
		String[] c = s.split(" ");
		for(int i =0;i<=c.length-1;i++) //if you give(for(i=c.length-1;i>=0;i--)--> nahdam is siht
			{ 
			//System.out.println(c[i]);
			
			if(i%2 == 0)                                            //oput: siht is nahdam
			{
			  StringBuffer st = new StringBuffer(c[i]).reverse();
		
				System.out.print(st+" ");
				
				
			}
			if(i%2!=0)
			{
				System.out.print(c[i]+" ");
			}
				
			//System.out.print(c[i]+" ");
		}
		

	}

}
