package Oop;

public class constructordemo {
	//default constructor
	
	int x;
	int y;
	
	
	constructordemo()
	{
		x=10;
		y=20;
	}
	void display()
	{
		System.out.println(x+y);
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		constructordemo cm1=new constructordemo();
		cm1.display();
	}

}
