//reversing even position string without using built in function
package javademo;

public class revwtoutbuilt {

	public static void main(String[] args) {
		String s = "this is madhan";
		String[] c = s.split(" ");
		String revstring = "";
		for(int i =0;i<=c.length-1;i++) //if you give(for(i=c.length-1;i>=0;i--)--> nahdam is siht
			{ 
			 	if(i%2 == 0)                                            //oput: siht is nahdam
			{
				   String word =c[i]; 
	        	   String rev = "";
	        	   for(int n=word.length()-1;n>=0;n--)
	        	   {
	        		   rev = rev + word.charAt(n);
	        	   }
	        	   revstring = revstring + rev + "";
	        	   System.out.print(rev + " ");
	           
			}	
			if(i%2!=0)
			{
				System.out.print(c[i] + " ");
			}
				
		}
		

	}

}
