package bicycles;

import bicycles.ride.BikeRideOne;
import bicycles.specification.BicycleFromSpec;
import bicycles.ride.BikeRideThree;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainSpecTest {
    @Test

    public void ShouldAccelerateSpec(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
        bikeRideOne.ride();
        assertEquals(bikeRideOne.getcurrent(), 20);
    }
    @Test
    public void ShouldAbleToAccelerateMore(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3, BicycleType. MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideThree bikeRideThree = new BikeRideThree(mountainBike);
        bikeRideThree.ride();
        assertEquals(bikeRideThree.getcurrent(), 35);
    }
    }


