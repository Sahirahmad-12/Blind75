public class BInary_Search {
    public int binarysearch(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = start+(end-start)/2;

        while(start <= end){
            //compare target with mid value
            if(arr[mid] == target){
                //target found
                return mid;
            } else if (target > arr[mid]) {
                //goto right side
                start = mid+1;
            }
            else {
                //target < arr[mid]
                end = mid-1;
            }
            //update mid
            mid = start+(end-start)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
    }
}
