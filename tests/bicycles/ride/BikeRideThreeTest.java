package bicycles.ride;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThreeTest {
    @Test
    public void ReturnRoadBikeCurrentSpeedInBikeRideThree(){
        RoadBike bicycles = new RoadBike();
        BikeRideThree bikeRide = new bicycles.ride.BikeRideThree(bicycles);
        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(),101);
    }

    @Test
    public void ReturnMountainBikeCurrentSpeedInBikeRideThree(){
        MountainBike bicycles = new MountainBike();
        BikeRideThree bikeRide = new bicycles.ride.BikeRideThree(bicycles);
        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(),40);
    }

    @Test
    public void ReturnTandemCurrentSpeedInBikeRideThree(){
        Tandem bicycles = new Tandem();
        BikeRideThree bikeRide = new bicycles.ride.BikeRideThree(bicycles);
        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(),97);
    }
}
