package combatvehicle;

public class SPAI implements CombatVehicle {

    @Override
    public void drive() {
        System.out.println("TR-TR-TR-TR-TR! SPAI");
    }

    @Override
    public void shoot() {
        System.out.println("TRAAA-BAA-BAAAHHHHHH!  SPAI");
    }
}
