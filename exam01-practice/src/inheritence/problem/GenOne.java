package inheritence.problem;

public abstract class GenOne implements Pokemon {
    public String name;
    private String type;
    private double level;

    public GenOne(String name, String type, double level) {
        this.name = name;
        this.type = type;
        this.level = level;
    }

    public double getLevel() {
        return level;
    }

    public abstract boolean canEvolve();

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
