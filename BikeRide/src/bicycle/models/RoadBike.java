package bicycle.models;
import bicycle.bicycle;

public abstract class RoadBike implements bicycle{

    private int speed;

    @Override
    public int accelerate( ) {

        return this.speed +=11;
    }

    @Override
    public int brake() {
       return this.speed -=4;
    }

    @Override
    public int currentSpeed() {
        return this.speed;
    }

}
