//Reverse an Array

//public class ArrayPS2 {
//    static void ReverseArray(int[] arr){
//        int n = arr.length;
//        int i = 0;
//        int j = n-1;
//
//        while (i <= j){
//            //swap
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            // i ko aage badhao
//            i++;
//            // j ko pichhe lao
//            j--;
//        }
//        //now array has been reversed
//        for(int k : arr){
//            System.out.println(k);
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        ReverseArray(arr);
//    }
//}

// Shift array element by 1 position

//public class ArrayPS2 {
//     static void shiftby1(int []arr){
//         //store last position element ki value
//         int n = arr.length;
//         int temp = arr[n-1];
//         //shift all value of array
//         for (int i = n-1; i > 0; i--) {
//             arr[i] = arr[i-1];
//         }
//         //temp ki value ko 0 index pr copy
//         arr[0] = temp;
//     }
//    public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         shiftby1(arr);
//         for(int a : arr) {
//             System.out.println(a + " ");
//         }
//        System.out.println();
//    }
//}


//Find the mode of the array

//import java.util.HashMap;

//public class ArrayPS2 {
//    static int getMode(int[] arr){
//        HashMap<Integer , Integer> freq = new HashMap<>();
//
//        for(int num : arr){
//            freq.put(num, freq.getOrDefault(num,0)+1);
//        }

//commented here to
//        for(int i : freq.keySet()){
//            //i -> will represent key
//            System.out.println(i + " -> " + freq.get(i));
//        }
//   here

//        int maxfreq = -1;
//        int maxfreqWaliKey = -1;
//
//        for(int key : freq.keySet()){
//            int currentkey = key;
//            int currentkeykifrequency = freq.get(key);
//            if(currentkeykifrequency > maxfreq){
//                maxfreq = currentkeykifrequency;
//                maxfreqWaliKey = currentkey;
//            }
//        }
//        return maxfreqWaliKey;
//
//
//    }
//
//
//    public static void main(String[] args) {
//        int arr [] = {1,2,2,3,3,3,4,4,5,5,5,5,5};
//        int ans = getMode(arr);
//        System.out.println(ans);
//    }
//}



//IDENTIFY elements with highest and lowest frequency

//public class ArrayPS2 {
//
//    public static void main(String[] args) {
//
//    }
//}