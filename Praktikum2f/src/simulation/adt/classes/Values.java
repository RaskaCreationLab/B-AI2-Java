/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation.adt.classes;

import simulation.adt.interfaces.*;

public final class Values {
    static final double KILO = 1000.0;
    static final double MILLI = 0.001;
    static final double MIN_IN_SEC = 60.0;
    static final double MS_IN_KMH = 3.6;
    static final double KG_IN_G = 1000.0;
    static final double KG_IN_T = 0.001;
    
    private Values() {}
    
    //<editor-fold desc="specific calculations">
    public static Power dragConst(Power powerPropMax, Speed speedMax) {
        return power(powerPropMax.value() / Math.pow(speedMax.value(), 3.0)).abs();
    }
    public static Force forceDrag(Speed speedMax, Power dragConst) {
        //*math.signum(-speed) fehlt noch
        return force(dragConst.value() * Math.pow(speedMax.value(), 2.0));
    }
    //</editor-fold>
    
    // <editor-fold desc="Length">
    public static Length length(double value) {
        return lengthInM(value);
    }
    
    public static Length lengthInM(double value) {
        return LengthImpl.valueOf(value);
    }
    
    public static Length lengthInKM(double value) {
        return LengthImpl.valueOf(value * KILO);
    }
    //</editor-fold>
    // <editor-fold desc="TimeDiff">
    public static TimeDiff timeDiff(double value) {
        return timeDiffInSec(value);
    }
    
    public static TimeDiff timeDiffInSec(double value) {
        return TimeDiffImpl.valueOf(value);
    }
    
    public static TimeDiff timeDiffInMin(double value) {
        return TimeDiffImpl.valueOf(value * MIN_IN_SEC);
    }
    
    public static TimeDiff timeDiffInMilli(double value) {
        return TimeDiffImpl.valueOf(value * MILLI);
    }
    //</editor-fold>
    // <editor-fold desc="Mass">
    public static Mass mass(double value) {
        return massInKG(value);
    }
    
    public static Mass massInG(double value) {
        return MassImpl.valueOf(value * KG_IN_G);
    }
    
    public static Mass massInKG(double value) {
        return MassImpl.valueOf(value);
    }
    
    public static Mass massInT(double value) {
        return MassImpl.valueOf(value * KG_IN_T);
    }
    //</editor-fold>
    //<editor-fold desc="Speed, Length / Time">
    public static Speed speed(double value) {
        return speedInMS(value);
    }
    
    public static Speed speedInMS(double value) {
        return SpeedImpl.valueOf(value);
    }
    
    public static Speed speedInKMH(double value) {
        return SpeedImpl.valueOf(value / MS_IN_KMH);
    }
    //</editor-fold>
    //<editor-fold desc="Acceleration, Speed / Time">
    public static Acc acc(double value) {
        return accInMS2(value);
    }
    
    public static Acc accInMS2(double value) {
        return AccImpl.valueOf(value);
    }
    //</editor-fold>
    //<editor-fold desc="Force, Mass * Acc">
    public static Force force(double value) {
        return forceInN(value);
    }
    
    public static Force forceInN(double value) {
        return ForceImpl.valueOf(value);
    }
    
    public static Force forceInKN(double value) {
        return ForceImpl.valueOf(value * KILO);
    }
    //</editor-fold>
    //<editor-fold desc="Work, Force * Length">
    public static Work work(double value) {
        return workInJ(value);
    }
    
    public static Work workInJ(double value) {
        return WorkImpl.valueOf(value);
    }
    
    public static Work workInKJ(double value) {
        return WorkImpl.valueOf(value * KILO);
    }
    //</editor-fold>
    //<editor-fold desc="Power, Work / Time">
    public static Power power(double value) {
        return powerInW(value);
    }
    
    public static Power powerInW(double value) {
        return PowerImpl.valueOf(value);
    }
    
    public static Power powerInKW(double value) {
        return PowerImpl.valueOf(value * KILO);
    }
    //</editor-fold>
}