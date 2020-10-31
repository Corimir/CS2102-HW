public class FinalResult {
  ShootingResult shoot;
  SkiingResult ski;
  double finalScore;
  
  public FinalResult (ShootingResult shoot, SkiingResult ski){
    this.shoot = shoot;
    this.ski = ski;
  }

  public double finalScore(){
    finalScore = (ski.finishTime + shoot.getPenalties()+ ski.getPenalties());

    if(ski.finishOrder == 1){
     finalScore -=10;
    }
    if(ski.finishOrder == 2){
     finalScore -=7;
    }
    if(ski.finishOrder == 3){
     finalScore -=3;
    }
    if(ski.finishOrder == 4){
     finalScore -=1;
    }
    return finalScore;
  }
}