package be.pxl.ja.city;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CityTest {
    private City tienenSlecht;
    // Latitude = -90 tot +90
    // Longitude = -180 tot +180
    private City maaseik;

    @Before
    public void init(){
        tienen = new City("Tienen", 50.81057, 4.93622);
        maaseik= new City("Maaseik", 51.0983909, 5.7837625);
    }

    @Test
    pubic void invalidLatitude(){
        assertThrows(IllegalArgumentException.class, ()-> tienenSlecht.DistanceFunction(tienenSlecht){

        })

    }
}
