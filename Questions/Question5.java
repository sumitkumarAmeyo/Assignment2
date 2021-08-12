package Questions;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Question5 {


	public static void main(String args[])  
	{    
		final Logger logger = Logger.getLogger(Question4.class.getName());
	    FileHandler fh = null; 
	    try {  

	        // This block configure the logger with handler and formatter  
	        fh = new FileHandler("Question5_Log.log");  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter);  

	    } catch (Exception e) {  
	        e.printStackTrace();  
	    } 
	    
	    logger.info("fibonacci series without recusion started"); 
		printWithoutRecursion();  
		logger.info("fibonacci series without recusion completes"); 
		logger.info("fibonacci series with recusion started"); 
		printWithRecursion(50);  
		logger.info("fibonacci series with recusion completes"); 
	}

	private static void printWithRecursion(long count) {
		for (int i = 0; i < count; i++) {
			System.out.print(fib(i) + " ");
		}
		System.out.println();
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
		System.out.println();
	}
}
