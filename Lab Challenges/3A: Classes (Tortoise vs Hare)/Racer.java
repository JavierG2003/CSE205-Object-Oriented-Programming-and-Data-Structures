// implement the Racer class here
public abstract class Racer extends Object {
    // FIELDS ----------------------------------------------------
    protected String name = "";
    protected double distanceCoveredInMeters = 0.0;
    protected double minSpeedInMetersPerSecond = 0.0;
    protected double maxSpeedInMetersPerSecond = 0.0;

    public Racer(String name, double minSpeed, double maxSpeed) {
        this.name = name;
        this.minSpeedInMetersPerSecond = minSpeed;
        this.maxSpeedInMetersPerSecond = maxSpeed;

        this.distanceCoveredInMeters = 0.0;

    }

    // METHODS ----------------------------------------------------
    public double getDistanceCoveredInMeters() {
        return this.distanceCoveredInMeters;
    }

    public abstract void run(double timeIntervalInSeconds);

    @Override
    public String toString() {
        return String.format("Racer {name: %s}", this.name);
    }
}
