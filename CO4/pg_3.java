package CO4;

import java.util.Scanner;

class auth extends Exception{
	String s;
	auth(String s){
		this.s=s;
	}
	public String toString(){
		return("Exception Msg : "+s);
	}
}
public class pg_3 {
	public static void main(String [] args){
		Scanner s =new Scanner(System.in);
		System.out.println("Enter username");
		String u=s.nextLine();
		System.out.println("Enter Password");
		String p=s.nextLine();
		try{
			if(u.equals("a") && p.equals("a"))
			{
				System.out.print("Auth successful");
			}
			else{
				throw new auth("Auth Not successful");
			}
		}
		catch(auth e){
			System.out.print(e);
		}
	}
}
