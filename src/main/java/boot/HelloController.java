package boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Person;


@RestController
public class HelloController {
	@RequestMapping(value="/hello")
	public Person hello(){
		return new Person("qqq",12);
	}
	@RequestMapping(value="/getPerson1")
	public String getPerson(){
		Person person=new Person("周qwe",11);
		return person.getName();
	}
	@RequestMapping(value="/getPerson")
	public String getPersonA(){
		Person person=new Person("周qwer",11);
		return person.getName();
	}
	@RequestMapping(value="/exception")
	public int math(){
		return 12/0;
	}
//	@ExceptionHandler
//	public String defaultErrorHandler(HttpServletRequest req,Exception e) throws Exception {
//		e.printStackTrace();
//		System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
//		return "error";
//	}
}
