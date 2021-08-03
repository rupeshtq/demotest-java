package COM.INNER;


public class RegularInnerClass {
	static int s=199;
	RegularInnerClass()
	{
		System.out.println("Im default in Outer Class");
	}
	void m1()
	{
		System.out.println("Method outer"+s);
	}
	class B
	{
		B()
		{
			System.out.println("Default inner class");
		}
		void m2()
		{
			System.out.println("Method inner"+s);
		}
		//static void in() // The method in cannot be declared static;
	}
	public static void main(String[] args) {
		RegularInnerClass r= new RegularInnerClass();
		r.m1();
		RegularInnerClass.B in=r.new B();
		in.m2();
	}
	}
			


