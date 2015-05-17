package simulation.adt.classes;

import simulation.adt.interfaces.Power;

class PowerImpl extends AbstractValueImpl<Power> implements Power{

    private PowerImpl(double inValue) {
        super(inValue);
    }
    
    static Power valueOf(double inValue) {
        return new PowerImpl(inValue);
    }

    @Override
    public Power fromPrototype(double value) {
        return valueOf(value);
    }
    
    @Override
    public boolean checkInstance(Object other) {
         return other instanceof Power;
    }
    
    @Override
    public Power add(Power other) {
        return PowerImpl.valueOf(other.value() + this.value());
    }

    public Power mul(double other) {
        return PowerImpl.valueOf(other * this.value());
    }

    public Power div(double other) {
        return PowerImpl.valueOf(this.value() / other);
    }   
    
    @Override
    public Power sub(Power other) {
        return PowerImpl.valueOf(other.value() - this.value());
    }    
    
    public String toString_EU() {
        String text = this.value + "W";
        return text;
    }
}