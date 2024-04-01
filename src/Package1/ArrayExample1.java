package Package1;

public class ArrayExample1 {

	public static void main(String[] args) {
		
		int a[] = new int[5];       //this declaration is used when array size is fixed
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		int b[]= {100,200,300,400}; //Use when array size is not fixed, it may varies in future
		
		//Find length of an array
		System.out.println("Length of an array ="+a.length);
		System.out.println("Length of an array ="+b.length);
		
		//Read value from specific index
		System.out.println(a[4]);
		
		//Read all the values from the array
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
