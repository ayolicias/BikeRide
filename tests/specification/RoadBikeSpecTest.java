package specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.ride.BikeRideOne;
import bicycles.specification.BicycleFromSpec;
import bicycles.ride.BikeRideTwo;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeSpecTest {

    @Test
    public void ShouldAccelerateSpecLess(){

        BicycleSpecification RoadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle RoadBike = new BicycleFromSpec(RoadBikeSpec);
        BikeRideOne bikeRideOne = new BikeRideOne(RoadBike);
        bikeRideOne.ride();
        assertEquals(bikeRideOne.getcurrent(),44);
    }
    @Test
    public void ShouldAccelerateMore(){
    BicycleSpecification RoadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
    Bicycle RoadBike = new BicycleFromSpec(RoadBikeSpec);
    BikeRideTwo bikeRideTwo = new BikeRideTwo(RoadBike);
    bikeRideTwo.ride();
    assertEquals(bikeRideTwo.getcurrent(),66);
}
}


