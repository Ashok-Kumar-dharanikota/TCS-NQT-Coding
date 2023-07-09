import java.util.*;
import java.util.stream.IntStream;
public class sumOfArray {
  public static void main(String args[]) {
    int n = 5;
    int arr[] = {1,2,3,4,5};
    
    //For Java: Instream sum() gives the sum of all the elements in the stream.
    int sum = IntStream.of(arr).sum();
    
    System.out.println("The sum of the elements of the array is "+sum);
  }
}
