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
        return true;
      }
    }
    return false;
  }
  public void remove(int index){

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
