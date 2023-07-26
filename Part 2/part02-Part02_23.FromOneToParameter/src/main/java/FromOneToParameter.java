

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(2);
    }

    public static void printUntilNumber(int num) {
        int i = 0;
        while(i<num) {
            i++;
            System.out.println(i);
        }
    }

}
