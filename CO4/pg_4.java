package CO4;

import java.util.Scanner;

class avgEx extends Exception{
	avgEx(String s){
		super(s);
	}
}
public class pg_4 {
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		int i=0;
		System.out.println("Enter the number of digits");
		int n=s.nextInt();
		int sum=0;
		while(i<n){
			System.out.println("Enter the number");
			int x=s.nextInt();
			try{
				if(x<0){
					throw new avgEx("less than 1");
				}
				else{
					sum+=x;
					i++;
				}
			}
			catch(avgEx e){
				System.out.println("Exception : "+e);
			}
		}
		System.out.println("Average : "+sum/n);
	}
}
