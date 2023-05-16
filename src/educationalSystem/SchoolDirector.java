package educationalSystem;

public class SchoolDirector extends Teacher {
    public double getSdS() {
        return sdS;
    }

    public void setSdS(double sdS) {
        this.sdS = sdS;
    }

    private double sdS = getSalary() + 120000;

    @Override
    public String getSpecialist() {
        String specialist = "School Director";
        return specialist;
    }

    @Override
    public String getNameSurname() {
        String nameSurname = "Syune Bakunts";
        return nameSurname;
    }
}