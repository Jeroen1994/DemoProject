package be.pxl.ja.image;

import be.pxl.ja.common.DistanceFunction;

import java.awt.*;

public class GrayscalePixel implements Comparable<GrayscalePixel>,PixelToInt, DistanceFunction<GrayscalePixel> {

    private int greyscale;

    public GrayscalePixel(int greyscale) {
        this.greyscale = greyscale;
    }

    public int getGreyscale() {
        return this.greyscale;
    }

    @Override
    public int toRGB() {
        return new Color(greyscale, greyscale, greyscale).getRGB();
    }

    @Override
    public String toString() {
        return Integer.toString(greyscale);
    }


   @Override
    public int compareTo(GrayscalePixel grayscalePixel) {

        return Integer.compare(this.greyscale, grayscalePixel.greyscale);
    }

    @Override
    public double distance(GrayscalePixel city) {
        int distance = greyscale - city.greyscale;
        double absoluteWaarde = Math.abs(distance);
        return absoluteWaarde;
    }
}
