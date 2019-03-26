package bicycles;

import bicycles.models.BikeRideThree;
import bicycles.models.BikeRideTwo;
import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoadBikeTest {

    @Test
    public void ShouldBeAbleToAccelerateLess( ) {
            RoadBike roadBike = new RoadBike();
            BikeRideOne bikeRideOne = new BikeRideOne(roadBike);
            bikeRideOne.ride();
            assertEquals(bikeRideOne.getcurrent(), 36);
        }

    @Test
    public void ShouldBeAbleToAccelerateMore( ) {
        RoadBike roadBike = new RoadBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo(roadBike);
        bikeRideTwo.ride();
        assertEquals(bikeRideTwo.getcurrent(), 62);
    }

    @Test
    public void ShouldBrake( ) {
        RoadBike roadBike = new RoadBike();
        BikeRideThree bikeRideThree = new BikeRideThree(roadBike);
        bikeRideThree.ride();
        assertEquals(bikeRideThree.getcurrent(), 65);
    }

    @Test
    public void ShouldBrakeMore( ) {
        RoadBike roadBike = new RoadBike();
        BikeRideThree bikeRideThree = new BikeRideThree(roadBike);
        bikeRideThree.ride();
        assertEquals(bikeRideThree.getcurrent(), 65);
    }



}



