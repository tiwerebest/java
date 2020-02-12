package overloading;

public class methodoverloading {


		
		
		void add (int a, int b)
		{
			System.out.println(a+b);
		}

		
		void add (int a, double b)
		{
			System.out.println(a+b);
		}

		void add (double a, double b)
		{
			System.out.println(a+b);
		}

		void add (int a, int b, int c)
		{
			System.out.println(a+b);
		}

		public static void main(String[] args) {
			
			
	methodoverloading mo=new methodoverloading();
	mo.add(10, 20); //1
	mo.add(1, 2.0); //2
	mo.add(10.0, 3.0);//3
	mo.add(1, 2, 3);//4
		
	}

}
