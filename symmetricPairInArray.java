import java.util.HashMap;
public class symmetricPairInArray {
  public static void main(String args[]) {
    
    int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};

    HashMap < Integer, Integer > mp = new HashMap < Integer, Integer > ();
    System.out.println("The Symmetric Pairs are: ");
    for (int i = 0; i < arr.length; i++) {
      int first = arr[i][0];
      int second = arr[i][1];
      if (mp.get(second) != null && mp.get(second) == first) {
        System.out.print("("+first + " " + second+") ");
      } else {
        mp.put(first, second);
      }
    }

  }
}
