
public class Scores {

	private CricketMatchInning match;
	private int totalScore = 0;

	public Scores(CricketMatchInning m) {
		match = m;
	}

	public void addScore(int score) {
		if (score <= 6 && score >= 0)
			totalScore += match.addScore(score);
	}

	public int getCurrentScore() {
		return totalScore;
	}

	public int getScoreInOver(int over) {
		Over o = match.getOverAt(over);
		int s = 0;
		for (int i = 0; i < o.getCurrentBall(); i++) {
			s += o.getScoreAtBall(i);
		}
		return s;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void ShowScoreBoard() {
		Debuger.Log(" -- " + match.getTeam1() + " VS " + match.getTeam2() + " -- ");
		Debuger.Log("Batting : " + match.getTeam1());
		Debuger.Log("Current Score : " + totalScore);
		Debuger.Log("Current Over : " + (match.getCurrentOver() + 1));
		ShowScorePerOver();
		Debuger.Log("Current Over Ball : " + (match.getCurrentOverBall()));
		Debuger.Log("Total Score : " + totalScore);
	}

	public void ShowScorePerOver() {
		int s=0;
		for (int i = 0; i < match.getCurrentOver(); i++) {
			if(match.getOverAt(i).getCurrentBall() > 0){
				Debuger.Log("Over "+(i+1)+" : ");
				s=0;
				for (int j = 0; j < match.getOverAt(i).getCurrentBall(); j++) {
					s+=match.getOverAt(i).getScoreAtBall(j);
					Debuger.Log(" "+match.getOverAt(i).getScoreAtBall(j));
				}
				Debuger.Log(" = "+s);
			}
		}
	}
	
	public int getScoreInOverInBall(int over,int ball){
		over-=1;
		ball-=1;
		Debuger.Log(match.getOverAt(over).getScoreAtBall(ball)+"");
		return match.getOverAt(over).getScoreAtBall(ball);
	}

}
