import java.util.Scanner;

public class Accounts1 {
   private String acname;
   private int dep;
   private int wd;
   private int opn;
 public Accounts1(String acname,int dep, int wd, int opn){
	        this.acname=acname;
			this.dep = dep;
			this.wd=wd;
			this.opn=opn;
	}
	public void print()
		{
			System.out.println("dep is  "+dep);
			System.out.println("wd is "+wd);
			System.out.println("opn balance is "+opn);
			int clb = opn + dep - wd;
			System.out.println("the closing balance ="+clb);
		}
}


