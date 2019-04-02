package bicycles.ride;

import bicycles.Bicycle;
import bicycles.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    static int maximum = 0;

    public FunRide(int maximum) {
        this.maximum = maximum;
    }


    private  List<Bicycle> bikes = new ArrayList<>();


    public  String accept( Bicycle bicycle ) {

        if (!bikes.contains(bicycle) && maximum > bikes.size()) {
            bikes.add(bicycle);
            return "reject";

        } else if (maximum <= bikes.size()) {
        }
        return "accept";
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








