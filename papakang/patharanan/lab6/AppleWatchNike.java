package papakang.patharanan.lab6;

public class AppleWatchNike extends AppleWatch implements RunnerStatsCollecter {

  private double pace = 7; // Creating a private instance variable called pace and it to 7.
  private double distance = 7; // Creating a private instance variable called distance and it to 7
  private double time = 49; // Creating a private instance variable called time and it to 49
  private double agvHeartRate = 145; // Creating a private instance variable called avgHeartRate and it to 145
  private double maxHeartRate = 160; // Creating a private instance variable called maxHeartRate and it to 160
  private double sleepHours = 7; // Creating a private instance variable called sleepHours and it to 7

  // It is a constructor that takes 3 parameters and calls the constructor of the
  // superclass.
  public AppleWatchNike(String color, double price, String modelName) {
    super(color, price, modelName);
  }

  // A constructor that takes 6 parameters and calls the constructor of the superclass.
  public AppleWatchNike(
    String color,
    double price,
    String modelName,
    double pace,
    double distance,
    double time,
    double agvHeartRate,
    double maxHeartRate,
    double sleepHours
  ) {
    super(color, price, modelName);
    this.pace = pace;
    this.distance = distance;
    this.time = time;
    this.agvHeartRate = agvHeartRate;
    this.maxHeartRate = maxHeartRate;
    this.sleepHours = sleepHours;
  }

  /**
   * Display the running stats for the current run
   */
  public void displayRunningStats() {
    System.out.println(
      "Pace: " +
      pace +
      " min/km," +
      " distance: " +
      distance +
      "km., " +
      "time: " +
      time +
      " min"
    );
  }

  /**
   * Display the average heart rate and the maximum heart rate
   */
  public void displayHeartRates() {
    System.out.println(
      "Avg heart rate: " +
      agvHeartRate +
      " bpm," +
      " max heart rate: " +
      maxHeartRate +
      " bpm"
    );
  }

  /**
   * Display the sleep hours
   */
  public void displaySleepHours() {
    System.out.println("Sleep hours: " + sleepHours + " hours");
  }
}
