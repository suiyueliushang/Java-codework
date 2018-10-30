import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * 
 */
public class DirFilter implements FilenameFilter {
	/**
	 * @param string
	 */
	private Pattern pattern;

	public DirFilter(String string) {
		// TODO 自动生成的构造函数存根
		pattern = Pattern.compile(string);
	}

	// implement the FilenameFilter
	// accept(Tests if a specified file should be included in a file list.
	public boolean accept(File file, String s) {
		// TODO 自动生成的方法存根
	return pattern.matcher(new File(s).getName()).matches();
	}

	// public File[] fileFilter(File file) {
	// if (!accept(file, s))
	// return null;
	// else {
	// File[] f = file.listFiles();
	// File[] fi = new File[f.length];
	// for (int i = 0; i < f.length; i++) {
	// if (f[i].isFile() && f[i].equals(s))
	// fi[i] = f[i];
	//
	// }
	// return fi;
	// }
	//
	// }
}
