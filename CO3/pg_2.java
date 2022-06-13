package CO3;

import java.util.Scanner;

class employee{
	int id;
	String name,address;
	double salary;
	employee(int id,String name,String address,double salary){
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
}
class teacher extends employee{
	String dept,subject;
	teacher(String dept, String subject,int id,String name,String address,double salary) {
		super(id,name,address,salary);
		this.dept=dept;
		this.subject=subject;	
	}
	void display(){
		System.out.println("-------------------");
		System.out.println("Emp_Id : "+id+"\n"+"Name : "+name+"\n"+"Address : "+address);
		System.out.println("salary : "+salary+"\n"+"dept : "+dept+"\n"+"subjects : "+subject);
	}
	
}
public class pg_2 {
	public static void main(String [] args){
		System.out.println("Enter in number of teachers");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		teacher[] arr=new teacher[x];
		for(int i=0;i<x;i++){
			System.out.println("Enter details of teacher "+i+1);
			System.out.print("Enter in id :");
			int id=s.nextInt();
			s.nextLine();
			System.out.print("Enter in Name : ");
			String name=s.nextLine();
			System.out.print("Enter in Address : ");
			String addr=s.nextLine();
			System.out.print("Enter in salary : ");
			double sal=s.nextDouble();
			s.nextLine();
			System.out.print("Enter in Dept : ");
			String dept=s.nextLine();
			System.out.print("Enter in Subjects taught : ");
			String sub=s.nextLine();
			teacher t=new teacher(dept,sub,id,name,addr,sal);
			arr[i]=t;
		}
		for(int i=0;i<x;i++){
			arr[i].display();
		}
	}
}
