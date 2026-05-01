package MultiThreading.Q1;
import java.util.*;

class BankAccount implements Runnable {
    String name;
    String type;
    int p;

    public BankAccount(String n, String t, int prio) {
        this.name = n;
        this.type = t;
        this.p = prio;
    }

    public void run() {
        for(int i = 0; i < 3; i++) {
            int check_no = i + 1;

            System.out.println("Curent User: " + name);
            System.out.println("Account: " + type);
            System.out.println("Prioity: " + Thread.currentThread().getPriority());
            System.out.println("Status:balance checking (Attempt " + check_no + ")");

            try {
                Thread.sleep(1200);
            } catch (Exception e) {
                System.out.println("thread some error!!");
            }

        }
    }
}