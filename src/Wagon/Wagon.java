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

    public int getNetto() {
        return netto;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getNature() {
        return nature;
    }

    public double getGluten() {
        return gluten;
    }

    public double getWeedAdmixture() {
        return weedAdmixture;
    }

    public double getGrainAdmixture() {
        return grainAdmixture;
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
