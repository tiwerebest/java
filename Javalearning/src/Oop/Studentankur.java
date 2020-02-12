package Oop;

public class Studentankur {

	int sid;
	String sname;
	char Grade;
	
	
	void getValues(int id,String name,char g)
	//Method 
	{
	    sid=id;
	    sname=name;
	    Grade=g;
	    
	}
	
	void display()
	{
		System.out.println(sid+" "+sname+" "+Grade);
	}
	
	
	
	
}
