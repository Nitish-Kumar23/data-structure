package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,17,23,34,76,90,100,323,547};
        System.out.println(getElementIndex(arr,90));
    }

    /**
     * order agnostic binary search
     * @param arr
     * @param targetElement
     * @return
     */
    public static int getElementIndex(int[] arr,int targetElement) {
        int startIndex=0;
        int endIndex=arr.length-1;
        if(arr[startIndex]<arr[endIndex]){
            return getElementIndexAscending(arr, targetElement, startIndex, endIndex);
        }else 
            return getElementIndexDescending(arr, targetElement, startIndex, endIndex);
    }

    private static int getElementIndexDescending(int[] arr, int targetElement, int startIndex, int endIndex) {
        while (startIndex <= endIndex){
            /*
             * int midIndex = (startIndex+endIndex)/2;
             * start+end might have large value which might not fit in integer range
             */
            int midIndex = startIndex +(endIndex - startIndex)/2;
            if(arr[midIndex]== targetElement)
                return midIndex;
            else if(arr[midIndex]< targetElement)
                endIndex =midIndex-1;
            else if(arr[midIndex]> targetElement)
                startIndex =midIndex+1;
        }
        return -1;
    }

    private static int getElementIndexAscending(int[] arr, int targetElement, int startIndex, int endIndex) {
        while (startIndex <= endIndex){
            /*
             * int midIndex = (startIndex+endIndex)/2;
             * start+end might have large value which might not fit in integer range 
             */
            int midIndex = startIndex +(endIndex - startIndex)/2;
            if(arr[midIndex]== targetElement)
                return midIndex;
            else if(arr[midIndex]< targetElement)
                startIndex =midIndex+1;
            else if(arr[midIndex]> targetElement)
                endIndex =midIndex-1;
        }
        return -1;
    }
}
