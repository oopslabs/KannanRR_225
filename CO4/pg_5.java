package CO4;
class multiply extends Thread{
	public void run(){
		for (int i=0;i<12;i++){
			System.out.println(i+"*5="+i*5);
		}
	}
}
class multiply2 extends Thread{
	public void run()
	{
		int s,f=0;
		for (int i=2;i<20;i++)
		{
			for(int j=2;j<=i/2;j++){
				if(i!=j && i%j==0){
					f=1;
				}
				}
			if(f==0){
				System.out.println(i);
			}
			f=0;
			}
		}
	}
public class pg_5 {
	public static void main(String [] args){
		multiply m=new multiply();
		multiply2 m2=new multiply2();
		m.start();
		m2.start();
	}
}
