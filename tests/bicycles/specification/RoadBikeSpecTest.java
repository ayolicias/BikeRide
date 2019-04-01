package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeSpecTest {

@Test
    public void RoadBikeSpec(){
        bicycles.specification.BicycleSpecification roadBikeSpec = new bicycles.specification.BicycleSpecification ( 11 , -4 , BicycleType.RoadBike );
        Bicycle roadBike = new BicycleFromSpec( roadBikeSpec );

        assertEquals(roadBikeSpec.getAccelerationSpeed(),11);

        assertEquals(roadBikeSpec.getBrakeSpeed(),-4);

    }
}


