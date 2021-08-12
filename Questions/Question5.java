package Questions;

public class Question5 {


	public static void main(String args[])  
	{    
		printWithoutRecursion();  
		System.out.println();
		printWithRecursion(50);   
	}

	private static void printWithRecursion(long count) {
		for (int i = 0; i < count; i++) {
			System.out.print(fib(i) + " ");
		}
	}

	private static long fib(long count) {
		if(count<=1)
			return count;
		return fib(count-1) + fib(count-2);
	}

	private static void printWithoutRecursion() {
		long firstNum=0,secNum=1,fibonacci,i,count=50;    
		System.out.print(firstNum+" "+secNum);//printing 0 and 1    

		for(i=2;i<count;++i)//loop starts from 2 
		{    
			fibonacci=firstNum+secNum;    
			System.out.print(" "+fibonacci);    
			firstNum=secNum;    
			secNum=fibonacci;    
		}  
	}
}
