/**
 * 
 */
package garbage_Collection;

/**
 * @author 李鑫
 *
 */
public class House {
	public House() {
		number++;
}

	protected void finalize()throws Throwable  
	{
		System.out.println("House destructed!");
       number--; 
    }  
	
public static int number=0;
}
