public class Delimiters{
  public String openDel;
  public String closeDel;
  public Delimiters(String open, String close){
    this.openDel = open;
    this.closeDel = close;
  }
  public  ArrayList<String> getDelimitersList(String[] tokens){
    ArrayList<String> delimiters = new ArrayList<String>;
    for(int i = 0; i < tokens.size(); i++){
      if(tokens.get(i).equals(this.openDel) || tokens.get(i).equals(this.closeDel){
        delimiters.add(tokens.get(i));
      }
    }
    return delimiters;
  }
  public boolean isBalanced(ArrayList<String> delimiters){
    int openCount = 0;
    int closeCount = 0;
    for(int i = 0; i < delimiters.size(); i++){
      if(delimiters.get(i).equals(this.openDel)){
        openCount++;
      }
      else if(delimiters.get(i).equals(this.closeDel)){
        closeCount++;
      }
    }
    return (openCount == closeCount);
  }
}
