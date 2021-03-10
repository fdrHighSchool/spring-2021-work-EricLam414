public class GrayImage {
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int[][] pixelValues;

    public int countWhitePixels(){
      int count = 0;
      for (int i = 0; i < this.pixelValues.length; i++) {
        for (int j = 0; j < this.pixelValues[0].length; j++) {
          if (this.pixelValues[i][j] == WHITE){
            count++;
          }
        }
      }
      return count;
    }

    public void processImage() {
      for (int i = 0; i < this.pixelValues.length - 2; i++) {
        for (int j = 0; j < this.pixelValues[0].length - 2; j++) {
          this.pixelValues[i][j]  -= pixelValues[i+2][j+2];
          if (this.pixelValues[i][j] < BLACK){
            this.pixelValues[i][j] = BLACK;
          }
        }
      }
    }
}
