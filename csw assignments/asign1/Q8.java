public class Q8 {
    public static void indexArray(int[] arr, int size){
        for( int i = 0; i< size; i++){
        int curr = i;
        int value = -1;
        /* swaps to move elements in proper position. */
        while (arr[curr] != -1 && arr[curr] != curr){
        int temp = arr[curr];
        arr[curr] = value;
        value = curr = temp;
        }
        /* check if some swaps happened.*/
        if (value != -1){
        arr[curr] = value;
        }
    }        
}
