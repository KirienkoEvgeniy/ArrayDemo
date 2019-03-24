import org.app.array.ArrayCreation;
import org.app.dimensionalArrayCondition.DimensionalArrayCondition;
import org.app.factorial.Factorial;
import org.app.twoDimensionalArray.TwoDimensionalArray;

public class ArrayDemo {

    public static void main(String[] args) {

        System.out.println("Задание 1 --> ");
        ArrayCreation arrayCreation = new ArrayCreation();
        arrayCreation.RandArr();

        System.out.println("Задание 2 --> ");
        Factorial task2 = new Factorial();
        task2.Fact();
        System.out.println();

        System.out.println("Задание 3 --> ");
        TwoDimensionalArray task3 = new TwoDimensionalArray();
        task3.TwoDimensionalArray();
        System.out.println();

        System.out.println("Задание 4 --> ");
        DimensionalArrayCondition task4 = new DimensionalArrayCondition();
        task4.TwoDimensionalArrayCondition();

    }

}
