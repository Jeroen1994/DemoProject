package be.pxl.ja.image;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import be.pxl.ja.common.DistanceFunction;

public class ImageArt {

    public static void main(String[] args) throws IOException {

        RGBPixel prussianBlue = new RGBPixel(0, 48, 80);
        RGBPixel desaturatedCyan = new RGBPixel(112, 150, 160);
        RGBPixel peachYellow = new RGBPixel(250, 227, 173);
        RGBPixel lava = new RGBPixel(218, 20, 21);
        List<RGBPixel> faireyColors = Arrays.asList(prussianBlue, lava, desaturatedCyan, peachYellow);

        //path naar resources voor foto

        Path resourceDirectory = Paths.get("src", "main", "resources", "tokio.jpg");
        Path writeDirectory = Paths.get("src", "main", "resources", "grayscale.jpg");

        //ImageReader.readImage(resourceDirectory);

        List<List<RGBPixel>> photo = ImageReader.readImage(resourceDirectory);

        //foto omzetten naar zwart en wit

        List<List<GrayscalePixel>> grayPhoto =
               photo.stream().map(s ->
                        s.stream().map(RGBPixel::convertToGrayscale).collect(Collectors.toList())
                ).collect(Collectors.toList());

        ImageWriter.writeImage(writeDirectory, grayPhoto);

        //foto omzetten naar fairey-cize
        //grayscaleobjecten sorteren
        TreeSet<GrayscalePixel> grayscalePixels = new TreeSet<>();
        Set<Integer> sorted = new TreeSet<Integer>((Comparator<? super Integer>) grayscalePixels);

        Map<GrayscalePixel, RGBPixel> translationMap = createTranslationMap(faireyColors, grayscalePixels);

        Set<GrayscalePixel> keyset = translationMap.keySet();

        /*List<List<GrayscalePixel>> faireyPhoto =
                grayPhoto.stream().map(s ->
                        s.stream().map(Map.Entry::getKey).collect(Collectors.toList()));*/

        //ImageWriter.writeImage(resourceDirectory, faireyPhoto);


        List<List<RGBPixel>> grayphoto = ImageReader.readImage(writeDirectory);


        /*List<List<GrayscalePixel>> faireyPhoto =
                grayphoto.stream().map(s ->
                        s.stream().map(RGBPixel::createTra).collect(Collectors.toList())).collect(Collectors.toList());*/

        /*Set<GrayscalePixel> numbersSet = grayPhoto.stream()
                .flatMap(List::stream)
                .collect(Collectors.toSet());*/


        /*List<List<GrayscalePixel>> faireyPhoto =
                grayPhoto.stream().map(s ->
                        s.stream().map(RGBPixel::convertToGrayscale).collect(Collectors.toList())
                ).collect(Collectors.toList());*/


        /*List<List<GrayscalePixel>> grayScaleValue =
                grayPhoto.stream().sorted(Comparator.comparing(GrayscalePixel::getGreyscale)).collect(Collectors.toList());*/



    }

    private static Map<GrayscalePixel, RGBPixel> createTranslationMap(List<RGBPixel> faireyColors, TreeSet<GrayscalePixel> allGreyscalePixels) {
        int size = allGreyscalePixels.size() / faireyColors.size();

        Map<GrayscalePixel, RGBPixel> translationMap = new HashMap<>();
        Iterator<GrayscalePixel> iterator = allGreyscalePixels.iterator();
        int startIndex = size / 2;
        List<Integer> preferedIndeces = new ArrayList<>();
        for (int group = 0; group < faireyColors.size(); group++) {
            preferedIndeces.add(startIndex);
            startIndex += size;
        }
        int index = 0;
        while (iterator.hasNext()) {
            GrayscalePixel grayscalePixel = iterator.next();
            if (preferedIndeces.contains(index)) {
                int position = preferedIndeces.indexOf(index);
                translationMap.put(grayscalePixel, faireyColors.get(position));
            }
            index++;
        }
        return translationMap;
    }


}
