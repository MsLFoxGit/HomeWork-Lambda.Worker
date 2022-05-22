package Netology.MSL.Lambda.Worker;

public class Worker {
    int errorStep;
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if ( i == 33 )  {
                errorCallback.errorDone("\033[4;31mTask " + i + " is Error\033[0m");
                continue;
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}
