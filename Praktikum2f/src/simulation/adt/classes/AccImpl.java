package simulation.adt.classes;

import simulation.adt.interfaces.Acc;
import simulation.adt.interfaces.Mass;
import simulation.adt.interfaces.Force;
import simulation.adt.classes.MassImpl;

public class AccImpl extends AbstractValueImpl<Acc> implements Acc{

    public AccImpl(double inValue) {
        super(inValue);
    }
    
    public static Acc valueOf(double inValue) {
        return new AccImpl(inValue);
    }

    @Override
    public Acc fromPrototype(double value) {
        return valueOf(value);
    }
    
    @Override
    public boolean checkInstance(Object other) {
         return other instanceof Acc;
    }
    
    @Override
    public Acc add(Acc other) {
        return AccImpl.valueOf(other.value() + this.value());
    }

    public Acc mul(double other) {
        return AccImpl.valueOf(other * this.value());
    }

    public Acc divide(double other) {
        return AccImpl.valueOf(other / this.value());
    }   
    
    public Mass divM(Force other) {
        return MassImpl.valueOf(this.value() / other.value());
    }
    
    public Force divF(Mass other) {
        return ForceImpl.valueOf(this.value() / other.value());
    }
    
    @Override
    public Acc sub(Acc other) {
        return AccImpl.valueOf(other.value() - this.value);
    }
    
    public Acc sub(double other) {
        return AccImpl.valueOf(other - this.value);
    }   
    
    public String toString_EU() {
        String text = this.value + "m/s²";
        return text;
    }
}