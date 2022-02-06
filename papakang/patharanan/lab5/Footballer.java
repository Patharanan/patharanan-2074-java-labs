/**
 * Footballer  is extending the PersonV2 class and adding a new method .
 * @Auther Patharanan Papakang
 * @version 1 05,Feb 2022
 * ID : 643040207-4
 * Sec : 2
 */

package papakang.patharanan.lab5;

public class Footballer extends PersonV2 {

  private String team;
  private String position;

  // The Footballer class has a constructor that takes in the same parameters as the PersonV2 class
  // constructor.

  public Footballer(
    String name,
    int height,
    int weight,
    String dob,
    String team,
    String position
  ) {
    super(name, height, weight, dob);
    this.team = team;
    this.position = position;
  }

  /**
   * Get the team name of the player
   *
   * @return The team name.
   */

  public String getTeam() {
    return team;
  }

  /**
   * It sets the team property of the player.
   *
   * @param team The name of the team that the player belongs to.
   */
  public void setTeam(String team) {
    this.team = team;
  }

  /**
   * Get the position of the current player
   *
   * @return The position of the person.
   */

  public String getPosition() {
    return position;
  }

  /**
   * The setPosotion function sets the position of the person
   *
   * @param position The position of the parameter.
   */
  public void setPosotion(String position) {
    this.position = position;
  }

  /**
   * The toString method is overridden to return a string containing the team and position
   *
   * @return The toString method is overridden to return a string that includes the team and position.
   */
  @Override
  public String toString() {
    String string =
      super.toString() +
      String.format(", Team = %s , Position = %s", team, position);
    return string;
  }
}
