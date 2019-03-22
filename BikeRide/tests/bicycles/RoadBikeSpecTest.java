package bicycles;

import bicycles.models.BicycleFromSpec;
import org.junit.jupiter.api.Test;

public class RoadBikeSpecTest {

    @Test

    public void ShouldAccelerateSpec(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
    }
}
