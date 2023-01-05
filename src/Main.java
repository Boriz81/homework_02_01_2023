import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 3;

        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();

        }
        int counter = 0;



        for (int j = 0; j < myArray.length; j++) {
            if  (myArray[j] > 0) {
                ++counter;
            }
        }

        for (int g = 0; g < counter; g++) {
            if (counter == 1) {
                System.out.println("true");
            } if (counter > 1) {
                System.out.println("false");
                break;
            }

        }

    }
}
