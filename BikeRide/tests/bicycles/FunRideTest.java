package bicycles;

import bicycles.models.BicycleFromSpec;
import bicycles.models.BicycleType;
import org.junit.jupiter.api.Test;

public class FunRideTest{


    @Test
    public void ShouldCheckTandemType() {
        FunRide funRide = new FunRide(2);
        BicycleSpecification tandemSpecification = new BicycleSpecification(12, -7, BicycleType.Tandem);

        BicycleFromSpec tandemFromSpec = new BicycleFromSpec(tandemSpecification);

}

}

