import java.util.Scanner;
class Pen{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of pens");
		int a=sc.nextInt();
		System.out.println("No of students");
		int b=sc.nextInt();
		int pens=a/b;
		int pr=a%b;
		System.out.print("The Pen Per Student is "+pens);
		System.out.println(" and the remaining pen not distibuted is "+pr);
	}
}
			