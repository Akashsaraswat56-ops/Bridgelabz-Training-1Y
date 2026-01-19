import java.util.Scanner;
class Earth{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius in km");
int a=sc.nextInt();
double b=a/1.6;
double km=(4/3)*3.14*a*a*a;
double m=(4/3)*3.14*b*b*b;
System.out.println("vol in cubic km"+km);
System.out.println("vol in cubic miles"+m);
}}