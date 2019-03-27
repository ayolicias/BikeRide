package bicycles;

import bicycles.ride.BikeRideFour;
import bicycles.ride.BikeRideOne;
import bicycles.ride.BikeRideThree;
import bicycles.ride.BikeRideTwo;
import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {

    @Test
    public void ShouldAccelerateLess( ) {
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
        bikeRideOne .ride();
        assertEquals(bikeRideOne.getcurrent(), 14);
    }


    @Test
    public void ShouldAbleToAccelerateMore( ) {
        MountainBike mountainBike = new MountainBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(mountainBike);
        bikeRideTwo.ride();
        assertEquals(bikeRideTwo.getcurrent(), 27);
    }

    @Test
    public void ShouldBrakeMore( ) {
        MountainBike mountainBike = new MountainBike();
        BikeRideThree bikeRideThree = new BikeRideThree(mountainBike);
        bikeRideThree.ride();
        assertEquals(bikeRideThree.getcurrent(), 26);
    }

    @Test
    public void ShouldBrakeLess( ) {
        MountainBike mountainBike = new MountainBike();
        BikeRideFour bikeRideFour = new BikeRideFour(mountainBike);
        bikeRideFour.ride();
        assertEquals(bikeRideFour.getcurrent(), 13);
    }
}
