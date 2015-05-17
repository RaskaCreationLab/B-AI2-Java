package simulation.adt.interfaces;

public interface AbstractValue<E extends AbstractValue> extends Comparable<E> {
    //Mathematical standardoperations
    public E add(E other);
    public E sub(E other);  
    
    public E fromPrototype(double value);
    public double value();
    public boolean checkInstance(Object obj);
}
