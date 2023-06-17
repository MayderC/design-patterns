package src.Prototype;

public class ObjectToClone implements Prototype<ObjectToClone>{
    @Override
    public ObjectToClone Clone() {
        
        return new ObjectToClone();
    }
}
