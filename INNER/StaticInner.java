package COM.INNER;

	public class StaticInner {

		
		static int s=199;
		StaticInner()
		{
			System.out.println("Im default in Outer Class");
		}
		void m1()
		{
			System.out.println("Method outer"+s);
		}
		static class B//onlly static allow in static class
		{
			static int i=999;
			B()
			{
				System.out.println("Default inner class");
			}
			void m2()
			{
				System.out.println("Method inner"+s);
			}
			static void in()
			{
				System.out.println("Sttaic method Inner class"+i);
			}
		}
		
		public static void main(String[] args) {
			
			StaticInner out=new StaticInner();
			out.m1();
			StaticInner.B stin=new StaticInner.B();
			stin.m2();
			
			//stin.in();
			StaticInner.B.in();
		//	System.out.println("Im default in Outer Class"+i); 
			
			
		}
		}

