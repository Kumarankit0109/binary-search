public class lower_bound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int n= arr.length;
        int target = 40;
        int lb = n;
        int lo =0, hi = n-1;
        while(lo<=hi)
        {
            int mid = (lo+hi)/2;
            if (arr[mid] > target)
            {
                lb =Math.min(lb,mid);
                hi = mid- 1;
            }
            else {
                lo = mid + 1;
            }
        }
        System.out.println("Index of the lower bound element is " + lb);
    }
}
