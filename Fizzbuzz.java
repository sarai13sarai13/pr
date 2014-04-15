package sample;



public class Fizzbuzz 
{
	public static void main(String[] args)
	{
		
		System.out.println("Fizz Buzz LINE");
		
		for(int i = 0;i<=10000;i++)
			if(i % 15 ==0)
			System.out.println(i+":Fizz Buzz");
			else if(i % 5 ==0)
				System.out.println(i+":Buzz");
			else if(i % 3 == 0)
				System.out.println(i+":Fizz");
			else
				System.out.println(i+"");

		
	
		
		
	}
	
	
}
