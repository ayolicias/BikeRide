package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.ride.BikeRide;
import bicycles.ride.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemSpecTest {


    @Test
    public void TandemSpec(){
        bicycles.specification.BicycleSpecification tandemBikeSpec = new bicycles.specification.BicycleSpecification ( 12, -7, BicycleType.Tandem );
        Bicycle tandem = new BicycleFromSpec( tandemBikeSpec);
        BikeRide BikeRide = new BikeRideOne(tandem);
        BikeRide.ride ( );

        System.out.println ( "Should ReturncurrentSpeed for TandemBikeSpec:" );
        assertEquals(BikeRide.currentSpeed(),48);

        System.out.println ( "Should getaccelerationSpeed for TandemBikeSpec:" );
        assertEquals(tandemBikeSpec.getAccelerationSpeed(),12);

        System.out.println ( "Should getbrakeSpeed for TandemBikeSpec:" );
        assertEquals(tandemBikeSpec.getBrakeSpeed(),-7);

    }
}
