import java.util.Scanner;

public class PrimeorNot {
public static void main(String[] args)
{ Scanner scan=new Scanner(System.in);
  int number;
  System.out.println("Enter the number");
  number=scan.nextInt();
  boolean result=checkPrime(number);
  System.out.println("The result of prime number test is : "+result);



}

private static boolean checkPrime(int number) {
	int flag=0;
	for(int i=2;i<number;i++)
	{if(number%i==0)
		flag=1;
	}
 if (flag==0)
 return true;
 else return false;


}
	
	
	
}
