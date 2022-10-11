package pgm_task2;

import java.util.Scanner;

public class Fibonacci {
	static void fibo(int n)
	{
		int f1=0,f2=1;
		System.out.print(f1+ " "+f2+" ");
		for(int i=1; i<=n-2;i++)
		{
			int f3=f2+f1;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;	
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number how many fibonacci seris you want.");
		int x=sc.nextInt();
		
		fibo(x);
	}

}
