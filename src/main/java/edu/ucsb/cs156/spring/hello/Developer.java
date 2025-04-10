package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        // TODO: Change this to your name
        // You may use just the name that is used on <https://bit.ly/cs156-s25-teams>
        // i.e. your first name, or your first and initial of last name

        return "Joel S.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        // TODO: Change this to your github id
        return "Jsanchez021";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        // TODO: Change this to your team name
        Team team = new Team("s25-09");
        team.addMember("Ruben");
        team.addMember("Moiez");
        team.addMember("Jason");
        team.addMember("Fred");
        team.addMember("Andrew");
        team.addMember("Joel");
        return team;
    }
}
