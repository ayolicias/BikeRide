package bicycles.ride;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideOneTest {

    @Test
    public void ReturnRoadBikeCurrentSpeedInBikeRideOne() {
        RoadBike bicycles = new RoadBike();
        BikeRideOne bikeRide = new bicycles.ride.BikeRideOne(bicycles);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 36);

    }

    @Test
    public void ReturnMountainBikeCurrentSpeedInBikeRideOne() {
        MountainBike bicycles = new MountainBike();
        BikeRideOne bikeRide = new bicycles.ride.BikeRideOne(bicycles);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 14);

    }

    @Test
    public void ReturnTandemBikeCurrentSpeedInBikeRideOne() {
        Tandem bicycles = new Tandem();
        BikeRideOne bikeRide = new bicycles.ride.BikeRideOne(bicycles);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 34);

    }
}
