/**
 * 
 */
package atm_01;

import java.util.Scanner;

/**
 * @author 李鑫
 *
 */
public class Account {
	public Account(String user_name,String password,double balance)
	{
		setUser_name(user_name);
		setPassword(password);
		this.balance=balance;
	}
	private String user_name;
	/**
	 * @return user_name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * @param user_name 要设置的 user_name
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password 要设置的 password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}
	private String password;
	private double balance;
		
	public void saving(double account)
	{
	this.balance+=account;
	}
	
	public void withdrawal(double account)
	{
//		if(account>balance)
//			System.out.println("余额不足");
//		else
		this.balance-=account;
	}
//	public void exit()
//	{
//		
//	}
}
