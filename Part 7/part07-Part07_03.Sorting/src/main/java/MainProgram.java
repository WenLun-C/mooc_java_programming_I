
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        int res = array[0];
        for (int i : array) {
            if (i < res) 
                res = i;
        }
        return res;
    }

    public static int indexOfSmallest(int[] array) {
        int res = array[0];
        int index = 0;
        for (int i =0; i <array.length; i++) {
            if (array[i] < res) {
                res = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int start) {
        int res = array[start];
        int index = start;
        for (int i =start; i <array.length; i++) {
            if (array[i] < res) {
                res = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int smallest = indexOfSmallest(array);
        swap(array, smallest, 0);
        for (int i = 1; i<array.length-1; i++) {
            int smallest2 = indexOfSmallestFrom(array,i);
            swap(array, smallest2, i);
        }
    }

}
