package be.pxl.ja.city;

import be.pxl.ja.common.DistanceFunction;
import be.pxl.ja.common.DistanceUtil;

import java.util.*;

public class DistancesBetweenCities {

	public static void main(String[] args) {

		City leuven = new City("Leuven", 50.88151970000001, 4.6967578);
		City roermond = new City("Roermond", 51.19417, 5.9875);
		City maastricht = new City("Maastricht", 50.84833, 5.68889);
		City aken = new City("Aken", 50.77664, 6.08342);
		City tienen = new City("Tienen", 50.81057, 4.93622);
		City maaseik = new City("Maaseik", 51.0983909, 5.7837625);

		TreeSet<City> steden = new TreeSet<>(new Comparator<City>() {
			public int compare(City o1, City o2) {
				return o1.toString().compareTo(o2.toString());
			}
		});

		steden.add(leuven);
		steden.add(roermond);
		steden.add(maastricht);
		steden.add(aken);
		steden.add(tienen);
		steden.add(maaseik);

		for (City stad : steden) {
			System.out.println(stad);
		}


		City shortestCity = DistanceUtil.findClosest(steden, maaseik);
		System.out.println();
		System.out.println(shortestCity);









	}

}
