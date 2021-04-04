//Part a
class LogMessage{
  private String machineId;
  private String description;

  public LogMessage(String message){
    int index = this.message.indexOf(":");
    this.machineId = substring(0,index);
    this.description = substring(index + 1);
  }
  public string getMachineId(){
    return this.machineId;
  }
  public string getDescription(){
    return this.description;
  }
  //Part b
  public boolean containsWord(String keyword){
    String[] arr = this.description.split(" ");
    for(String word : arr){
      if(word.equals(keyword)){
        return true;
      }
    }
    return false;
  }
  //Part c
}
class LogMessage{
  private List<LogMessage> messageList;
  public List<LogMessage> removeMessages(String keyword){
    List<LogMessage> removedList = new List<LogMessage>();
    for (int i = messageList.size() - 1; i >= 0; i--) {
      if (messageList.get(i).containsWord(keyword)) {
        removedList.add(messageList.get(i));
        messageList.remove(i);
      }
    }
    return removedList;
  }
}
