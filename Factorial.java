import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{Scanner scan = new Scanner(System.in);
	
	 int num;
	 System.out.println("Enter the number");
	 num=scan.nextInt();
	 
	 int result=fact(num);
	 System.out.println("The result is : "+result);
		
		
		
		
		
		
	}

	private static int fact(int num) {
		int fact=1,count=1;
		
		while(count<=num)
		{ fact=fact*count;
		count++;
			
			
		}
		return fact;
	}
	
	
	

}
