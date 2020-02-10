package factory;

import combatvehicle.CombatVehicle;
import combatvehicle.IFV;

public class IFVFactory implements Factory {

    @Override
    public CombatVehicle combatVehicle() {
        return new IFV();
    }
}
