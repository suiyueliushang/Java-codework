
/**
 * 
 */
package atm_01;

import java.util.Scanner;

/**
 * @author 李鑫
 *
 */
public class Atm_UI {
	public static void main(String[] args) {
		Account a=new Account("4","122345678",0.0);
		Atm_control control=new Atm_control();
		while(true)
		{
		control.sign_in(a);
		control.input(a);
		}
	}
}
