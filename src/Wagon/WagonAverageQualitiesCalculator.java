package Wagon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WagonAverageQualitiesCalculator {
    private int fullNetto;
    private double meanHumidity;
    private double meanNature;
    private double meanGluten;
    private double meanGrainAdmixture;
    private double meanWeedAdmixture;
     private List<Wagon> wagons = new ArrayList<>();

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    public Integer getFullNetto() {
        return fullNetto;
    }

    public void setFullNetto(Integer fullNetto) {
        this.fullNetto = fullNetto;
    }

    public Double getMeanHumidity() {
        return meanHumidity;
    }

    public void setMeanHumidity(Double meanHumidity) {
        this.meanHumidity = meanHumidity;
    }

    public Double getMeanNature() {
        return meanNature;
    }

    public void setMeanNature(Double meanNature) {
        this.meanNature = meanNature;
    }

    public Double getMeanGluten() {
        return meanGluten;
    }

    public void setMeanGluten(Double meanGluten) {
        this.meanGluten = meanGluten;
    }

    public Double getMeanGrainAdmixture() {
        return meanGrainAdmixture;
    }

    public void setMeanGrainAdmixture(Double meanGrainAdmixture) {
        this.meanGrainAdmixture = meanGrainAdmixture;
    }

    public Double getMeanWeedAdmixture() {
        return meanWeedAdmixture;
    }

    public void setMeanWeedAdmixture(Double meanWeedAdmixture) {
        this.meanWeedAdmixture = meanWeedAdmixture;
    }


    public void nettoFuller() {
        Integer fullNetto = getFullNetto();
        for (Wagon c : wagons) {
            fullNetto += c.getNetto();
        }
        setFullNetto(fullNetto);
        operations();
    }

    public void operations() {
        double meanHumidity = 0;
        double meanNature = 0;
        double meanGluten = 0;
        double meanGrainAdmixture = 0;
        double meanWeedAdmixture = 0;
        for (Wagon c : wagons) {
            meanHumidity += (c.getHumidity() * c.getNetto());
            meanNature += (c.getNature() * c.getNetto());
            meanGluten += (c.getGluten() * c.getNetto());
            meanGrainAdmixture += (c.getGrainAdmixture() * c.getNetto());
            meanWeedAdmixture += (c.getWeedAdmixture() * c.getNetto());
        }
        setMeanHumidity(meanHumidity / fullNetto);
        setMeanNature(meanNature / fullNetto);
        setMeanGluten(meanGluten / fullNetto);
        setMeanGrainAdmixture(meanGrainAdmixture / fullNetto);
        setMeanWeedAdmixture(meanWeedAdmixture / fullNetto);
    }

    public void clearAllStuff() {
        wagons.clear();
        setMeanGluten(0.0);
        setMeanNature(0.0);
        setFullNetto(0);
        setMeanNature(0.0);
        setMeanHumidity(0.0);
        setMeanWeedAdmixture(0.0);
        setMeanGrainAdmixture(0.0
        );
    }

}
