package String;

public class Stringcomparingequals {

	public static void main(String[] args) {
		
		
		String s="welcome";
		System.out.println(s.equals("welcome"));
		System.out.println(s.equals("wel  come"));
		System.out.println(s.equals("w elcome"));
		
        System.out.println(s.equalsIgnoreCase("WELCOME"));
		

	}

}
