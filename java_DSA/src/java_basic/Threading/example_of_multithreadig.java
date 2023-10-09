package Threading;
import java.util.Scanner;
class Account
{
    private int bal;
    public Account(int bal){this.bal = bal;}
    public boolean isSufficientBalance(int w)
    {
        if (bal>w)return (true);
        else return (false);
    }
    public void Withdraw(int amt){
        bal=bal-amt;
        System.out.println("withdraw money is "+amt+"current balance is "+bal);
    }
}
class customer implements Runnable{
    private String name;
    private Account account;
    public customer(Account account,String name){this.account = account;this.name = name;}

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        synchronized (account) {
            System.out.println(name + " ,enter amount to withdraw");
            int amt = sc.nextInt();
            if (account.isSufficientBalance(amt)) {
                account.Withdraw(amt);
            } else System.out.println("In Sufficient Balance");
        }
    }
}
public class example_of_multithreadig {
    public static void main(String[] args) {

        Account a1 = new Account(1000);
        customer c1 = new customer(a1,"simirun");
        customer c2 = new customer(a1,"suman");
        Thread t1 = new Thread(c1);
        Thread t2 =new Thread(c2);
        t1.start();
        t2.start();
    }

}
