package COM.INNER;



public class AnynomousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Custom Thread using runnable
		Runnable r = new Runnable() 
		{

			@Override
			public void run() 
			{
				System.out.println("IN Runnable Thread");
			}
		};
		Thread t1 = new Thread(r);
		t1.start();

		Thread t = new Thread() 
		{
			public void run() 
			{
				System.out.println("In Thread");
			}
		};
		t.start();

	}

}

