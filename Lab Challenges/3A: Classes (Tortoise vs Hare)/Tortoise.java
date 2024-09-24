// implement the Tortoise class here
public class Tortoise extends Racer {    
    public Tortoise(String name) {
        super(name, 2.0, 3.0);

    }

    @Override
    public void run(double timeIntervalInSeconds) {
        double speed = Math.random() * (this.maxSpeedInMetersPerSecond = this.minSpeedInMetersPerSecond) 
                                     + minSpeedInMetersPerSecond;
        
        double distance = speed * timeIntervalInSeconds;

        this.distanceCoveredInMeters += distance;

        System.out.printf("%s walks %.2f meters; now at marker %.2f\n", this.name, distance, this.distanceCoveredInMeters);
    }
}
