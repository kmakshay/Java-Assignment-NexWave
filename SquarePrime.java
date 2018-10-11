
public class SquarePrime {
	public static void main(String[] args)

	{
		int num = 2, sqr;
		while (true) {
			sqr = 0;
			if (isPrime(num)) {
				sqr = num * num;
				if (sqr <= 900)
					System.out.println(sqr);

			}
			if (sqr > 900)
				break;
			num++;

		}

	}

	private static boolean isPrime(int num) {
		int i, count;
		if (num == 2)
			return true;
		else

		{
			count = 0;
			for (i = 2; i < num; i++) {
				if (num % i == 0)
					count++;

			}
			if (count > 0)
				return false;
			else
				return true;

		}

	}
}
