package COM.INNER;


    
public class AA
{
	

	 static int j=50;
	static void by1()
	{
		System.out.println(" outer AA");
	}


	

	public static class BB {
		static int i = 100;

	void By2() {
		System.out.println("Inner BB");
			System.out.println(" inner value :"+i);
			System.out.println("outer value :"+j);
		}
	}
}




