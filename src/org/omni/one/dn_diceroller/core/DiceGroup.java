package org.omni.one.dn_diceroller.core;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Adrarsis on 15/03/2015.
 */
public class DiceGroup implements Serializable {

    /**
     * Dice type --> number of dice
     */
    private Map<Die, Integer> contents;

    public DiceGroup() {
        contents = new TreeMap<Die, Integer>();
    }


}
