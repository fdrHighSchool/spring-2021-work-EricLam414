public class Digits{
  private ArrayList<Integer> digitList;
  //Part A
  public Digits(int num){
    String s = String.valueOf(num);
    String[] arr = s.split("");
    for(int i = 0; i < arr.length; i++){
      this.digitList.add(Integer.parseInt(arr[i]));
    }
  }
  //Part B
  public boolean isStrictlyIncreasing(){
    for(int i = 1; i < this.digitList.size(); i++){
      if(this.digitList.get(i-1) >= this.digitList.get(i)){
        return false;
      }
    }
    return true;
  }
}
