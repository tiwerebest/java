package Oop;

public class constructor {

	

	int sid;
	String sname;
	char Grade;
	
	
	constructor(int id, String name, char g)
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
