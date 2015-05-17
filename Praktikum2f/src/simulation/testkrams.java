/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import simulation.adt.Values;
import simulation.adt.interfaces.Mass;

public class testkrams {
    public static void main(String[] args) {
        Mass mass = Values.massInKG(-234);
        Mass newMass = mass.abs();
        System.out.print(newMass.toString());
    }
}
