package util;


import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler( value =ArithmeticException.class)
	public void defaultErrorHandler(HttpServletRequest req,ArithmeticException e)throws Exception{
		e.printStackTrace();
		System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
		
	}
}
