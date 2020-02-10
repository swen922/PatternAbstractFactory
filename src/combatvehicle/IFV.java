package combatvehicle;

public class IFV implements CombatVehicle {

    @Override
    public void drive() {
        System.out.println("BZ-Z-Z-Z-ZZ! IFV!");
    }

    @Override
    public void shoot() {
        System.out.println("DYH-DYH-DYH-DYH! IFV!");

    }
}
