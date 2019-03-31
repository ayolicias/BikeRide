package bicycles.models;

import bicycles.ride.BikeRideOne;
import bicycles.ride.BikeRideThree;
import bicycles.ride.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {

    @Test
    public void ShouldAccelerateLess( ) {
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
        bikeRideOne .ride();
        assertEquals(bikeRideOne.currentSpeed(), 14);
    }

    @Test
    public void ShouldAbleToAccelerateMore( ) {
        MountainBike mountainBike = new MountainBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(mountainBike);
        bikeRideTwo.ride();
        assertEquals(bikeRideTwo.currentSpeed(), 27);
    }

    @Test
    public void ShouldBrakeMore( ) {
        MountainBike mountainBike = new MountainBike();
        BikeRideThree bikeRideThree = new BikeRideThree(mountainBike);
        bikeRideThree.ride();
        assertEquals(bikeRideThree.currentSpeed(), 26);
    }
}
