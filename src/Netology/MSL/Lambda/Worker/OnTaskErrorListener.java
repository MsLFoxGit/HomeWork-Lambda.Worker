package Netology.MSL.Lambda.Worker;

@FunctionalInterface
public interface OnTaskErrorListener<R, T, U> {
    R onError(T a, U b);
}
