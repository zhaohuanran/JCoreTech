package CH5.objectAnalyzer;

import java.util.ArrayList;

/**
 * This program uses reflection to spy on objects.
 *
 * @author Nauh
 * @version 1.12 2019-06-25
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            squares.add(i * i);
            System.out.println(new objectAnalyzer().toString(squares));
        }
    }
}
