import static org.junit.Assert.*;

import org.junit.Test;

public class AddScoreTest {

	CricketMatchInning matchInn1;
	Scores score;
	
	@Test
	public void test() {
		matchInn1 = new CricketMatchInning("IND","ENG",5);
		score = new Scores(matchInn1);
		score.addScore(1);
		score.addScore(2);
		assertEquals(3, score.getCurrentScore());
	}

}
