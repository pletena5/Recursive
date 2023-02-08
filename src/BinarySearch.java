public class BinarySearch {

    public static boolean linear(int[] data , int target){

        for (int i = 0; i < data.length; i ++){

            if (data[i] == target){
                return true;
            }// if statement

        }// for loop

        return false;
    }// linear search method


    public static int recursive(int[]data , int target , int start , int end){
        int mid = (start + end) / 2;

        if (target == data[mid]){
            return mid + 1;
        }
        if (start == end){
            return -1;
        }
        else if (target > data[mid] ){
            return recursive(data , target , mid + 1, end);
        }
        else if (target < data[mid] ){
            return recursive( data , target , start , mid - 1);
        }

        return -1;
    }// recursive binary search method

    public static boolean iterative(int[] data , int target){
        int upper = data.length;
        int lower = 0;
        int mid = (upper - lower)/2;

        for (int i = 0; i < data.length; i++){

            if (target == data[mid]){
                return true;
            }// if found
            else if (target > data[mid]){
                lower = mid;
            }// target above
            else if (target < data[mid]){
                upper = mid;
            }// if target is lower

            mid = (upper - lower) / 2;
        }// for loop

        return false;
    }// iterative binary search

}// binary search class
