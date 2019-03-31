package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.ride.BikeRide;
import bicycles.ride.BikeRideOne;
import org.junit.jupiter.api.Test;

public class RoadBikeSpecTest {

@Test
    public void RoadBikeSpec(){
        bicycles.specification.BicycleSpecification roadBikeSpec = new bicycles.specification.BicycleSpecification ( 11 , -4 , BicycleType.MountainBike );
        Bicycle roadBike = new BicycleFromSpec( roadBikeSpec );
        BikeRide BikeRide = new BikeRideOne(roadBike);
        BikeRide.ride ( );

        System.out.println ( "Should ReturncurrentSpeed for roadBikeSpec:" );
        System.out.println(BikeRide.currentSpeed());

        System.out.println ( "Should getaccelerationSpeed for roadBikeSpec:" );
        System.out.println(roadBikeSpec.getAccelerationSpeed());

        System.out.println ( "Should getbrakeSpeed for roadBikeSpec:" );
        System.out.println(roadBikeSpec.getBrakeSpeed());

    }
}


