//Try block doesnot have any exception then catch block doesnot execute
public class exception_in_catchblock {

	public static void main(String[] args)
	{
		try
		{  
			System.out.println("ratan");
			System.out.println("anu");
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(10/0);
		}
		System.out.println(2);

	}

}
