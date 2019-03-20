package bicycles;

import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemTest {
    @Test
    public void ShouldAccelerate(){
        Tandem tandem = new Tandem();
        BikeRide bikeRide = new BikeRide(tandem);
        bikeRide.ride();
        assertEquals(bikeRide.getcurrent(), 34);
    }

}
