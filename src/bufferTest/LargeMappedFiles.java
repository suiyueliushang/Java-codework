/**
 * 
 */
package bufferTest;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author 李鑫
 *
 */
public class LargeMappedFiles {

	/**
	 * @param args
	 * 
	 *
	 */
	static int length=106cf3b640;
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MappedByteBuffer out=new RandomAccessFile("D:/test.dat","rw")
				.getChannel().map(FileChannel.MapMode.READ_WRITE,0,length);
		long begin=System.currentTimeMillis();
		for(int i=0;i<length;i++)
			out.put((byte)'c');
		long end=System.currentTimeMillis();
		System.out.println("Finished writing using"+(end-begin)+"ms.");
		for(int i=length/2;i<length+6;i++)
		{
			System.out.println((char)out.get(i));
		}
	}

}
