package bicycles.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public  class TandemTest {
    @Test
    public void ShouldAccelerateTandemBike( ) {
        Tandem tandem = new Tandem();
        tandem.accelerate();
        tandem.accelerate();
        tandem.accelerate();

        assertEquals(tandem.currentSpeed(),36);
    }

    @Test
    public void ShouldbrakeTandemBike( ) {
        Tandem tandem = new Tandem();
        tandem.brake();
        tandem.brake();
        tandem.brake();

        assertEquals(tandem.currentSpeed(),-21);
    }

    @Test
    public void ShouldStopTandemBike( ) {
        Tandem tandem = new Tandem();
        tandem.stop();
        tandem.stop();
        tandem.stop();

        assertEquals(tandem.currentSpeed(),0);
    }

}






