
public class Assignment2 {

	public static void main(String[]args)
	{
		for(int i=1;i<50;i++)
		{ 
			if((i%3==0)&&(i%5==0))
			     System.out.println(" abcxyz");
			else
                        {
			if(i%3==0)
			System.out.println(" abc");
			else
			if(i%5==0)	
			 System.out.println(" xyz");
			else
			System.out.println(" "+i);	
		}
		}
		
	}
	
	
	
}
