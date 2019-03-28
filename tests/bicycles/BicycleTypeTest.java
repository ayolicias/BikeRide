package bicycles;

import bicycles.ride.BikeRideOne;
import bicycles.ride.BikeRideThree;
import bicycles.ride.BikeRideTwo;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTypeTest {
    @Test

    public void ShouldGetTandemType(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideTwo bikeRideTwo = new BikeRideTwo(bicycle);
        bikeRideTwo.ride();
        assertEquals(bikeRideTwo.getcurrent(), 72);

    }
    @Test

    public void ShouldGetMountainType(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -4, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride();
        assertEquals(bikeRideOne.getcurrent(), 20);

    }
    @Test
    public void ShouldGetRoadType(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideThree bikeRideThree = new BikeRideThree(bicycle);
        bikeRideThree.ride();
        assertEquals(bikeRideThree.getcurrent(), 77);

    }
}
