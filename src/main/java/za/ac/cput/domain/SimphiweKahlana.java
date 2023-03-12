/*
 * SimphiweKahlana.java
 * This is my POJO class
 * author : Simphiwe Kahlana (220162891)
 * 10 March 2023
 * */

package za.ac.cput.domain;

public class SimphiweKahlana {
    private double measurement;
    private String unitOfMeasurement;

    public SimphiweKahlana(double measurement, String unitOfMeasurement) {
        this.measurement = measurement;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public String measurementConverter() {

        switch (unitOfMeasurement.toUpperCase()) {
            case "CM":
                return "The measurement in Inches is: " + (measurement / 2.54);
            case "INCH":
                return "The measurement in Centimeters is: " + (measurement * 2.54);
            default:
                return "Invalid unit of measurement";
        }

    }

    public double getMeasurement() {
        return measurement;
    }

    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    @Override
    public String toString() {
        return "Measurement = " + measurement + ", Unit of measurement = " + unitOfMeasurement;
    }

}
