/**
 * 
 */
package atm_01;

import java.util.Scanner;

/**
 * @author 李鑫
 *
 */
public class Atm_control {
	Scanner sc = new Scanner(System.in);

	// public void input(Account a)
	// {
	// System.out.println("请输入用户名：");
	// String name=sc.nextLine();
	// if(!a.getUser_name().equals(name))
	// System.out.println("错误的用户名，请重新输入");
	// System.out.println("请输入密码： ");
	// String password=sc.nextLine();
	// if(!password.equals(a.getPassword()))
	// System.out.println("");
	// }
	public void menu() {
		System.out.println("欢迎进入ATM 0.1，您可以进行一下操作: ");
		System.out.println("1、查询余额；");
		System.out.println("2、存款");
		System.out.println("3、取款");
		System.out.println("4、退出");
	}

	public void sign_in(Account a) {
		System.out.println("请输入用户名：");
		String user_name = sc.nextLine();
		while (!user_name.equals(a.getUser_name())) {
			System.out.println("用户名不存在，请重新输入：");
			user_name = sc.nextLine();
		}

		System.out.println("请输入密码：");
		String password = sc.nextLine();
		while (!password.equals(a.getPassword())) {
			System.out.println("密码错误，请重新输入：");
			password = sc.nextLine();
		}
	}

	public void input(Account a) {
		while (true) {
			menu();
			int choice = sc.nextInt();
			String s = sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("当前余额为：" + a.getBalance());
				break;
			case 2:
				System.out.println("请输入存款金额：");
				double b = sc.nextDouble();
				a.saving(b);
				System.out.println("存款成功");
				break;
			case 3:
				System.out.println("请输入取款金额： ");
				double c = sc.nextDouble();
				if (c <= a.getBalance())
					a.withdrawal(c);
				else
					System.out.println("余额不足");
				break;
			case 4:
				return;
			default:
				System.out.println("错误的输入，请重新输入：");
				break;
			}
		}
	}

}
