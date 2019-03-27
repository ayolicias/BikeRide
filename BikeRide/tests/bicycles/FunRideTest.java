package bicycles;

import bicycles.models.BicycleFromSpec;
import bicycles.models.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest{


    @Test
    public void ShouldCountMountainType() {

        BicycleSpecification mountFromSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountFromSpec);

        FunRide fun = new FunRide(3);

        fun.accept(mountainBike);
        fun.accept(mountainBike);
        fun.accept(mountainBike);


        assertEquals(fun.getCountForType(BicycleType.MountainBike),3);

}

    @Test
    public void ShouldCountRoadType(){
        BicycleSpecification RoadBikeSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle mountainBike = new BicycleFromSpec(RoadBikeSpec);



        FunRide fun = new FunRide(2);

        fun.accept(mountainBike);
        fun.accept(mountainBike);


        assertEquals(fun.getCountForType(BicycleType.RoadBike),2);

    }

    @Test

    public void ShouldCountTandemType(){

        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(TandemSpec);

        FunRide fun = new FunRide(4);

        fun.accept(tandemBike);
        fun.accept(tandemBike);
        fun.accept(tandemBike);
        fun.accept(tandemBike);


        assertEquals(fun.getCountForType(BicycleType.Tandem),4);

    }

}

