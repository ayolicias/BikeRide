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


    private static List<Bicycle> bikes = new ArrayList<>();


    public static void accept(Bicycle bicycle) {


        if (!bikes.contains(bicycle) && maximum > bikes.size()) {
            bikes.add(bicycle);

            System.out.println("Accept");
//            return "accept";

        } else if (maximum <= bikes.size()) {
            System.out.println("reject");
        }
//        return "reject";

    }


    public static int getCountForType(BicycleType bicycleType) {
        int funCount = 0;

        for (Bicycle type : bikes) {
            if (type.getBicycleType() == bicycleType) {
                funCount++;
            }
        }
        return funCount;
    }
}



//    public int getEnteredCount(){
//        return bikes.size();
//    }
//}







