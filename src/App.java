import combatvehicle.CombatVehicle;
import factory.Factory;

public class App {
    private Factory factory;
    private CombatVehicle combatVehicle;

    public App(Factory factory) {
        this.factory = factory;
    }

    public void createCV() {
        if (this.factory != null) {
            this.combatVehicle = this.factory.combatVehicle();
        }
    }

    public void useCV() {
        if (this.combatVehicle != null) {
            this.combatVehicle.drive();
            this.combatVehicle.shoot();
        }
    }
}
