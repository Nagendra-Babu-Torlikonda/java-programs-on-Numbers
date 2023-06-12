package programs.numbers;

import java.util.Scanner;

public class DuckNumber
{

	public static void main(String[] args)
	{
		String n = new Scanner(System.in).next();
		if(n.charAt(0) != '0' && n.contains("0"))
			System.out.println("duck Number");
		else
			System.out.println("Not a duck number");
			

	}

}
