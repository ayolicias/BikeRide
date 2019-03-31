package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.ride.BikeRide;
import bicycles.ride.BikeRideOne;
import org.junit.jupiter.api.Test;

public class MountainSpecTest {
    @Test

    public void MountainSpecSpeed(){
        bicycles.specification.BicycleSpecification mountainBikeSpec = new bicycles.specification.BicycleSpecification ( 5 , -3 , BicycleType.MountainBike );
        Bicycle mountainBike = new BicycleFromSpec( mountainBikeSpec );
        BikeRide mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride ( );

        System.out.println ( "Should ReturncurrentSpeed for mountainBike:" );
        System.out.println(mBikeRide.currentSpeed());

        System.out.println ( "Should getaccelerationSpeed for MountainBike:" );
        System.out.println(mountainBikeSpec.getAccelerationSpeed());

        System.out.println ( "Should getbrakeSpeed for mountainBike:" );
        System.out.println(mountainBikeSpec.getBrakeSpeed());

    }
}


