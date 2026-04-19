class Account {
    private int accountNumber;
    private double balance;

    public void deposit(double amount){

    }
    public void withdraw(double amount){

    }
    public double getBalance(){
        double a=3.66;
        return a;
    }
    
}

class SavingsAccount extends Account{
    private double  interest_rate;

    public void addlnterest(){
        System.out.println("Interest added");

    }
}

class CurrentAccount extends Account{
    private double overdraft_limit;

    public void checkOverdraft(){

    }

}

public class main4{

    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount();

        s1.addlnterest();

    }
}





