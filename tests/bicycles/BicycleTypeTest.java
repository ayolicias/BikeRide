package bicycles;

import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTypeTest {
    @Test

    public void ShouldGetTandemType(){

        BicycleSpecification tandemSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tandemSpec);

        assertEquals(tandemSpec.getAccelerationSpeed(),12);
        assertEquals(tandemSpec.getBrakeSpeed(),-7);

    }

    @Test

    public void ShouldGetMountainType(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -4, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);

       assertEquals(mountainBikeSpec.getAccelerationSpeed(),5);
       assertEquals(mountainBikeSpec.getBrakeSpeed(),-4);


    }
    @Test
    public void ShouldGetRoadType(){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -3, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);

        assertEquals(roadBikeSpec.getAccelerationSpeed(),11);
        assertEquals(roadBikeSpec.getBrakeSpeed(),-3);

    }
}
