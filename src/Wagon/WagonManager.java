package Wagon;

import Windows.AddWagonWindow;

import java.util.ArrayList;
import java.util.List;

public class WagonManager {
    private List<Wagon> wagons = new ArrayList<>();


    public List<Wagon> getWagons() {
        return wagons;
    }

    public void addInList(Wagon wagon){
        wagons.add(wagon);
    }
}
