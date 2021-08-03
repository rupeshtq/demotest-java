package COM.INNER;

 public class Demo
 {
	int i=50;

	public class B
	{
		int i = 100;

		B() 
		{
			System.out.println(" inner value :"+i);
			System.out.println("outer value :"+Demo.this.i);
		}
	
	}
 }
 


