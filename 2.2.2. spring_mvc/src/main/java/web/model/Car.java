package web.model;

public class Car {
    private String model;
    private int numberWheels;
    private int powerTurbineEngine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public int getPowerTurbineEngine() {
        return powerTurbineEngine;
    }

    public void setPowerTurbineEngine(int powerTurbineEngine) {
        this.powerTurbineEngine = powerTurbineEngine;
    }

    public Car(String model, int numberWheels, int powerTurbineEngine) {
        this.model = model;
        this.numberWheels = numberWheels;
        this.powerTurbineEngine = powerTurbineEngine;
    }
}
