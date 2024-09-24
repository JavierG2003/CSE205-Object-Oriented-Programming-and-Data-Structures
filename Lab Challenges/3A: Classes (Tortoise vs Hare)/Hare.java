// implement the Hare class here
public class Hare extends Racer {
    // FIELDS ----------------------------------------------------------
    private double arrogance = 0.0;
    
    // METHODS ---------------------------------------------------------
    public Hare(String name, double arrogance) {
        super(name, 10, 15);

        this.arrogance = arrogance;
    }

    @Override
    public void run(double timeIntervalInSeconds) {
        double percentage = Math.random();

        if (percentage < this.arrogance) {
            System.out.printf("%s takes a nap\n", this.name);
        } else {
            double speed = Math.random() * (this.maxSpeedInMetersPerSecond - this.minSpeedInMetersPerSecond)
                            + this.minSpeedInMetersPerSecond;
            double distance = speed * timeIntervalInSeconds;

            this.distanceCoveredInMeters += distance;

            System.out.printf("%s hops %.2f meters; now at marker %.2f\n", this.name, distance, this.distanceCoveredInMeters);
        }
        
    }
}
