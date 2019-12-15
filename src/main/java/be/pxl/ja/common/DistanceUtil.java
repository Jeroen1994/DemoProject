package be.pxl.ja.common;

import be.pxl.ja.city.City;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Jeronimos on 28/11/2019.
 * https://www.codeproject.com/Questions/368097/Sort-by-distance-in-Java => find closest
 */
public class DistanceUtil<T extends DistanceFunction> {

    public static <T extends DistanceFunction> T findClosest(TreeSet<T> elements, T otherElement) {

        double smallest = 200000000;
        T smallestCity = null;
        for (T element : elements) {
            double distance = otherElement.distance(element);
            if (smallest > distance && 0 < distance) {
                smallest = distance;
                smallestCity = element;
            }
        }

        return smallestCity;


        /*Iterator<City> iterator= (Iterator<City>) elements.iterator();
        double dist=0;
        double lowestDist=0;

        while(iterator.hasNext())
            dist= elements.DistanceFunction(otherElement);
        if (dist<lowestDist){
            lowestDist=dist;
        }

        return lowestDist;*/
        //klopt nog ni ze
        /*De methode findClosest zoekt het object uit de lijst elements waarvoor de distance
        tot otherElement het kleinste is. Het gevonden object is de returnwaarde van de
        functie.
        */
    }
}

