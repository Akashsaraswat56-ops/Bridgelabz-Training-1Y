package MultiThreading.Q1;
public class Runner {
    public static void main(String args[]) {


        BankAccount b1 = new BankAccount("Amrit", "Premium", 10);
        BankAccount b2 = new BankAccount("Aryan", "Regular", 5);
        BankAccount b3 = new BankAccount("Suresh", "Basic", 1);

        Thread th1 = new Thread(b1);
        Thread th2 = new Thread(b2);
        Thread th3 = new Thread(b3);

        th1.setPriority(10);
        th2.setPriority(5);
        th3.setPriority(1);

        th1.start();
        th2.start();
        th3.start();

        System.out.println("All thread are runing now.");
    }
}