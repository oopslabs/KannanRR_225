package CO3;

import java.util.Scanner;

class FindArea{
	void area(int a){
		System.out.println("Area of Square is "+a*a); 
	 }
	void area(int a,int b){
		System.out.println("Area of Square is "+a*b); 
	 }
}
public class pg_1 {
 public static void main(String [] args){
	 System.out.println("Area of Square\n\nEnter the length of one side : ");
	 Scanner s=new Scanner(System.in);
	 int a=s.nextInt();
	 FindArea f=new FindArea();
	 f.area(a);
	 System.out.println("\n\n------------\n\nArea of Rectangle\nEnter the length : ");
	 a=s.nextInt();
	 System.out.println("Enter the breadth : ");
	 int b=s.nextInt();
	 f.area(a, b);
 }
}
