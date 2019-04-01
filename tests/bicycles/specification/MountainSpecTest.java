package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.ride.BikeRide;
import bicycles.ride.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainSpecTest {
    @Test

    public void MountainSpecSpeed(){
        bicycles.specification.BicycleSpecification mountainBikeSpec = new bicycles.specification.BicycleSpecification ( 5 , -3 , BicycleType.MountainBike );
        Bicycle mountainBike = new BicycleFromSpec( mountainBikeSpec );
        BikeRide mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride ( );

        System.out.println ( "Should ReturncurrentSpeed for mountainBike:" );
        assertEquals(mBikeRide.currentSpeed(),20);

        System.out.println ( "Should getaccelerationSpeed for MountainBike:" );
        assertEquals(mountainBikeSpec.getAccelerationSpeed(),5);

        System.out.println ( "Should getbrakeSpeed for mountainBike:" );
        assertEquals(mountainBikeSpec.getBrakeSpeed(),-3);

    }
}


