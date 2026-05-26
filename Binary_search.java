public class Binary_search {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};
        int n = arr.length;
        int target = 40;
        int lo=0, hi = n-1;
        boolean flag = false;
        while(lo<=hi)
        {
            int mid = (lo+hi) / 2;
            if (arr[mid] < target)
            {
                lo = mid +1;
            }
            else if (arr[mid] > target)
            {
                hi = mid - 1;
            }
            else if (arr[mid] == target)
            {
                flag = true;
                break;
            }
        }
        if (flag == true)
        {
            System.out.println("Target present");
        }
        else {
            System.out.println("Target not found");
        }
    }
}