public class ShootingResult implements IEvent {
  ShootingRound round1;
  ShootingRound round2;
  ShootingRound round3;
  ShootingRound round4;
  double score;
  
  public ShootingResult(ShootingRound one, ShootingRound two, ShootingRound three, ShootingRound four){
    this.round1 = one;
    this.round2 = two;
    this.round3 = three;
    this.round4 = four;
    
  }

  public double pointsEarned () {
    this.score = round1.targetsHit + round2.targetsHit + round3.targetsHit + round4.targetsHit;
    return score;
  }

  public double getPenalties () {
    return 60*(20-this.pointsEarned());
  }
}