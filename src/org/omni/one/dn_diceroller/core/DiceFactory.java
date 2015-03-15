package org.omni.one.dn_diceroller.core;

/**
 * Created by Adrarsis on 15/03/2015.
 */
public class DiceFactory {
    private static DiceFactory ourInstance = new DiceFactory();

    public static DiceFactory getInstance() {
        return ourInstance;
    }

    private DiceFactory() {
    }

    public static Die createDice(DefaultDiceTypes type) {
        switch (type) {
            case D20:
                return new Die(1, 20);
            case D12:
                return new Die(1, 12);
            case D10:
                return new Die(1, 10);
            case D8:
                return new Die(1, 8);
            case D6:
                return new Die(1, 6);
            case D4:
                return new Die(1, 4);
            case COIN:
                return new Die(1, 2);
            default:
                return new Die(1, 6);
        }
    }

    public static Die createDice(int min, int max) {
        return new Die(min, max);
    }
}
