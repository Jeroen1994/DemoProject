package be.pxl.ja.city;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DistancesBetweenCities {

	public static void main(String[] args) {
		City leuven = new City("Leuven", 50.88151970000001, 4.6967578);
		City roermond = new City("Roermond", 51.19417, 5.9875);
		City maastricht = new City("Maastricht", 50.84833, 5.68889);
		City aken = new City("Aken", 50.77664, 6.08342);
		City tienen = new City("Tienen", 50.81057, 4.93622);
		City maaseik = new City("Maaseik", 51.0983909, 5.7837625);

		TreeSet<String> steden = new TreeSet<String>();
		steden.add(leuven.toString());
		steden.add(roermond.toString());
		steden.add(maastricht.toString());
		steden.add(aken.toString());
		steden.add(tienen.toString());
		steden.add(maaseik.toString());

		for (String stad : steden) {
			System.out.println(stad);
		}



	}

}
