package multidimarrays;

public class multidimarraydemo1 {

	public static void main(String[] args) {


		
        int a[][]= {{100,200},{300,400},{500,600}};
		
		
		System.out.println("Number of Rows: " + a.length);
		System.out.println("Number of Colums: " + a[0].length);
		//enhaced for loop
		for (int r[]:a)
		{
			for(int i:r)
			{
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
	}

}
