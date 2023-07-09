public class Solution {

    public static int secondLargest(int[] a, int n) {

        if(n<2) {
            return -1;
        }
        int largest = a[0];
        int sLargest = Integer.MIN_VALUE;

        for(int i=1; i< n; i++) {
            if(a[i] > largest) {
                sLargest = largest;
                largest = a[i];
            }

            else if(a[i] > sLargest && a[i] < largest) {
                sLargest = a[i];
            }
        }

        return sLargest;
    }


    public static int secondSmallest(int[] a, int n) {
        
        if(n<2) {
            return -1;
        }

        int smallest = a[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=1; i<n; i++) {

            if(a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            }

            else if(a[i] < secondSmallest && a[i] != smallest){
                secondSmallest = a[i];
            }
        }

        return secondSmallest;
    }


    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int sLargest = secondLargest(a,n);
        int sSmallest = secondSmallest(a,n);

        return new int[] {sLargest,sSmallest};
    }
}
