/**
 * 
 */
package bufferTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 李鑫
 *
 */
public class BufferTest {
	private ArrayList<Integer> intStoreSource;
	private ArrayList<Integer> intStoreTarget;
	private  final int MAX_STORE_SIZE=1024*1024;
	private File file;
	
	public static int getRandomInt()
	{
		return (int)(Math.random()*255);
	}
	
	private void buildIntStore()
	{
		for(int i=0;i<MAX_STORE_SIZE;i++)
			intStoreSource.add(getRandomInt());
	}
	
	public BufferTest(File file)
	{
		this.intStoreSource=new ArrayList<Integer>();
		this.intStoreTarget=new ArrayList<Integer>();
		this.buildIntStore();
		this.file=file;
	}
	
	private void useFileInputStream()throws IOException
	{
		FileInputStream fis=new FileInputStream(file);		
		int intValue=fis.read();
		while(intValue!=-1)
		{
			this.intStoreTarget.add(intValue);
			intValue=fis.read();
		}
		fis.close();
	}
	
	private void useFileOutputStream()throws IOException
	{
		FileOutputStream fos=new FileOutputStream(file);
		for(int i=0;i<this.intStoreSource.size();i++)
		{
			fos.write(intStoreSource.get(i));
		}
		fos.close();
	}
	
	private void useBufferedInputStream()throws IOException
	{
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(new File("D:/test.dat")));
		int intValue=bis.read();
		while(intValue!=-1)
		{
			this.intStoreTarget.add(intValue);
			intValue=bis.read();
		}
			bis.close();
	}
	
	private void useBufferedFileOutputStream()throws IOException
	{
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(this.file));
		for(int i=0;i<this.intStoreSource.size();i++)
		{
			bos.write(intStoreSource.get(i));
		}
		bos.close();
	}
		
		private void test()throws IOException
		{
			System.gc();
			long time1=System.currentTimeMillis();
			this.useFileOutputStream();
			long time2=System.currentTimeMillis();
			this.useFileInputStream();
			long time3=System.currentTimeMillis();
			
			this.intStoreTarget=new ArrayList<Integer>();
			System.gc();
			long time4=System.currentTimeMillis();
			this.useBufferedFileOutputStream();
			long time5=System.currentTimeMillis();
			this.useBufferedInputStream();
			long time6=System.currentTimeMillis();
			
			System.out.println("FileOutputStream: "+(time2-time1)+"\t\t"+"FileInputStream: "+(time3-time2));
			
			System.out.println("BufferedOutputStream: "+(time5-time4)+"BufferedInputStream"+(time6-time5));
		}
			
			
			public static void main(String[] args)
			{
				BufferTest test=new BufferTest(new File("D:/test.dat"));
				try
				{
					test.test();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		
	
			
}
