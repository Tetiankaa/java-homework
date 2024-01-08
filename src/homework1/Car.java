package homework1;

public class Car {

    private String model;
    private double power;
    private int volumeEngine;
    private double turbo;

    public Car(String model, double power, int volumeEngine, double turbo){
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }

    public String getModel(){
        return this.model;
    }

    public double getPower(){
        return this.power;
    }

    public int getVolumeEngine(){
        return this.volumeEngine;
    }

    public double getTurbo(){
        return this.turbo;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setPower(double power){
        this.power = power;
    }

    public void setVolumeEngine(int volumeEngine){
        this.volumeEngine = volumeEngine;
    }

    public void setTurbo(double turbo){
        this.turbo = turbo;
    }
}
