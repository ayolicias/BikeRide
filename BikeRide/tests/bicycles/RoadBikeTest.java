package bicycles;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoadBikeTest {

    @Test
    public void ShouldBeAbleToAccelerate( ) {
            RoadBike roadBike = new RoadBike();
            BikeRide bikeRide = new BikeRide(roadBike);
            bikeRide.ride();
            assertEquals(bikeRide.getcurrent(), 36);
        }
    }



