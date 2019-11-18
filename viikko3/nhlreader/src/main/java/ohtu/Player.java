
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private String team;
    private String goals;
    private String assists;
    private String nationality;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getGoals() {
        return goals;
    }


    public void setAssists (String assists) {
        this.assists = assists;
    }

    public String getAssists() {
        return assists;
    }

    public void setNationality (String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public int getScore() {
        return Integer.parseInt(getAssists()) + Integer.parseInt(getGoals());
    }

    


    @Override
    public String toString() {
        return name + "         " + team + "   " + goals + " + " + assists + " = " + getScore();
    }

    @Override
    public int compareTo(Player other) {
        if (this.getScore() == other.getScore()) {
            return 0;
        } else if (this.getScore() < other.getScore()) {
            return 1;
        } else {
            return -1;
        }
    }

      
}
