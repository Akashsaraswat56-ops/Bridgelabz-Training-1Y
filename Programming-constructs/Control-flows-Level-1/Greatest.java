import java.util.Scanner;
class Greatest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter Third number");
		int c=sc.nextInt();
		if(a>b&&a>c){
			System.out.println("first number is Greatest.");
		}
		else if(b>a&&b>c){
			System.out.println("second number is greatest.");
		}
		else {
			System.out.println("Third number is greatest.");
		}
	}
}
		