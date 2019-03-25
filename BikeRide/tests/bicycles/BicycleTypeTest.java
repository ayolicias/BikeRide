package bicycles;

import bicycles.models.BicycleFromSpec;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTypeTest {
    private BikeRideOne bikeRideOne;

    @Test

    public void ShouldGetBicycleType(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        assertEquals(bikeRideOne.getcurrent(), 36);

    }
}
