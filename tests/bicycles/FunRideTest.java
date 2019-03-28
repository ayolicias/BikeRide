package bicycles;

import bicycles.ride.FunRide;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest{


    @Test
    public void ShouldCountBikeType() {

        BicycleSpecification mountFromSpec = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountFromSpec);

        BicycleSpecification roadFromSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle RoadBike = new BicycleFromSpec(roadFromSpec);


        FunRide fun = new FunRide(5);

        fun.accept(mountainBike);
        fun.accept(mountainBike);
        fun.accept(RoadBike);



        assertEquals(fun.getCountForType(BicycleType.RoadBike),1);

}

    @Test

    public void rejectTest(){

        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(TandemSpec);
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);

        FunRide fun = new FunRide(2);

        fun.accept(tandemBike);
        fun.accept(roadBike);


        assertEquals(fun.accept(tandemBike),"reject");

    }
    @Test
    public void acceptTest(){


        BicycleSpecification RoadSpec = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);

        FunRide fun = new FunRide(2);

        fun.accept(roadBike);


        assertEquals(fun.accept(roadBike),"accept");

    }

}

