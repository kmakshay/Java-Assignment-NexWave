import java.util.Scanner;

public class NumberUtil {public static void main(String[] args)
   	{ Scanner scan=new Scanner(System.in);
   	  int num1,num2;
   	 
   	  int choice;
   	  System.out.println("Enter your option number 1.Product 2.Square root");
   	   choice=scan.nextInt();
   	   
   	   switch(choice)
   		   
   	   { case 1 : {System.out.println("Enter the two numbers");
    	  num1=scan.nextInt();
       	  num2=scan.nextInt();
       	  product(num1,num2);
   		  break; 
   	   }
   	case 2 : {System.out.println("Enter the number");
	  num1=scan.nextInt();
 	 
 	  sqrt(num1);
   	break;
   	}
   	
   	
   	default:
   	{
   		System.out.println("please enter a option between 1 and 2");
   		break;
   		
   	}
   	
   	
   	
   	   }
   	  
	
	}

private static void product(int num1, int num2) {
	int product=num1*num2;
	System.out.println("The product of the two numbers is "+product);
	
}

private static void sqrt(int num1) {
	System.out.println("The square root of the number is :" +Math.sqrt(num1));
	
}

}
