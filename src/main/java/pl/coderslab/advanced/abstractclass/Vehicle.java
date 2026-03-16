package pl.coderslab.advanced.abstractclass;

public abstract class Vehicle {
    private Integer maxSpeed;
    protected String model;

    public Vehicle(Integer maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public abstract String getSound();

    @Override
    public String toString() {
        return new StringBuilder("Class: ").append(this.getClass().getName()).append(" Model: ").append(getModel()).append(" Speed: ").append(getMaxSpeed()).append(" Sound: ").append(getSound()).toString();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
