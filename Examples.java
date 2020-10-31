import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {    
  public Examples(){}    
  
  SkiingResult skiRes4 = new SkiingResult(4, 6.0, 5.9, 3.9, 12, 12);
  SkiingResult skiRes2 = new SkiingResult(2, 6.0, 5.9, 3.9, 12, 12);
  SkiingResult skiRes3 = new SkiingResult(3, 6.0, 5.9, 3.9, 12, 12);
  SkiingResult skiRes1 = new SkiingResult(1, 6.0, 5.9, 3.9, 12, 12);

  SkiingResult skiBetter = new SkiingResult(1, 1.2, 1, 1, 1.4, 8);

  ShootingResult shoRes = new ShootingResult(new ShootingRound(4), new ShootingRound(4),new ShootingRound(5),new ShootingRound(5));
  ShootingResult shoBetter = new ShootingResult(new ShootingRound(5), new ShootingRound(5),new ShootingRound(5),new ShootingRound(5));

  FinalResult finalRes1 = new FinalResult (shoRes, skiRes1);
  FinalResult finalRes2 = new FinalResult (shoRes, skiRes2);
  FinalResult finalRes3 = new FinalResult (shoRes, skiRes3);
  FinalResult finalRes4 = new FinalResult (shoRes, skiRes4);
  FinalResult finalBest = new FinalResult (shoBetter, skiBetter);

  Athlete okAthlete = new Athlete(finalRes2);
  Athlete bestAthlete = new Athlete(finalBest);

  @Test
  public void SKiingResultTimeCheck() {
    assertEquals(skiRes4.finishTime, 27.8, .01);
  }
  
  @Test
  public void SKiingResultPointsEarned() {
    assertEquals(skiRes4.pointsEarned(), 27.8, .01);
  }

  @Test
  public void SkiingResultGetPenalties() {
    assertEquals(skiRes4.getPenalties(), 60, .01);
  }

  @Test
  public void testShootingResultPointsEarned() {
    assertEquals(shoRes.pointsEarned(), 18, .01);
  }

  @Test
  public void testShootingResultGetPenalties() {
    assertEquals(shoRes.getPenalties(), 120, .01);
  }

  @Test
  public void testFinalScore1() {
    assertEquals(finalRes1.finalScore(), 197.8, .01);
  }

  @Test
  public void testFinalScore2() {
    assertEquals(finalRes2.finalScore(), 200.8, .01);
  }

  @Test
  public void testFinalScore3() {
    assertEquals(finalRes3.finalScore(), 204.8, .01);
  }

  @Test
  public void testFinalScore4() {
    assertEquals(finalRes4.finalScore(), 206.8, .01);
  }

  @Test
  public void testAthleteBetterSkiier() {
    assertTrue(bestAthlete.betterSkiier(okAthlete));
  }

  @Test
  public void testAthleteBetterShooter() {
    assertTrue(bestAthlete.betterShooter(okAthlete));
  }

  @Test
  public void testAthleteHasBeaten() {
    assertTrue(bestAthlete.hasBeaten(okAthlete));
  }
}