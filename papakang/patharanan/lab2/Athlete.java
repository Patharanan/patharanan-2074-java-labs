/**
 * This Athlete program is to accept three arguments: athlete name, the sport name
 *  that that athlete plays, and the nationality of that athlete.  Its output format is My
 *  favorite athlete is <athlete_name> who plays <sport_name> and has
 * nationality as <athlete_nationality>
 *
 * Author: Patharanan Papakang
 * ID: 643040207-4
 * Sec: 2
 * Date: December 24, 2021
 *
 **/
class Athlete {
    public static void main(String[] args) {
        System.out.print("Athlete ");
        System.out.print(args.length);
        if (args.length < 3) {
            //If the user does not enter all 3 argument
            System.out.println("Athlete <athlete name> <sport name> <athletenationality>");
        } else {
            System.out.println("My favorite athlete is " + args[0] + " who play " + args[1] + " and has nationality as  " + args[2]);
        }
    }
}
