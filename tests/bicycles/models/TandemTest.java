package bicycles.models;

import bicycles.ride.BikeRideThree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public  class TandemTest {
    @Test
    public void ShouldReturnTandemBikeCurrentSpeed( ) {
        MountainBike mountainBike = new MountainBike();
        BikeRideThree bikeRide = new BikeRideThree(mountainBike);
        bikeRide .ride();
        assertEquals(bikeRide.currentSpeed(), 40);
    }

}






