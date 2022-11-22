package Wagon;

import javax.swing.*;
import java.util.Objects;

public class Wagon {
    private int netto;
    private double humidity;
    private double nature;
    private double gluten;
    private double weedAdmixture;
    private double grainAdmixture;

    public Wagon(int netto, double humidity, double nature, double gluten, double weedAdmixture, double grainAdmixture) {
        this.netto = netto;
        this.humidity = humidity;
        this.nature = nature;
        this.gluten = gluten;
        this.weedAdmixture = weedAdmixture;
        this.grainAdmixture = grainAdmixture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wagon wagon = (Wagon) o;
        return netto == wagon.netto && Double.compare(wagon.humidity, humidity) == 0 && Double.compare(wagon.nature, nature) == 0 && Double.compare(wagon.gluten, gluten) == 0 && Double.compare(wagon.weedAdmixture, weedAdmixture) == 0 && Double.compare(wagon.grainAdmixture, grainAdmixture) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(netto, humidity, nature, gluten, weedAdmixture, grainAdmixture) * 31;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "netto=" + netto +
                ", humidity=" + humidity +
                ", nature=" + nature +
                ", gluten=" + gluten +
                ", weedAdmixture=" + weedAdmixture +
                ", grainAdmixture=" + grainAdmixture +
                '}';
    }
}
