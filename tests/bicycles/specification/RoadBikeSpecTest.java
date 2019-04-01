package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.ride.BikeRide;
import bicycles.ride.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeSpecTest {

@Test
    public void RoadBikeSpec(){
        bicycles.specification.BicycleSpecification roadBikeSpec = new bicycles.specification.BicycleSpecification ( 11 , -4 , BicycleType.RoadBike );
        Bicycle roadBike = new BicycleFromSpec( roadBikeSpec );
        BikeRide BikeRide = new BikeRideOne(roadBike);
        BikeRide.ride ( );

        System.out.println ( "Should ReturncurrentSpeed for roadBikeSpec:" );
        assertEquals(BikeRide.currentSpeed(),44);

        System.out.println ( "Should getaccelerationSpeed for roadBikeSpec:" );
        assertEquals(roadBikeSpec.getAccelerationSpeed(),11);

        System.out.println ( "Should getbrakeSpeed for roadBikeSpec:" );
        assertEquals(roadBikeSpec.getBrakeSpeed(),-4);

    }
}


