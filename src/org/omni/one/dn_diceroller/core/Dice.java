package org.omni.one.dn_diceroller.core;

import java.io.Serializable;

/**
 * Created by Adrarsis on 15/03/2015.
 */
public class Dice implements Serializable {
    private int min;
    private int max;

    public Dice(int min, int max) {
        this.min = min;
        this.max = max;
    }

    /**
     * Rolls the dice.
     * @return Random number between min & max.
     */
    public int roll() {
        return ((int) Math.random()) % (max - min) + min;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
