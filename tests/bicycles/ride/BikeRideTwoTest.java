package bicycles.ride;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTwoTest {

@Test
    public void ReturnRoadBikeCurrentSpeedInBikeRideTwo(){
    RoadBike bicycles = new RoadBike();
    BikeRideTwo bikeRide = new bicycles.ride.BikeRideTwo(bicycles);
    bikeRide.ride();
    assertEquals(bikeRide.currentSpeed(),116);
}

@Test
    public void ReturnMountainBikeCurrentSpeedInBikeRideTwo(){
        MountainBike bicycles = new MountainBike();
        BikeRideTwo bikeRide = new bicycles.ride.BikeRideTwo(bicycles);
        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(),48);
}

@Test

    public void ReturnTandemBikeCurrentSpeedInBikeRideTwo(){
    Tandem bicycles = new Tandem();
    BikeRideTwo bikeRide = new bicycles.ride.BikeRideTwo(bicycles);
    bikeRide.ride();
    assertEquals(bikeRide.currentSpeed(),116);
}
}
