package Netology.MSL.Lambda.Worker;
@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}