/**
 * 
 */
package javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 李鑫
 *
 */
public class FlieStreamTester {
	private FileInputStream fis;
	private FileOutputStream fos;

	public FlieStreamTester(File file) throws IOException {
		creatFile(file);
		this.fis = new FileInputStream(file);
		this.fos = new FileOutputStream(file);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try
		{
			File file=new File("D:/text.txt");
			FileWriter writer=new FileWriter(file);
			writer.write("Cose".toCharArray());
			writer.write("软件学院".toCharArray());
			writer.write("-1");
			writer.write(97);
			writer.flush();
			FileReader reader=new FileReader(file);
			int character =reader.read();
			while(character!=-1)	
			{System.out.print((char)character);
			character=reader.read();
			}
			writer.close();
			reader.close();
//			File file=new File("D:/test.dat");
//			FlieStreamTester tester =new FlieStreamTester(file);
//			tester.write(305);
//			tester.write('a');
//			tester.write("Cose".toCharArray());
//			tester.write("软件学院".toCharArray());
//			System.out.println(tester.available()+"size");
//			int i=tester.read();
//			while(i!=-1)
//			{
//				System.out.println((char)i);
//				i=tester.read();
//			}
//			tester.close();
			}
		catch(IOException e)
		{
//			e.printStackTrace();
		}
	}

	public static void creatFile(File file) throws IOException {
		if (!file.exists() || !file.isFile())
			file.createNewFile();
	}

	public void close() throws IOException {
		fis.close();
		fos.close();
	}

	public int read() throws IOException {
		return fis.read();
	}

	public void write(int i) throws IOException {
		fos.write(i);
	}

	public void write(byte[] b) throws IOException {
		fos.write(b);
	}
	public void write(char[] c)throws IOException{
		for(int i=0;i<c.length;i++)
			fos.write(c[i]);
	}

	public void write(String s) throws IOException {
		fos.write(s.getBytes());
	}

	public int available() throws IOException {
		return fis.available();
	}
	

}
