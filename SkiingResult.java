public class SkiingResult implements IEvent {
  int finishOrder;
  double finishTime;
  int penalties;

  public SkiingResult(int finishOrder, double lap1, double lap2, double lap3, double lap4, int penalties) {
    this.finishOrder = finishOrder;
    this.finishTime = (lap1 + lap2 + lap3 + lap4);
    this.penalties = penalties;
  }

  public double pointsEarned() {
    return finishTime;
  }

  public double getPenalties() {
    return penalties * 5;
  }
}