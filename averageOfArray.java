import java.util.*;
import java.util.stream.IntStream;

public class averageOfArray {
  public static void main(String args[]) {
    int n = 5;
    int arr[] = {1,2,3,4,5};
    //using double as average can be in decimal.
    double sum = 0;
    for (int i = 0; i < n; i++) {
      sum += (double) arr[i];
    }
    double average = sum / n;
    System.out.println("The average is "+average);

    // using IntStream 
    int Sum = IntStream.of(arr).sum();

    double Average = (double) Sum/n;

    System.out.print(Average);
    
  }
}
