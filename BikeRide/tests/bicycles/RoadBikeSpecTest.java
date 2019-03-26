package bicycles;

import bicycles.models.BicycleFromSpec;
import bicycles.models.BicycleType;
import bicycles.models.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeSpecTest {

    @Test
    public void ShouldAccelerateSpecLess(){

        BicycleSpecification RoadBikeSpec = new BicycleSpecification(11, 4, BicycleType.MountainBike);
        Bicycle RoadBike = new BicycleFromSpec(RoadBikeSpec);
        BikeRideOne bikeRideOne = new BikeRideOne(RoadBike);
        bikeRideOne.ride();
        assertEquals(bikeRideOne.getcurrent(),44);
    }
    @Test
    public void ShouldAccelerateMore(){
    BicycleSpecification RoadBikeSpec = new BicycleSpecification(11, 4, BicycleType.MountainBike);
    Bicycle RoadBike = new BicycleFromSpec(RoadBikeSpec);
    BikeRideTwo bikeRideTwo = new BikeRideTwo(RoadBike);
    bikeRideTwo.ride();
    assertEquals(bikeRideTwo.getcurrent(),66);
}
}


