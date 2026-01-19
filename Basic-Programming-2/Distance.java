import java.util.Scanner;
class Distance{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter Distance in foot");
double a=sc.nextDouble();
double b=0.333*a;
double c=a*0.000189;
System.out.println("In yards "+b);
System.out.println("In miles "+c);
}}