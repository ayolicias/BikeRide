package bicycles;

public abstract class  BicycleBase implements Bicycle {
//    private final int BicycleBase;
//    protected BicycleBase bicycles;
    public int speed;
    protected int changeSpeed;
//    private int BicycleBase;

    public void BicycleBase(BicycleBase bicycles) {
        int speed;
    }

    protected void changeSpeed(int speed ) {
        this.speed +=speed;
    }

    protected BicycleBase( ) {
        this.speed = speed;

    }
    public int currentSpeed() {
        return this.speed;
    }

    public void accelerate(){
        this.speed +=12;
    }

    public void brake(){
        this.speed -=7;
    }

    public void stop()
    {
        this.speed =0;
    }

    protected abstract int changeSpeed( );
}
