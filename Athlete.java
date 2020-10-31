public class Athlete {
  FinalResult finalResult;

  public Athlete (FinalResult finalResult){
    this.finalResult = finalResult;
  }

  public boolean betterSkiier(Athlete otherAthlete) {
    return (this.finalResult.ski.finishTime < otherAthlete.finalResult.ski.finishTime);
    // if(this.finalResult.ski.finishTime < otherAthlete.finalResult.ski.finishTime) {
    //   return true
    // } else {
    //   return false
    // }
  }

  public boolean betterShooter(Athlete otherAthlete) {
    return (this.finalResult.shoot.pointsEarned() > otherAthlete.finalResult.shoot.pointsEarned());
    // if(this.finalResult.shoot.pointsEarned() > otherAthlete.finalResult.shoot.pointsEarned()) {
    //   return true
    // } else {
    //   return false
    // }
  }

  public boolean hasBeaten(Athlete otherAthlete) {
    return (betterSkiier(otherAthlete) || betterShooter(otherAthlete));
  }
}