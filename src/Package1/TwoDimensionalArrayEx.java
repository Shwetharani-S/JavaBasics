package Package1;

public class TwoDimensionalArrayEx {

	public static void main(String[] args) {
		// Declaration
		int a[][]=new int[2][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		
		int b[][]= {{100,200},{300,400}};
		
		//Find length of rows and columns
		System.out.println("Length of rows:"+a.length);
		System.out.println("Length of columns:"+a[0].length);
		
		//Read single value from specific index
		System.out.println(a[1][0]);
		
		//Read all values from array
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.println(a[i][j]);
			}		
	}
		//Using for each loop
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.println(x);
			}
		}
	}

}
