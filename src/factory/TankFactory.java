package factory;

import combatvehicle.CombatVehicle;
import combatvehicle.Tank;

public class TankFactory implements Factory {

    @Override
    public CombatVehicle combatVehicle() {
        return new Tank();
    }
}
