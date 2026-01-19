import java.util.Scanner;
class Profit{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cost price");
		int a=sc.nextInt();
		System.out.println("Enter selling price");
		int b=sc.nextInt();
		double profit=b-a;
		System.out.println("profit="+profit);
		double pp=(profit*a)/100;
		System.out.println(pp);
		
	
	}
}
		