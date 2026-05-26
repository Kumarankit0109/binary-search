public class sort1 {
    public static void main(String[] args) {
        int [] arr = {1,23,3,41,88,45};
        int n = arr.length;
        boolean flag = true;  // true means sorted
        for (int i =0;i<n;i++)
        {
            if(arr[i] > arr[i+1])
            {
                flag = false;  //  false mean sun sorted
                break;
            }
        }
        if (flag == true)
        {
            System.out.println("sorted");
        }
        else {
            System.out.println("unsorted");
        }
    }
}
