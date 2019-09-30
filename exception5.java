
public class exception5 
{

	public static void main(String[] args) 
	{
	  System.out.println(1);
	  System.out.println(2);
	  try
	  {
		  System.out.println(3);
		  int a=200,b=0;
		  System.out.println(a/b);
		  System.out.println(4);
	  }
	  catch(Exception e)
	  {
		  System.out.println("Division by zero is not allowed");
		  System.out.println(5);
	  }
	  System.out.println(6);

	}

}
