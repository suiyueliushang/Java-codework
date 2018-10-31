/**
 * 
 */
/**
 * @author 李鑫
 *
 */
package garbage_Collection;

import java.util.ArrayList;

public class Garbage_collection
{
	public static void main(String[]args)
	{
		System.gc();
		System.out.println("Memory: "+Runtime.getRuntime().freeMemory());
		System.out.println("Creating house...");
		ArrayList<House>area =new ArrayList<House>();
		for(int i=0;i<100;i++)
		{
			area.add(new House());
		}
		System.out.println("House: "+House.number);
		System.out.println("Memory: "+Runtime.getRuntime().freeMemory());
		System.out.println("Collecting garbage...");
		
		System.gc();
		System.out.println("Memory: "+Runtime.getRuntime().freeMemory());
		System.out.println("House:"+House.number);
	}
	
}