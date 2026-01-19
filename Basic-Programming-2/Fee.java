import java.util.Scanner;
class Fee{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Fee of course");
		int a=sc.nextInt();
		System.out.println("Percent Discount");
		int b=sc.nextInt();
		int discount=a*b/100;
		int df=a-discount;
		System.out.print("The discount amount is "+discount );
		System.out.print(" and the discounted fee is "+df);
	}
}
		