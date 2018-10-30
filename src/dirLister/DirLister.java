import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 */

/**
 * @author 李鑫
 *
 */
public class DirLister   {
public void listDirectory(File file, FilenameFilter filter, Comparator comparator)
 {
	 if(!file.exists()) {
		 System.out.println("Path Error.");
	 }
	 else
		 if(file.isFile()) {
			 System.out.println("Not a dictionary.");
		 }
		 else
		 {
			 File[] files=file.listFiles(filter);
			 System.out.println(files.length);
			 Arrays.sort(files,comparator);
			 for(int i=0;i<files.length;i++)
			 {
				 if(files[i].isFile())
				 {
					 System.out.println(files[i]);
				 }
			 }
		 }
 }
 public static void main(String[]args)
 {
	 DirLister lister =new DirLister();
	 DirFilter filter=new DirFilter(".*log");
	 lister.listDirectory(new File("C:/Windows"),filter, null);
 }


}
