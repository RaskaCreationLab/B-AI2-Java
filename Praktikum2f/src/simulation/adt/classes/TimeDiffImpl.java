package simulation.adt.classes;

import simulation.adt.interfaces.TimeDiff;

class TimeDiffImpl extends AbstractValueImpl<TimeDiff> implements TimeDiff{

    private TimeDiffImpl(double inValue) {
        super(inValue);
    }
    
    static TimeDiff valueOf(double inValue) {
        return new TimeDiffImpl(inValue);
    }

    @Override
    public TimeDiff fromPrototype(double value) {
        return valueOf(value);
    }
    
    @Override
    public boolean checkInstance(Object other) {
         return other instanceof TimeDiff;
    }
    
    @Override
    public TimeDiff add(TimeDiff other) {
        return TimeDiffImpl.valueOf(other.value() + this.value());
    }

    public TimeDiff mul(double other) {
        return TimeDiffImpl.valueOf(other * this.value());
    }

    public TimeDiff div(double other) {
        return TimeDiffImpl.valueOf(other / this.value());
    }   
    
    @Override
    public TimeDiff sub(TimeDiff other) {
        return TimeDiffImpl.valueOf(other.value() - this.value());
    }    
    
    public String toString_EU() {
        String text = this.value + "s";
        return text;
    }
}
