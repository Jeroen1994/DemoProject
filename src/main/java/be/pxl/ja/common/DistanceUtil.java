package be.pxl.ja.common;

import be.pxl.ja.city.City;

import java.util.TreeSet;

/**
 * Created by Jeronimos on 28/11/2019.
 */
public class DistanceUtil {

    public static Double findClosest(TreeSet<T> elements, T otherElement){
        Iterator<City> iterator= elements.iterator();
        double dist=0;
        double lowestDist=0;

        while(iterator.hasNext())
            dist= elements.DistanceFunction(otherElement);
        if (dist<lowestDist){
            lowesDist=dist;
        }

        return lowestDist;
        //klopt nog ni ze
        /*De methode findClosest zoekt het object uit de lijst elements waarvoor de distance
        tot otherElement het kleinste is. Het gevonden object is de returnwaarde van de
        functie.
        */
    }
}
