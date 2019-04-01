package bicycles.ride;

import bicycles.Bicycle;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static bicycles.BicycleType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {


    @Test
    public void ShouldGetCountForBikeType() {
        FunRide fun = new FunRide(2);
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 3, RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);
        Bicycle roadBike2 = new BicycleFromSpec(RoadSpec);
        fun.accept(roadBike);
        fun.accept(roadBike2);

        assertEquals(fun.getCountForType(RoadBike), 2);

    }

    @Test

    public void AddAcceptedBike() {
        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, Tandem);
        Bicycle tandemBike = new BicycleFromSpec(TandemSpec);
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 3, RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);
        BicycleSpecification MountainSpec = new BicycleSpecification(5, 4, MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(MountainSpec);

        FunRide fun = new FunRide(3);

        fun.accept(tandemBike);
        fun.accept(roadBike);
        fun.accept(mountainBike);

        assertEquals(FunRide.accept(mountainBike),"accept");
    }

    @Test

    public void ShouldReturnAcceptedTypesOfBikes() {

        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, Tandem);
        Bicycle tandemBike = new BicycleFromSpec(TandemSpec);
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 3, RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);
        BicycleSpecification MountainSpec = new BicycleSpecification(5, 4, MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(MountainSpec);

        FunRide fun = new FunRide(3);

        FunRide.accept(tandemBike);
        FunRide.accept(roadBike);
        FunRide.accept(mountainBike);
        FunRide.accept(mountainBike);

        System.out.println(("Display RoadBike "));
        assertEquals(roadBike.getBicycleType(),RoadBike);
        System.out.println(("Display MountainBike "));
        assertEquals(mountainBike.getBicycleType(), MountainBike);
        System.out.println(("Display Tandem "));
        assertEquals(tandemBike.getBicycleType(),Tandem);


    }
}





