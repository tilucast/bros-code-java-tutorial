public class Multithreads {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(Thread.activeCount());
//        System.out.println(Thread.currentThread().getName());
//
//        Thread.currentThread().setPriority(10);
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().isAlive());

//        for (int i = 3; i > 0; i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//
//        System.out.println("We are done");

//        MyThread thread2 = new MyThread();
//        thread2.setDaemon(true);
//        thread2.start();

//        System.out.println(thread2.isAlive());
//        System.out.println(thread2.getName());
//        System.out.println(thread2.getPriority());
//
//        System.out.println(Thread.activeCount());

        // ----------

        MyThread thread1 = new MyThread();
        MyRunnable runn = new MyRunnable();
        Thread thread2 = new Thread(runn);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        //thread1.join(1000);
        thread2.start();

        System.out.println(1/0);
    }
}

class MyThread extends Thread{
    @Override
    public void run(){

//        if(!this.isDaemon()){
//            System.out.println("This is a user thread that is running boi.");
//            return;
//        }
//
//        System.out.println("This is a daemon thread that is running boi.");

        for (int i = 10; i > 0 ; i--) {
            System.out.println("Thread 1 - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread 1 is finished.");
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        int x = 0;
        for (int i = 1; i <= 10  ; i++) {
            System.out.println("Thread 2 - " + i);
            try {
                x += 1000;
                Thread.sleep(1000);

                if(x == 11000){
                    throw new Exception("Something went wrong.");
                }

            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

        }

        System.out.println("Thread 2 is finished.");
    }
}