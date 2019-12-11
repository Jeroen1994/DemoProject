package be.pxl.ja.common;

@FunctionalInterface
public interface DistanceFunction<T> {

    public abstract double distance(T city);

}
