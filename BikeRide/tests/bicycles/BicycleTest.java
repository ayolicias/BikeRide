package bicycles;

import bicycle.Bicycle;
import bicycle.BikeRide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void currentspeed() {
        Bicycle bicycle = new Bicycle();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        assertEquals(bicycle.currentSpeed(), 14);
    }

    @Test
    public void accelarate() {
        Bicycle bicycle = new Bicycle();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        assertEquals(bicycle.currentSpeed(), 19);
    }
}



//private void assertEquals(void brake) {


//private void assertEquals(void brake, int i) {
//}
//@Test
//public void currentSpeed(){
//assertEquals(2,2);
//}
//
//@Test
//public void stop(){
//assertEquals(2,2);
//
//}
//*/
//
//
//}
