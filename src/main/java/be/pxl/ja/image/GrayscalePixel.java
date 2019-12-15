package be.pxl.ja.image;

import be.pxl.ja.common.DistanceFunction;

import java.awt.*;

public class GrayscalePixel implements PixelToInt, Comparable<GrayscalePixel>, DistanceFunction<GrayscalePixel> {

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
        return this.toString().compareTo(grayscalePixel.toString());
    }

    @Override
    public double distance(GrayscalePixel city) {
        return 0;
    }
}
