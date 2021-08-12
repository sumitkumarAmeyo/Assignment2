package Questions;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Question6 {
	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(Question4.class.getName());
	    FileHandler fh = null; 
	    try {  

	        // This block configure the logger with handler and formatter  
	        fh = new FileHandler("Question6_Log.log");  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter);     

	    } catch (Exception e) {  
	        e.printStackTrace();  
	    } 
	    logger.info("printing table "); 
		tablePrint(3);
		 logger.info("printing table completes"); 
	}

	private static void tablePrint(int table) {
		for(int i=1;i<=10;i++) {
			System.out.println(table + " x " + i + " = " + table * i );
		}

	}

}
