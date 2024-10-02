package inheritence.problem;

public class Squirtle extends GenOne {

    public Squirtle(double level, String type, String name) {
        super(name, type, level);
    }

    public boolean canEvolve() {
        boolean result;

        // Assume there is quite a bit of complex
        // Squirtle-specific code here that eventually
        // determines the value of result.

        return true; //result
    }

    public void waterGun() {
        System.out.println(name + " used water gun");
    }
}