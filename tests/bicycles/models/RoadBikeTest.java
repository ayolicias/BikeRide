package bicycles.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoadBikeTest {

    @Test
    public void ShouldAccelerateRoadBike( ) {
        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        roadBike.accelerate();
        assertEquals(roadBike.currentSpeed(),22);
    }
    @Test
    public void ShouldBrakeRoadBike( ) {
        RoadBike roadBike = new RoadBike();
        roadBike.brake();
        roadBike.brake();
        assertEquals(roadBike.currentSpeed(),-8);
    }

    @Test
    public void ShouldStopRoadBike( ) {
        RoadBike roadBike = new RoadBike();
        roadBike.stop();
        roadBike.stop();
        assertEquals(roadBike.currentSpeed(),0);
    }

}



