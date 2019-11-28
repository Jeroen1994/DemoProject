package be.pxl.ja.common;

@FunctionalInterface
public interface DistanceFunction<T> {

    public abstract Double distance(T city);

}
