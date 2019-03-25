package bicycles;

import bicycles.models.BicycleFromSpec;
import bicycles.models.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainSpecTest {
    @Test

    public void ShouldAccelerateSpec(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.RoadBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
        bikeRideOne.ride();
        assertEquals(bikeRideOne.getcurrent(), 20);
    }

}
