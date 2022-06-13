package CO3;

import java.util.Scanner;

class person{
	String name,gender,address;
	int age;
	person(int age,String name,String gender,String address){
		this.age=age;
		this.name=name;
		this.gender=gender;
		this.address=address;
	}
}
class employee1 extends person{
	int id;
	String company_name,qualification;
	double salary;
	employee1(int age,String name,String gender,String address,int id,String company_name,String qualification,double salary){
		super(age,name,gender,address);
		this.id=id;
		this.company_name=company_name;
		this.qualification=qualification;
		this.salary=salary;
	}
}
class teacher1 extends employee1{
	int tid;
	String subject,dept; 
	teacher1(int age,String name,String gender,String address,int id,String company_name,String qualification,double salary,int tid,String subject,String dept) {
		super(age,name,gender,address,id,company_name,qualification,salary);
		this.subject=subject;
		this.dept=dept;
		this.tid=tid;
	}
	void display(){
		System.out.println("-------------------");
		System.out.println("Emp_Id : "+id+"\n"+"Teacher_Id : "+tid+"\n"+"Name : "+name+"\n"+"Address : "+address);
		System.out.println("company_name : "+company_name+"\n"+"qualification : "+qualification+"\n");
		System.out.println("salary : "+salary+"\n"+"dept : "+dept+"\n"+"subjects : "+subject);
	}	
}
public class pg_3 {
	public static void main(String [] args){
		System.out.println("Enter in number of teachers");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		teacher1[] arr=new teacher1[x];
		for(int i=0;i<x;i++){
			System.out.println("Enter details of teacher "+i+1);
			System.out.print("Enter in Empid :");
			int id=s.nextInt();
			s.nextLine();
			System.out.print("Enter in Teacher Id :");
			int tid=s.nextInt();
			s.nextLine();
			System.out.print("Enter in Name : ");
			String name=s.nextLine();
			System.out.print("Enter in Age : ");
			int age=s.nextInt();
			s.nextLine();
			System.out.print("Enter in gender : ");
			String gender=s.nextLine();
			System.out.print("Enter in Company : ");
			String company_name=s.nextLine();
			System.out.print("Enter in qualification : ");
			String qualification=s.nextLine();
			System.out.print("Enter in Address : ");
			String addr=s.nextLine();
			System.out.print("Enter in salary : ");
			double sal=s.nextDouble();
			s.nextLine();
			System.out.print("Enter in Dept : ");
			String dept=s.nextLine();
			System.out.print("Enter in Subjects taught : ");
			String sub=s.nextLine();
			teacher1 t=new teacher1(age,name,gender,addr,id,company_name,qualification,sal,id,sub,dept);
			arr[i]=t;
		}
		for(int i=0;i<x;i++){
			arr[i].display();
		}
	}
}
