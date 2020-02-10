package combatvehicle;

public class Tank implements CombatVehicle {

    @Override
    public void drive() {
        System.out.println("R-R-R-R-R-R-R! TANK!");
    }

    @Override
    public void shoot() {
        System.out.println("BABAHHHH!! TANK!");
    }
}
