class Demo020 {

    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_conceded;

    public Demo020() {
        name = "";
        wickets = 0;
        matches = 0;
        balls_bowled = 0;
        runs_conceded = 0;
    }

    public Demo020(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public void computeBowlingAverage() {
        if (wickets < 0 || runs_conceded < 0 || matches < 0 || balls_bowled < 0) {
            System.out.println("Error");
            return;
        }
        if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
            return;
        }
        if (wickets == 0) {
            System.out.println("Name: " + name);
            System.out.println("bowling_avg=Infinity");
        } else {
            double bowling_avg = (double) runs_conceded / wickets;
            System.out.println("Name: " + name);
            System.out.println("bowling_avg=" + bowling_avg);
        }
    }

    public void showStatistics() {
        if (wickets < 0 || runs_conceded < 0 || matches < 0 || balls_bowled < 0) {
            System.out.println("Error");
            return;
        }
        if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
            return;
        }
        System.out.println("Name=" + name);
        System.out.println("wickets=" + wickets);
        System.out.println("matches=" + matches);
        System.out.println("balls_bowled=" + balls_bowled);
        System.out.println("runs_conceded=" + runs_conceded);
    }

    public void computeStrikeRate() {
        if (wickets < 0 || runs_conceded < 0 || matches < 0 || balls_bowled < 0) {
            System.out.println("Error");
            return;
        }
        if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
            return;
        }
        if (balls_bowled == 0) {
            System.out.println("Name: " + name);
            System.out.println("Strike_rate=Infinity");
        } else {
            double strike_rate = (double) runs_conceded / balls_bowled;
            System.out.println("Name: " + name);
            System.out.println("Strike_rate=" + strike_rate);
        }
    }
}

public class Testing {
    public static void main(String[] args) {

        Demo020 bowler = new Demo020("MNREDDY", 24, 4, 825, 444);

        bowler.showStatistics();
        bowler.computeBowlingAverage();
        bowler.computeStrikeRate();
    }
}
