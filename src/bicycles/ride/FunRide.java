package bicycles.ride;

import bicycles.Bicycle;
import bicycles.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    private int maximum = 0;

    public FunRide(int maximum) {
        this.maximum = maximum;
    }


    private  List<Bicycle> bikes = new ArrayList<>();


    public  String accept( Bicycle bicycle ) {

        if (!bikes.contains(bicycle) && bikes.size() < maximum ) {
            bikes.add(bicycle);
            return "accept";
        }
        return "reject";
    }


    public  int getCountForType(BicycleType bicycleType) {
        int funCount = 0;

        for (Bicycle type : bikes) {
            if (type.getBicycleType() == bicycleType) {
                funCount++;
            }
        }
        return funCount;
    }


}








