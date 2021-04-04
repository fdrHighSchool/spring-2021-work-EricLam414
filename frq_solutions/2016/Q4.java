class StringFormatter{
  //Part A
  public static int totalLetters(List<String> wordList) {
    int count = 0;
    for (String word : wordList) {
      count += word.length();
    }
    return count;
  }
  //Part B
  public static int basicGapWidth(List<String> wordList, int formattedLen) {
    return (formattedLen - totalLetters(wordList)) / (wordList.size() - 1);
  }
  public static String format(List<String> wordList, int formattedLen) {
    int basicGapWidth = basicGapWidth(wordList, formattedLen);
    int leftoverSpaces = leftoverSpaces(wordList, formattedLen);
    String str = "";
    for(String word : wordList){
      str += word;
      for(int i = 0; i <= basicGapWidth; i++){
        str += " ";
      }
      if(leftoverSpaces > 0){
        str += " ";
        leftoverSpaces--;
      }
    }
    return str;
  }
}
