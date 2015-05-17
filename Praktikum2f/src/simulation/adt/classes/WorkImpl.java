package simulation.adt.classes;

import simulation.adt.interfaces.Work;

class WorkImpl extends AbstractValueImpl<Work> implements Work{

    private WorkImpl(double inValue) {
        super(inValue);
    }
    
    static Work valueOf(double inValue) {
        return new WorkImpl(inValue);
    }

    @Override
    public Work fromPrototype(double value) {
        return valueOf(value);
    }
    
    @Override
    public boolean checkInstance(Object other) {
         return other instanceof Work;
    }
    
    @Override
    public Work add(Work other) {
        return WorkImpl.valueOf(other.value() + this.value());
    }

    public Work mul(Work other) {
        return WorkImpl.valueOf(other.value() * this.value());
    }

    public Work div(Work other) {
        return WorkImpl.valueOf(other.value() / this.value());
    }   
    
    @Override
    public Work sub(Work other) {
        return WorkImpl.valueOf(other.value() - this.value());
    }    
    
    public String toString_EU() {
        String text = this.value + "J";
        return text;
    }
}