package bicycles;

import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class MountainBikeTest {

    @Test
    public void ShouldBeAbleToAccelerate(){
        MountainBike mountainBike = new MountainBike();
        BikeRide bikeRide = new BikeRide(mountainBike);
        bikeRide.ride();
        assertEquals(bikeRide.getcurrent(), 14);
    }

}
