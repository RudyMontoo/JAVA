package Threading;

class Buffer {
    private int item;
    private boolean isFull = false; // Indicates if buffer has an item

    // Producer puts item into buffer
    synchronized void produce(int value) {
        while (isFull) { // Wait if buffer is full
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        item = value;
        System.out.println("Producer produced: " + item);
        isFull = true;
        notify(); // Notify consumer that item is available
    }

    // Consumer takes item from buffer
    synchronized int consume() {
        while (!isFull) { // Wait if buffer is empty
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumer consumed: " + item);
        isFull = false;
        notify(); // Notify producer that buffer is free
        return item;
    }
}

class Producer extends Thread {
    private Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int value = 0;
        while (true) {
            buffer.produce(value++);
            try {
                Thread.sleep(1000); // Simulate production time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            buffer.consume();
            try {
                Thread.sleep(1500); // Simulate consumption time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Producer_Consumer_problem {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}