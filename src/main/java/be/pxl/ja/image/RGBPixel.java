package be.pxl.ja.image;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class RGBPixel implements PixelToInt {
    private int red;
    private int green;
    private int blue;

    public RGBPixel(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public GrayscalePixel convertToGrayscale() {
        List<Integer> colors = new ArrayList<>();
        colors.add(this.red);
        colors.add(this.green);
        colors.add(this.blue);

        List<Integer> averageColors = colors.stream()
                 .collect(Collectors.toList());
        OptionalDouble averageValue = averageColors.stream().mapToInt(Integer::intValue).average();
        double value = averageValue.orElse(-1);
        return new GrayscalePixel((int)value);
    }

    @Override
    public int toRGB() {
        int rgb = red;
        rgb = (rgb << 8) + green;
        rgb = (rgb << 8) + blue;
        return rgb;
    }

    @Override
    public String toString() {
        return "(" + red + ", " + green + ", " + blue + ")";
    }

}
