package bicycles.ride;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static bicycles.BicycleType.*;

public class FunRideTest {


    @Test
    public void AcceptBikes() {

        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, Tandem);
        Bicycle tandemBike = new BicycleFromSpec(TandemSpec);
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 3, RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);
        BicycleSpecification MountainSpec = new BicycleSpecification(5, 4, MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(MountainSpec);


        FunRide fun = new FunRide(5);

        FunRide.accept(mountainBike);
        FunRide.accept(tandemBike);

        System.out.println("Should accept Added Bikes");

    }

    @Test

    public void RejectMoreBikes() {

        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, Tandem);
        Bicycle tandemBike = new BicycleFromSpec(TandemSpec);
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 3, RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);
        BicycleSpecification MountainSpec = new BicycleSpecification(5, 4, MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(MountainSpec);

        FunRide fun = new FunRide(6);

        FunRide.accept(tandemBike);
        FunRide.accept(roadBike);
        FunRide.accept(mountainBike);
        FunRide.accept(tandemBike);
        FunRide.accept(roadBike);


        System.out.println("Should accept 3 Bikes  and  Reject more added Bikes\" ");
    }

    @Test

    public void ShouldReturnAcceptedNumbersOfBikes() {

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


        System.out.println(("Display Number Of RoadBikes "));
        System.out.println(fun.getCountForType(BicycleType.RoadBike));
        System.out.println(("Display Number of MountainBikes "));
        System.out.println(fun.getCountForType(BicycleType.MountainBike));
        System.out.println(("Display Number of TandemBikes "));
        System.out.println(fun.getCountForType(BicycleType.Tandem));


    }
}





