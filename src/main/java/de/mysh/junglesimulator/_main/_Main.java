package de.mysh.junglesimulator._main;

import de.mysh.junglesimulator.entity.Elephant;
import de.mysh.junglesimulator.util.EventSimulator;

public class _Main {

    public static void main(String[] args) {

        Elephant elephant = new Elephant();
        EventSimulator eventSimulator = new EventSimulator();
        eventSimulator.startSimulation(elephant);
    }
}
