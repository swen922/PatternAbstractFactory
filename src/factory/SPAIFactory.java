package factory;

import combatvehicle.CombatVehicle;
import combatvehicle.SPAI;

public class SPAIFactory implements Factory {

    @Override
    public CombatVehicle combatVehicle() {
        return new SPAI();
    }
}
