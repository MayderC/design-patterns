package src.Builder;

public class Car implements  IBuilder<Car>{

    private boolean wheels = false;
    private String engine;

    private String doors;


    @Override
    public Car setWeels(boolean wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public Car setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Car setDoors(String doors) {
        this.doors = doors;
        return this;
    }

    public String toString(){
        return this.doors + " "+ this.engine+ " "+this.wheels;
    }

}
