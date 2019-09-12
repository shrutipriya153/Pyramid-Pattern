import java.util.*;
public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the range");
		n=sc.nextInt();
		int nst,nsp,cst,csp;
		nst=1;
		nsp=n;
		int row=1;
		while(row<=n) {
			csp=1;
			for(;csp<=nsp;csp++) {
				System.out.print("\t");
			}
			cst=1;
			for(;cst<=nst;cst++) {
				System.out.print(row+"\t");
			}
			nsp--;
			nst+=2;
			row++;
			System.out.println();
		}
	}

}
