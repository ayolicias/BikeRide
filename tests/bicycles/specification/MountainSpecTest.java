package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainSpecTest {
    @Test

    public void MountainSpecSpeed(){
        bicycles.specification.BicycleSpecification mountainBikeSpec = new bicycles.specification.BicycleSpecification ( 5 , -3 , BicycleType.MountainBike );
        Bicycle mountainBike = new BicycleFromSpec( mountainBikeSpec );

        assertEquals(mountainBikeSpec.getAccelerationSpeed(),5);

        assertEquals(mountainBikeSpec.getBrakeSpeed(),-3);

    }
}


