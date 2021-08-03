package COM.INNER;

public class MethodILocalInner {
	static int i=1000;
	MethodILocalInner()
	{
		System.out.println("Outer class"+i);
	}
	void methodOuter()
	{
		
		System.out.println("In method of outer class "+i);
		
		
		class LocalInner
		{   
		
		 	int j=2000;
			 LocalInner()
			{
				System.out.println("Local Inner Constructor"+i+" "+j);
			}
			
		}
		LocalInner l=new LocalInner();
	}
	
public static void main(String[] args) {
	MethodILocalInner o=new MethodILocalInner();
	o.methodOuter();
}
}

