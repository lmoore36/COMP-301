package inheritence.problem;

public class Charmander extends GenOne {

    public Charmander(String name, String type, double level) {
        super(name, type, level);
    }

    public boolean canEvolve() {
        boolean result;

        // Assume there is quite a bit of complex
        // Charmander-specific code here that eventually
        // determines the value of result.

        return true; //result
    }

    public void flamethrower() {
        System.out.println(name + " used flamethrower");
    }
}
