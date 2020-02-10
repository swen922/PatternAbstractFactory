import factory.IFVFactory;
import factory.SPAIFactory;
import factory.TankFactory;

public class Run {

    public static void main(String[] args) {
        App app = new App(new IFVFactory());
        app.createCV();
        app.useCV();

        App app1 = new App(new TankFactory());
        app1.createCV();
        app1.useCV();

        App app2 = new App(new SPAIFactory());
        app2.createCV();
        app2.useCV();
    }
}
