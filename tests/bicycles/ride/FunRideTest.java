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
        FunRide fun = new FunRide(1);
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 3, RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);

        fun.accept(roadBike);

        assertEquals(fun.getCountForType(RoadBike), 1);

    }

    @Test

    public void ShouldAcceptBike() {
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 3, RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);
        BicycleSpecification MountainSpec = new BicycleSpecification(5, 4, MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(MountainSpec);

        FunRide fun = new FunRide(3);

        fun.accept(roadBike);
        fun.accept(mountainBike);

        assertEquals(FunRide.accept(mountainBike),"accept");

        assertEquals(FunRide.accept(roadBike),"accept");

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

        assertEquals(roadBike.getBicycleType(),RoadBike);

        assertEquals(mountainBike.getBicycleType(), MountainBike);

        assertEquals(tandemBike.getBicycleType(),Tandem);

    }

    @Test
    public void ShouldReturnRejectedTypesOfBikes() {

        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, Tandem);
        Bicycle tandemBike = new BicycleFromSpec(TandemSpec);
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 3, RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);
        BicycleSpecification MountainSpec = new BicycleSpecification(5, 4, MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(MountainSpec);

        FunRide fun = new FunRide(2);

        FunRide.accept(tandemBike);
        FunRide.accept(roadBike);
        FunRide.accept(mountainBike);

        assertEquals(roadBike.getBicycleType(),RoadBike);
        assertEquals(tandemBike.getBicycleType(),Tandem);
        assertEquals(mountainBike.getBicycleType(),MountainBike);


    }
}





