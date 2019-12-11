package be.pxl.ja.city;

import be.pxl.ja.common.DistanceFunction;

public class City implements DistanceFunction {
	private String name;
	private double latitude;
	private double longitude;

	public City(String name, double latitude, double longitude) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return name;
	}

	public double DistanceFunction(City other){

		double radTheta = Math.toRadians(this.longitude - other.longitude);
		double radLatitude = Math.toRadians(this.latitude);
		double radOtherLatitude = Math.toRadians(other.longitude);
		double dist = Math.sin(radLatitude) * Math.sin(radOtherLatitude) + Math.cos(radLatitude) * Math.cos(radOtherLatitude) * Math.cos(radTheta);
		dist = Math.acos(dist);
		dist = Math.toDegrees(dist);
		dist = dist * 60 * 1.1515 * 1.609344;
		return dist;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public double distance(Object city) {
		return 0;
	}
}
