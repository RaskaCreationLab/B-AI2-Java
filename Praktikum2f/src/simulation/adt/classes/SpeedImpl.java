package simulation.adt.classes;

import simulation.adt.interfaces.Speed;
import simulation.adt.interfaces.Acc;
import simulation.adt.interfaces.TimeDiff;

class SpeedImpl extends AbstractValueImpl<Speed> implements Speed{

    private SpeedImpl(double inValue) {
        super(inValue);
    }
    
    static Speed valueOf(double inValue) {
        return new SpeedImpl(inValue);
    }

    @Override
    public Speed fromPrototype(double value) {
        return valueOf(value);
    }
    
    @Override
    public boolean checkInstance(Object other) {
         return other instanceof Speed;
    }
    
    @Override
    public Speed add(Speed other) {
        return SpeedImpl.valueOf(other.value() + this.value());
    }

    public Speed mul(double other) {
        return SpeedImpl.valueOf(other * this.value);
    }

    public Speed divide(double other) {
        return SpeedImpl.valueOf(other / this.value);
    }   
    
    public Acc div(TimeDiff other) {
        return AccImpl.valueOf(this.value / other.value());
    }
    
    @Override
    public Speed sub(Speed other) {
        return SpeedImpl.valueOf(other.value() - this.value());
    }    
    
    public String toString_EU() {
        String text = this.value + "m/s";
        return text;
    }
}