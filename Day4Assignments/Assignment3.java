package Day4Assignments;

import java.util.ArrayList;
import java.util.Random;

public class Assignment3 {
    
    public static void main(String[] args) throws InterruptedException{

        ProducerConsumer testpc = new ProducerConsumer();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    testpc.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
 
        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    testpc.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
 
        // Start both threads
        t1.start();
        t2.start();
 
        // t1 finishes before t2
        t1.join();
        t2.join();

    }


    public static class ProducerConsumer{

        ArrayList<Integer> pipeline = new ArrayList<Integer>(); //using default capacity of ten
        Random rint = new Random();

        public void produce() throws InterruptedException {
            while(true){
                synchronized(this){
                    while(pipeline.size() == 10){
                        wait(); //thread full, so wait
                    }
                    int valueToAdd = rint.nextInt(100);
                    System.out.printf("Producer created %d and now adding to pipeline.", valueToAdd);
                    pipeline.add(valueToAdd);
                    notify(); //alert consumer

                    Thread.sleep(1000);
                }
            }
        }

        public void consume() throws InterruptedException{
            while(true){
                synchronized(this){
                    while(pipeline.size() == 0){
                        wait(); //thread empty, so wait
                    }
                    int valueTakenOut = pipeline.remove(0);
                    System.out.printf("Consumer removed %d from the pipeline.", valueTakenOut);

                    notify();

                    Thread.sleep(1000);

                }
            }
        }

    } 


}