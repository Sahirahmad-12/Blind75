//Find the average of array elements

//public class ArrayPS1 {
//     static double getAverage(int[] arr){
//         double sum = 0;
//         for(int i : arr){
//             sum += i;
//         }
//         int size = arr.length;
//         double avg = sum/size;
//         return avg;
//     }
//    public static void main(String[] args) {
//         int[] arr = {2,4,1,3};
//        System.out.println(getAverage(arr));
//    }
//}

//Multiply each element in an Array by 10

//public class ArrayPS1 {
//    static int [] multiplyby10(int [] arr){
//        int size = arr.length;
//        int NewArray[] = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            int element = arr[i];
//            int newElement = element*10;
//            NewArray[i] = newElement;
//        }
//        return NewArray;
//    }
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        int ans[] = multiplyby10(arr);
//        System.out.println("Printing ans array: ");
//        for (int i : ans){
//            System.out.println(i);
//        }
//    }
//}

//Search for an element in an array {Linear Search}

//public class ArrayPS1 {
//    static boolean findtarget(int arr[], int target){
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == target){
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        int arr[] = {1,3,4,5,7};
//        boolean ans = findtarget(arr,7 );
//        System.out.println(ans);
//    }
//}

//find the maximum element in the array

//public class ArrayPS1 {
//    static int getmax(int arr[]){
//        int maxi = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > maxi){
//                maxi = arr[i];
//            }
//        }
//        return maxi;
//    }
//    public static void main(String[] args) {
//        int arr[] = {1,3,4,5,6};
//        System.out.println(getmax(arr));
//    }
//}

//Return sum of +ve and -ve numbers

//public class ArrayPS1 {
//    static int[] getPosNegSum(int arr[]){
//        int posSum = 0;
//        int negSum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > 0){
//                posSum = posSum+arr[i];
//            }
//            else {
//                negSum = negSum+arr[i];
//            }
//        }
//        int ans[] = {posSum, negSum};
//        return ans;
//    }
//    public static void main(String[] args) {
//        int arr[] = {2,-3,-5,-7,9};
//        int ans[] = getPosNegSum(arr);
//        System.out.println("Positive sum = " + ans[0]);
//        System.out.println("Negative sum = " + ans[1]);
//    }
//}


//Count the number of Zeros and ones


//public class ArrayPS1 {
//    static int[] getZeroOneCount(int arr[]){
//        int zeroCount = 0;
//        int oneCount = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 0){
//                zeroCount++;
//            }
//            else {
//                oneCount++;
//            }
//        }
//        int ans[] = {zeroCount, oneCount};
//        return ans;
//    }
//    public static void main(String[] args) {
//        int arr[] = {1,0,1,1,0,1,1};
//        int ans[] = getZeroOneCount(arr);
//        System.out.println("Zero Count: " + ans[0]);
//        System.out.println("One Count: " + ans[1]);
//    }
//}

//find the first unsorted element in array

public class ArrayPS1 {
    static int getUnsortedElement(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i+1] <= arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,9};
        System.out.println(getUnsortedElement(arr));
    }
}