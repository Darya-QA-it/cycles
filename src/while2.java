import javax.sound.sampled.LineListener;
import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input an integer value");


        }
        while (scanner.nextInt() != -1);

    }
}
