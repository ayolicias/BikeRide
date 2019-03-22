package bicycles;

import bicycles.models.BicycleFromSpec;
import org.junit.jupiter.api.Test;

public class MountainSpecTest {
    @Test

    public void ShouldAccelerateSpec(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride();
    }
}
