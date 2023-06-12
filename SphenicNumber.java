package programs.numbers;

import java.util.Scanner;

public class SphenicNumber
{

	static boolean isPrime(int n)
	{
		int flag = 1;
		for(int i = 2; i < n ; i++)
			if(n % i == 0)
			{
				flag = 0;
				break;
			}
		if(n == 1)
			return false;
		else if(flag == 1)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		int n = new Scanner(System.in).nextInt();
		int count = 0, product = 1, j = 0, k = 0;
		int arr[] = new int[8];
		int primes[] = new int[3];
		for(int i = 1; i <= n; i++)
			if(n % i == 0 && count < 8)
			{
				arr[j++] = i;
				count++;
				if(isPrime(i))
					primes[k++] = i;
			}
//		for(int i: arr)
//			System.out.println(i + "  ");
//		for(int i: primes)
//			System.out.println(i + "  ");
		if(count == 8 && (primes[0] * primes[1] * primes[2] == n))
			System.out.println("Sphenic Number");
		else
			System.out.println("Not a Sphenic Number");
	}

}
