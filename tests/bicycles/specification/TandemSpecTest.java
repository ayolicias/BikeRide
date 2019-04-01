package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemSpecTest {


    @Test
    public void TandemSpec(){
        bicycles.specification.BicycleSpecification tandemBikeSpec = new bicycles.specification.BicycleSpecification ( 12, -7, BicycleType.Tandem );
        Bicycle tandem = new BicycleFromSpec( tandemBikeSpec);

        assertEquals(tandemBikeSpec.getAccelerationSpeed(),12);

        assertEquals(tandemBikeSpec.getBrakeSpeed(),-7);

    }
}
