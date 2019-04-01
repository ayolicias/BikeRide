package bicycles.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {

    @Test
    public void ShouldAccelerateMountainBike( ) {
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();

        assertEquals(mountainBike.currentSpeed(),15);
    }

    @Test
    public void ShouldBrakeMountainBike( ) {
        MountainBike mountainBike = new MountainBike();
        mountainBike.brake();
        mountainBike.brake();
        mountainBike.brake();

        assertEquals(mountainBike.currentSpeed(),-9);
    }

    @Test
    public void ShouldStopMountainBike( ) {
        MountainBike mountainBike = new MountainBike();
        mountainBike.stop();
        mountainBike.stop();
        mountainBike.stop();

        assertEquals(mountainBike.currentSpeed(),0);
    }

}
