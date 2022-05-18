package Netology.MSL.Lambda.Worker;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener<Boolean, Integer, Integer> errorListener = Integer::equals;

        Worker worker = new Worker(listener, errorListener, 33);
        worker.start();
    }
}
