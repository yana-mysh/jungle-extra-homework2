package de.mysh.junglesimulator.util;

import de.mysh.junglesimulator.entity.Elephant;

public class EventSimulator {

    public void startSimulation(Elephant elephant) {
        while(checkStatus(elephant)) {
            int eventNumber = (int) (Math.random() * 100);
            if(eventNumber >= 0 && eventNumber < 10) {
                sleepEvent(elephant);
            } else if (eventNumber >= 10 && eventNumber < 20) {
                swim(elephant);
            } else if (eventNumber >= 20 && eventNumber < 30) {
                eatAFruit(elephant);
            } else if (eventNumber >= 30 && eventNumber < 40) {
                eatGras(elephant);
            } else if (eventNumber >= 40 && eventNumber < 50) {
                eatRoots(elephant);
            } else if (eventNumber >= 50 && eventNumber < 60) {
                walk(elephant);
            } else if (eventNumber >= 60 && eventNumber < 70) {
                runnigAway(elephant);
            } else if (eventNumber >= 70 && eventNumber < 80) {
                attackPoacher(elephant);
            } else if (eventNumber >= 80 && eventNumber < 90) {
                play(elephant);
            } else if (eventNumber >= 90 && eventNumber < 100) {
                bath(elephant);
            }
            try {
                Thread.sleep(1500);
            } catch(InterruptedException e) {
                throw new RuntimeException();
            }
        }
        System.out.println("The elephant is dead.");
        }

    private void sleepEvent(Elephant elephant) {
        int energy = elephant.getEnergy();
        energy = energy + 25;
        if (energy > 100) {
            energy = 100;
        }
        elephant.setEnergy(energy);
        checkEnergy(elephant);
        System.out.println("The elephant got some sleep. He got + 25 energy. His current energy: " + elephant.getEnergy());
    }

    private void swim(Elephant elephant) {
        int energy = elephant.getEnergy();
        energy = energy - 5;
        if (energy < 0) {
            energy = 0;
        }
        elephant.setEnergy(energy);
        checkEnergy(elephant);
        System.out.println("The elephant was swimming in the river. He got - 5 energy. His current energy: " + elephant.getEnergy());
    }

    private void eatAFruit(Elephant elephant) {
        int energy = elephant.getEnergy();
        int health = elephant.getHealth();
        energy = energy - 5;
        if (energy < 0) {
            energy = 0;
        }
        health = health + elephant.getTeeth() * 5;
        if (health > 100) {
            health = 100;
        }
        elephant.setEnergy(energy);
        elephant.setHealth(health);
        checkEnergy(elephant);
        System.out.println("The elephant ate a fruit. He got -5 energy and +25 health. His current energy: " + elephant.getEnergy() + "; his current health: " + elephant.getHealth());
    }

    private void eatGras(Elephant elephant) {
        int energy = elephant.getEnergy();
        int health = elephant.getHealth();
        energy = energy - 5;
        if (energy < 0) {
            energy = 0;
        }
        health = health + elephant.getTeeth() * 2;
        if (health > 100) {
            health = 100;
        }
        elephant.setEnergy(energy);
        elephant.setHealth(health);
        checkEnergy(elephant);
        System.out.println("The elephant ate gras.He got -5 energy and + 10 health. His current energy: " + elephant.getEnergy() + "; his current health: " + elephant.getHealth());
    }

    private void eatRoots(Elephant elephant) {
        int energy = elephant.getEnergy();
        int health = elephant.getHealth();
        energy = energy - 5;
        if (energy < 0) {
            energy = 0;
        }
        health = health + elephant.getTeeth() * 3;
        if (health > 100) {
            health = 100;
        }
        elephant.setEnergy(energy);
        elephant.setHealth(health);
        checkEnergy(elephant);
        System.out.println("The elephant ate roots. He got -5 energy and + 15 health. His current energy: " + elephant.getEnergy() + "; his current health: " + elephant.getHealth());
    }

    private void walk(Elephant elephant) {
        int energy = elephant.getEnergy();
        energy = energy - 5;
        if (energy < 0) {
            energy = 0;
        }
        elephant.setEnergy(energy);
        checkEnergy(elephant);
        System.out.println("The elephant walked in the jungles. He got -5 energy. His current energy: " + elephant.getEnergy());
    }

    private void runnigAway(Elephant elephant) {
        int energy = elephant.getEnergy();
        energy = energy - 20;
        if (energy < 0) {
            energy = 0;
        }
        elephant.setEnergy(energy);
        checkEnergy(elephant);
        System.out.println("The elephant run away from a tiger. He got -20 energy. His current energy: " + elephant.getEnergy());
    }

    private void attackPoacher(Elephant elephant) {
        int health = elephant.getHealth();
        health = health - 20;
        if (health < 0) {
            health = 0;
        }
        elephant.setHealth(health);
        checkEnergy(elephant);
        System.out.println("A poacher attacked th elephant. The elephant got - 20 health. His current energy: " + elephant.getEnergy());
    }

    private void play(Elephant elephant) {
        int energy = elephant.getEnergy();
        int health = elephant.getHealth();
        energy = energy - 5;
        if (energy < 0) {
            energy = 0;
        }
        health = health + elephant.getTeeth() * 2;
        if (health > 100) {
            health = 100;
        }
        elephant.setEnergy(energy);
        elephant.setHealth(health);
        checkEnergy(elephant);
        System.out.println("The elephant played with his baby. He got -5 energy and + 10 health. His current energy: " + elephant.getEnergy() + "; his current health: " + elephant.getHealth());
    }
    private void bath(Elephant elephant) {
        int energy = elephant.getEnergy();
        int health = elephant.getHealth();
        energy = energy - 5;
        if (energy < 100) {
            energy = 0;
        }
        health = health + 5;
        if (health > 100) {
            health = 100;
        }
        elephant.setEnergy(energy);
        elephant.setHealth(health);
        checkEnergy(elephant);
        System.out.println("The elephant was bathing. He got -5 energy and + 5 health. His current energy: " + elephant.getEnergy() + "; his current health: " + elephant.getHealth());
    }

    private boolean checkStatus(Elephant elephant) {
        System.out.println("hp: " + elephant.getHealth() + " energy: " + elephant.getEnergy());
        if (elephant.getEnergy() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private void checkEnergy(Elephant elephant) {
        if (elephant.getEnergy() <= 0) {
            int health = elephant.getHealth();
            health = health - 5;
            if (health < 0) {
                health = 0;
            }
            elephant.setHealth(health);
        }
    }
}