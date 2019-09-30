
public class noexception_tryblock {

	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/2);
		}
		catch(Exception e)
		{
			System.out.println("Waiting to capture");
		}
		System.out.println(2);

	}

}
