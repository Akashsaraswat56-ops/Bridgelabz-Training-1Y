import java.util.Scanner;
class Spring{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month :-");
		int a=sc.nextInt();
		System.out.println("Enter Day :-");
		int b=sc.nextInt();
		if(a==3){
			if(b>=20&&b<=31){
				System.out.println("Its a Spring season.");
			}
		}
		else if(a>=4&&a<=5){
			System.out.println("Its a Spring season.");
		}
		else if(a==6){
			if(b>=20&&b<=1){
				System.out.println("Its a Spring season.");
			}
		}
		else{
			System.out.println("Its not a spring season.");
		}
			
		
		
	}
	}

		