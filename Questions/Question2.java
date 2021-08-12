package Questions;

public class Question2 {

	public static void main(String[] args)   
	{  
		for (int i = 0; i <= 5; i++)  
		{  
			int n = 10;  
			for (int j = 0; j<= n - i; j++)   
			{   
				System.out.print(" ");   
			}   
			for (int k = i; k >= 0; k--)  
			{  
				System.out.print(k);  
			}  
			for (int l = 1; l <= i; l++)   
			{  
				System.out.print(l);   
			}   
			System.out.println();   
		}   
	}  

}
