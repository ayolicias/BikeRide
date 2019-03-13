package bicycles;

import bicycle.Bicycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void shouldAccellerate() {
    Bicycle bicycle = new Bicycle();
    BikeRide bikeRide = new BikeRide(bicycle);
    bikeRide.ride();
    assertEquals(bicycle.currentSpeed(), 19);
    }

    @Test
    public void shouldBrake(){
        Bicycle bicycle = new Bicyle();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        assertEquals(bicycle.brake(), 0);
    }
//
//    private void assertEquals(void brake, int i) {
//    }


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
}
