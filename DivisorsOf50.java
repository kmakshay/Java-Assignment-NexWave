
public class DivisorsOf50 {

	public static void main(String[] args)

	{
		System.out.println("The divisors of 50 are: ");
		for (int i = 1; i <= 50 / 2; i++)
			if (50 % i == 0)
				System.out.println(i);
	}

}
