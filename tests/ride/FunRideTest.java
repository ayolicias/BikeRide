package ride;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.ride.FunRide;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

public class FunRideTest{


    @Test
    public void ShouldCountAcceptedBikes() {

        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(TandemSpec);
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 3, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);
        BicycleSpecification MountainSpec = new BicycleSpecification(5, 4, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(MountainSpec);


        FunRide fun = new FunRide(5);

        fun.accept(mountainBike);
        fun.accept(tandemBike);
        fun.accept(roadBike);



        System.out.println("Should count accepted Bike");

    }

    @Test

    public void AcceptBikesForTheRide(){

        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(TandemSpec);
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 3, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);
        BicycleSpecification MountainSpec = new BicycleSpecification(5, 4, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(MountainSpec);

        FunRide fun = new FunRide(5);

        fun.accept(tandemBike);
        fun.accept(roadBike);
        fun.accept(mountainBike);


        System.out.println("accept");
    }
    @Test
    public void ShouldRejectOneBike(){


        BicycleSpecification TandemSpec = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(TandemSpec);
        BicycleSpecification RoadSpec = new BicycleSpecification(11, 3, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(RoadSpec);
        BicycleSpecification MountainSpec = new BicycleSpecification(5, 4, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(MountainSpec);

        FunRide fun = new FunRide(3);

        fun.accept(tandemBike);
        fun.accept(roadBike);


        System.out.println("reject");

    }

}

