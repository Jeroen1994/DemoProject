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

		Set<String> steden = new TreeSet<String>(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.toString().compareTo(o2);
			}
		});

		steden.add(leuven.toString());
		steden.add(roermond.toString());
		steden.add(maastricht.toString());
		steden.add(aken.toString());
		steden.add(tienen.toString());
		steden.add(maaseik.toString());

		for (String stad : steden) {
			System.out.println(stad);
		}

		//double distance = DistanceUtil.findClosest(steden,maaseik);






	}

}
