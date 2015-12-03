package antbuild;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMessageUtil {

	String message = "Manisha";	
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testPrintMessage() {	
	      System.out.println("Inside testPrintMessage()");     
	      Assert.assertEquals(message,messageUtil.printMessage());
	      Properties prop=new Properties();
			InputStream input=null;
			try
			{
				input=new FileInputStream("CommonProperties\\tes.properties");
				prop.load(input);
				System.out.println(prop.getProperty("x3"));
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
	   }

	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "Manisha";
	      Assert.assertEquals(message,messageUtil.salutationMessage());
	   }
}
