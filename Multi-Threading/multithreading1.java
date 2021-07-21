class multithreading1 extends Thread {
    public void run() {
        System.out.println("Thread is running..");
    }
    public static void main(String[] args) {
        multithreading1 mt1 = new multithreading1();
        mt1.start();

    }
}