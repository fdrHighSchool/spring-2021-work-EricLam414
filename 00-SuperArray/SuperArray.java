import java.util.*;

public class SuperArray{
  private int[] array;

  // constructor
  public SuperArray(int s){
    this.array = new int[s];
  }//end SuperArray

  public SuperArray(){
    this.array = new int[10];
  }//end SuperArray

  /*
   * N: add
   * P: adds a value to an empty slot
   * I: value
   * R: an array with an empty slot filled
   */
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

  }//end add

  /*
   * N: add
   * P: adds a value at a specific spot
   * I: value and index
   * R: an array with an value added at a specific index
   */
  public void add(int index, int val){
    grow(1);

    for(int i = this.array.length - 1; i > index; i--){
      this.array[i] = this.array[i-1];
    }
    this.array[index] = val;

  }//end add

  /*
   * N: grow
   * P: makes the array larger by a certain length
   * I: length
   * R: an array growed by a certain amount
   */
  public void grow(int n){
    int[] tempArray = new int[this.array.length];

    for(int i = 0; i < this.array.length; i++){
       tempArray[i] = this.array[i];
    }

    this.array = new int[n + this.array.length];

    for(int i = 0; i < tempArray.length; i++){
      this.array[i] = tempArray[i];
    }

  }//end grow

  //sets value at a specific index
  public void set(int i, int val){
    this.array[i] = val;
  }//end set

  /*
   * N: isEmpty
   * P: checks to see if the array is empty
   * I: none
   * R: returns true/false
   */
  public boolean isEmpty(){
    for(int i = 0; i < this.array.length; i++){
      if (array[i] != 0){
        return false;
      }
    }
    return true;
  }//end isEmpty

  /*
   * N: remove
   * P: removes a value at an index
   * I: index
   * R: returns an array with a value at that index removed
   */
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
  }//end remove

  //get the length of the array
  public int getLength(){
    return this.array.length;
  }//end getLength

  public int getValue(int index){
    return this.array[index];
  }

  //toString method
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
  }//end toString
}
