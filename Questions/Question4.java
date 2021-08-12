package Questions;

import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Question4 {
	public static void main(String[] args) {
		
		final Logger logger = Logger.getLogger(Question4.class.getName());
	    FileHandler fh = null; 
	    try {  

	        // This block configure the logger with handler and formatter  
	        fh = new FileHandler("Question4_Log.log");  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter);     

	    } catch (Exception e) {  
	        e.printStackTrace();  
	    } 
	    
	    
		int[] intArray=new int[100];
		Random random = new Random(); 
		logger.info("populating array"); 
		for(int iterator=0;iterator<100;iterator++) {
			intArray[iterator]=random.nextInt(1000);
		}
		logger.info("index based  iteration"); 
		for(int i=0;i<100;i++) {
			System.out.print(intArray[i]+" ");
		}
		logger.info("for Each iteration"); 
		for(int i:intArray) {
			System.out.print(i+" ");
		}

	}
}
