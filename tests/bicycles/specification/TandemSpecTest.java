package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.ride.BikeRide;
import bicycles.ride.BikeRideOne;
import org.junit.jupiter.api.Test;

public class TandemSpecTest {


    @Test
    public void TandemSpec(){
        bicycles.specification.BicycleSpecification tandemBikeSpec = new bicycles.specification.BicycleSpecification ( 12, -7, BicycleType.MountainBike );
        Bicycle tandem = new BicycleFromSpec( tandemBikeSpec);
        BikeRide BikeRide = new BikeRideOne(tandem);
        BikeRide.ride ( );

        System.out.println ( "Should ReturncurrentSpeed for TandemBikeSpec:" );
        System.out.println(BikeRide.currentSpeed());

        System.out.println ( "Should getaccelerationSpeed for TandemBikeSpec:" );
        System.out.println(tandemBikeSpec.getAccelerationSpeed());

        System.out.println ( "Should getbrakeSpeed for TandemBikeSpec:" );
        System.out.println(tandemBikeSpec.getBrakeSpeed());

    }
}
