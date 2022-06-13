package CO3;

import java.util.Scanner;

interface calc{
	double area();
	double perimeter();
}
class circle implements calc{
	int r;
	circle(int r){
		this.r=r;
	}
	public double area() {
		return(3.14*r*r);
	}
	public double perimeter() {
		return(3.14*2*r);
	}
}
class rectangle implements calc{
	int l,b;
	rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	public double area() {
		return(l*b);
	}
	public double perimeter() {
		return(2*(l+b));
	}
}
public class pg_6 {
	public static void main(String [] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("1.Circle\n2.rectangle\nEnter choice");
switch(s.nextInt()){
	case 1:
		circle c=new circle(5);
		System.out.println("....Circle....\nArea : "+c.area()+"\nPerimeter : "+c.perimeter());
	break;
	case 2 :
		rectangle r=new rectangle(5,5);
		System.out.println("\n....Rectangle....\nArea : "+r.area()+"\nPerimeter : "+r.perimeter());
	break;
}
		
		
	}
}
