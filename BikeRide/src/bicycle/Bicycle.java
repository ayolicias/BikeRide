package bicycle;

public class Bicycle {
    private int speed;

//    private int currentSpeed;

    public void accelerate(){
        speed +=5;
    }

    public void brake(){
        speed -=3;
    }

    public int currentSpeed(){
        return speed = speed + 5;
    }
    public void stop(){
        speed = 0;
    }
}
