class StepTracker{
  int steps;
  int days;
  int activeDays;
  int active;
  public StepTracker(double a){
    this.active = a;
    this.steps = 0;
    this.days = 0;
    this.activeDays = 0;
  }
  public int activeDays(){
    return (this.activeDays);
  }
  public double averageSteps(){
    if(days == 0){
      return 0;
    }
    else{
      return ((double)(days) / activeDays);
    }
  }
  public void addDailySteps(int s){
    this.steps += s;
    this.days++;
    if(s >= this.active){
      this.activeDays++;
    }
  }
}
