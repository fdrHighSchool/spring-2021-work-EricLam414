import java.util.*;

//Part a
class RandomStringChooser {
  private ArrayList<String> arr;

  public RandomStringChooser(String[] array) {
    this.arr = Arrays.asList(array);
  }

  public String getNext() {
    if(this.arr.size() == 0) {
      return "NONE";
    }
    int randIndex = (int)(Math.random() * this.arr.size());
    String str = this.arr.get(randIndex);
    this.arr.remove(randIndex)
    return str;
  }
}
//part b
class RandomLetterChooser extends RandomStringChooser {
    public RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }
}
