package Netology.MSL.Lambda.Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
     void errorDone(String error);
}
