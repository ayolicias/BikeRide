package bicycles.models;

import bicycles.ride.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {

    @Test
    public void ShouldReturnMountainBikeCurrentSpeed( ) {
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRide = new BikeRideOne(mountainBike);
        bikeRide .ride();
        assertEquals(bikeRide.currentSpeed(), 14);
    }

}
