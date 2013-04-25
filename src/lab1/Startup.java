package lab1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jlombardo
 */
public class Startup {

    
    public static void main(String[] args) {
        final AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
			       new String[] {"applicationContext.xml"});
	
        PetOwner owner = (PetOwner)ctx.getBean("owner");
        
        System.out.println(owner.getName());
        
    }

}
