package hello;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloApp {

	public static void main(String[] args) {
	
		//my first pgm
		
		Logger logger = Logger.getLogger(HelloApp.class.getSimpleName());
		
		logger.log(Level.INFO, "Hello sreeya!!");

	}

}
