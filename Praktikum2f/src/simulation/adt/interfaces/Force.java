package simulation.adt.interfaces;

public interface Force extends AbstractValue<Force>{
    public Acc mul(Mass mass);
    public Work mul(Length length);
}
