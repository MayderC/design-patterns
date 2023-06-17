package src.Builder;

public interface IBuilder<T> {

    T setWeels(boolean wheels);
    T setEngine(String engine);
    T setDoors(String doors);

}
