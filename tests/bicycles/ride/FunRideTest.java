package bicycles.ride;

import bicycles.Bicycle;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static bicycles.BicycleType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {


    @Test
    public void shouldGetCountForBikeType() {

        FunRide funRide = new FunRide(5);

        BicycleSpecification roadSpec = new BicycleSpecification(11, 3, RoadBike);

        Bicycle roadBike1 = new BicycleFromSpec(roadSpec);
        Bicycle roadBike2 = new BicycleFromSpec(roadSpec);
        Bicycle roadBike3 = new BicycleFromSpec(roadSpec);

        assertEquals("accept", funRide.accept(roadBike1));
        assertEquals("accept", funRide.accept(roadBike2));
        assertEquals("accept", funRide.accept(roadBike3));

        assertEquals(funRide.getCountForType(RoadBike), 3);

    }

    @Test

    public void shouldAcceptBikesIfThereIsStillSpaceInTheFunRide() {
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 3, RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);
        BicycleSpecification MountainSpec = new BicycleSpecification(5, 4, MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(MountainSpec);

        FunRide funRide = new FunRide(3);

        assertEquals(funRide.accept(mountainBike),"accept");
        assertEquals(funRide.accept(roadBike),"accept");

    }

    @Test
    public void shouldNotAcceptBikeAlreadyAcceptedForFunRide() {

        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, Tandem);
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 3, RoadBike);
        BicycleSpecification MountainSpec = new BicycleSpecification(5, 4, MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(MountainSpec);

        FunRide funRide = new FunRide(3);

        assertEquals(funRide.accept(mountainBike),"accept");
        assertEquals(funRide.accept(mountainBike),"reject");

    }

    @Test
    public void shouldReturnRejectedIfAlreadyReachedMaxBikeCountForFunRide() {

        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, Tandem);
        Bicycle tandemBike = new BicycleFromSpec(TandemSpec);
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 3, RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);
        BicycleSpecification MountainSpec = new BicycleSpecification(5, 4, MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(MountainSpec);

        FunRide funRide = new FunRide(2);

        assertEquals("accept", funRide.accept(tandemBike));
        assertEquals("accept", funRide.accept(roadBike));
        assertEquals("reject", funRide.accept(mountainBike));

    }
}