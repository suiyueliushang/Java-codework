import java.util.Comparator;

/**
 * 
 */

/**
 * @author 李鑫
 *
 */
public class DescendingAlphabeticComparator implements Comparator {

	/*
	 *
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	/* （非 Javadoc）
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO 自动生成的方法存根
		return -arg0.toString().compareTo(arg1.toString());
	}
	public boolean equals(Object o1,Object o2)
	{
		return !o1.toString().equals(o1.toString());
	}
}