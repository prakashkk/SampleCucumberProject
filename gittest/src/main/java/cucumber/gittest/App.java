package cucumber.gittest;

import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	
	@Test
    public void test()
    {
        System.out.println( "Hello World!" );
        
        String str= "eddftuuubn";
        
      for(int i=0;i<str.length()-1;i++)
        {
        	if(str.charAt(i)==str.charAt(i+1))
        	{
        		continue;
        	}
        	else
        	{
        		try
        		{
        		System.out.println(str.charAt(i));
        		}
        		finally
        		{
        			
        		}
        	}
        	
        }
       
    }
}



class A
{
	static int i=0;
	
	A()
	{
		i++;
		
	}
	
}