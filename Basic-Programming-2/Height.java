import java.util.Scanner;
class Height{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter height in cm");
double a=sc.nextDouble();
double b=a/2.54;
double c=a/30.48;
System.out.println("height in inches "+b);
System.out.println("height in foot "+c);


}}