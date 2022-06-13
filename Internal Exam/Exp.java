import java.util.*;
class UserDefinedException extends Exception{
    UserDefinedException(String s){
        super(s);
    }
}
class Account{
    int bal;
    void deposit(int x){
        System.out.println("Depositing amount : "+x);
        bal=bal+x;
    }
    void withdraw(int x){
        try{
            if(bal-x<0 || bal==0){
                throw new UserDefinedException("NotSufficientFundException");
            }
            else{
                bal=bal-x;
                System.out.println("Withdrawing amount : "+x+"\nBalance : "+bal);
            }
        }
        catch(UserDefinedException e){
            System.out.println(e);
        }
        
    }
}
class Exp{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        Account a=new Account();
        int c=0;
        while(c!=-1){
            System.out.println("-----------------------------\nEnter your choice\n1.Deposit\n2.Withdraw");
            c=s.nextInt();
            switch(c){
                case 1 :
                System.out.println("Enter Deposit amount");
                a.deposit(s.nextInt());
                break;
                case 2 :
                System.out.println("Enter Withdraw amount");
                a.withdraw(s.nextInt());
                break;
                default:
                System.out.println("Invalid");
            }
        }
    }
}