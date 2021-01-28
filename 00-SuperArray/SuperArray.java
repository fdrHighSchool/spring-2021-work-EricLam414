import java.util.*;

public class SuperArray{
  private int[] array;

  // constructor
  public SuperArray(int s){
    this.array = new int[s];
    System.out.println(this.array.length);
  }

  public SuperArray(){
    this.array = new int[10];
    System.out.println(this.array.length);
  }

  public void add(int val){
    for(int i = 0; i < this.array.length; i++){
      if (array[i] == 0){
        array[i] = val;
        return;
      }
    }
    grow(1);
    int lastNum = this.array.length-1;
    this.array[lastNum] = val;

  }
  public void add(int index, int val){
    grow(1);

    for(int i = this.array.length - 1; i > index; i--){
      this.array[i] = this.array[i-1];
    }
    this.array[index] = val;

  }

  public void grow(int n){
    int[] tempArray = new int[this.array.length];

    for(int i = 0; i < this.array.length; i++){
       tempArray[i] = this.array[i];
    }

    this.array = new int[n + this.array.length];

    for(int i = 0; i < tempArray.length; i++){
      this.array[i] = tempArray[i];
    }

  }
  //sets value at a specific index
  public void set(int i, int val){
    this.array[i] = val;
  }

  public boolean isEmpty(){
    for(int i = 0; i < this.array.length; i++){
      if (array[i] != 0){
        return false;
      }
    }
    return true;
  }

  public void remove(int index){
    int[] temp = new int[this.array.length - 1];

    for(int i = 0; i < temp.length; i++){
      if(i >= index){
        temp[i] = this.array[i + 1];
      }
      else{
        temp[i] = this.array[i];
      }
    }
    this.array = temp;
  }

  public String toString(){
    String str = "{";
    for (int i = 0; i < this.array.length; i++){
      if (i == this.array.length - 1){
        str += this.array[i];
      }
      else{
        str += this.array[i] + ", ";
      }
    }
    str += " }";
    return str;
  }
}
