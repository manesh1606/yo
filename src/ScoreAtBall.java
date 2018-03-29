import static org.junit.Assert.*;

import org.junit.Test;

public class ScoreAtBall {

	CricketMatchInning matchInn1;
	Scores score;
	
	@Test
	public void test() {
		matchInn1 = new CricketMatchInning("IND","ENG",5);
		score = new Scores(matchInn1);
		score.addScore(1);
		score.addScore(2);
		assertEquals(2, score.getScoreInOverInBall(1, 2));
	}

}
