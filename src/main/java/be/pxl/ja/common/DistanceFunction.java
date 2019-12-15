package be.pxl.ja.common;

@FunctionalInterface
public interface DistanceFunction<T> {

    double distance(T city);

}
