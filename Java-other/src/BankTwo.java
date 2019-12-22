import java.io.*;
public class BankTwo {

	public static void main(String[] args) {
		{
			Accounts acctype = new Accounts();
			acctype.print();
		}
	}
}

interface Account {
	default void print() {
		System.out.println("Accounts module!");
	}

	static void typeofaccount() {
		System.out.println("Savings and Current account");
	}

}

interface ReportAccounts {
	default void print() {
		System.out.println("Report is generated from accounts module");
	}
}

class Accounts implements Account, ReportAccounts {
	public void print() {
		Account.super.print();
		ReportAccounts.super.print();
		Account.typeofaccount();
		System.out.println("Complex financial application interface");
	}

}
