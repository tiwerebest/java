package intheritence;



class A  //parent class
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A  //B is child class, A is parent class
{
	int b;
	void print()

	{
		System.out.println(b);
	}
}
public class inheritencedemo1 {
	

	public static void main(String[] args) {
   A aobj=new A();
   aobj.a=100;
   aobj.display();
   
   B bobj=new B();
   bobj.b=200;
   bobj.a=100;
   bobj.display();
   bobj.print();

		

	}

}
