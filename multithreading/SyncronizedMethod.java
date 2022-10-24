/*Question 3*/
class Print {

    public void print() {
        for (int i = 0; i < 5; i++) {
            synchronized (this) {
                System.out.println(i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}

class PrintNumberThread extends Thread {

    Print print;

    PrintNumberThread(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        print.print();
    }
}

public class SyncronizedMethod {

    public static void main(String[] args) {

        Print print = new Print();

        PrintNumberThread t1 = new PrintNumberThread(print);
        PrintNumberThread t2 = new PrintNumberThread(print);

        t1.start();
        t2.start();
    }


}

