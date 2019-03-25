package bicycles;

import bicycles.models.BicycleFromSpec;
import bicycles.models.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeSpecTest {

    @Test
    public void ShouldAccelerateSpec(){

        BicycleSpecification RoadBikeSpec = new BicycleSpecification(11, 4, BicycleType.MountainBike);
        Bicycle RoadBike = new BicycleFromSpec(RoadBikeSpec);
        BikeRideOne bikeRideOne = new BikeRideOne(RoadBike);
        bikeRideOne.ride();
        assertEquals(bikeRideOne.getcurrent(),44);
    }
}


