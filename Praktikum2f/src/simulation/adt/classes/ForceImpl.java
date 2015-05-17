package simulation.adt.classes;


import simulation.adt.interfaces.Force;

public class ForceImpl extends AbstractValueImpl<Force> implements Force{

    private ForceImpl(double inValue) {
        super(inValue);
    }
    
    public static Force valueOf(double inValue) {
        return new ForceImpl(inValue);
    }

    @Override
    public Force fromPrototype(double value) {
        return valueOf(value);
    }
    
    @Override
    public boolean checkInstance(Object other) {
         return other instanceof Force;
    }
    
    @Override
    public Force add(Force other) {
        return ForceImpl.valueOf(other.value() + this.value());
    }

    public Force mul(double other) {
        return ForceImpl.valueOf(other * this.value());
    }
        
    public Force div(double other) {
        return ForceImpl.valueOf(this.value() / other);
    }   
    
    @Override
    public Force sub(Force other) {
        return ForceImpl.valueOf(other.value() - this.value());
    }    
    
    public String toString_EU() {
        String text = this.value + "N";
        return text;
    }
}