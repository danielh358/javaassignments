package Day4Assignments;

public class Assignment2 {
    public static Object threadLock = new Object();
    public static Object threadLock2 = new Object();

    public static void main(String args[]) {
        Threadlocker T1 = new Threadlocker();
        Threadlocker2 T2 = new Threadlocker2();
        T1.start();
        T2.start();
     }
     
     private static class Threadlocker extends Thread {
        public void run() {
           synchronized (threadLock) {
              System.out.println("Thread 1: Holding lock 1...");
              
              try { Thread.sleep(10); }
              catch (InterruptedException e) {}
              System.out.println("Thread 1: Waiting for lock 2...");
              
              synchronized (threadLock2) {
                 System.out.println("Thread 1: Holding lock 1 & 2...");
              }
           }
        }
     }
     private static class Threadlocker2 extends Thread {
        public void run() {
           synchronized (threadLock2) {
              System.out.println("Thread 2: Holding lock 2...");
              
              try { Thread.sleep(10); }
              catch (InterruptedException e) {}
              System.out.println("Thread 2: Waiting for lock 1...");
              
              synchronized (threadLock) {
                 System.out.println("Thread 2: Holding lock 1 & 2...");
              }
           }
        }
     } 
}