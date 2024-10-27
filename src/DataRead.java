import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
public class DataRead {
    public void readFile(String fileName) {
        try (DataInputStream fileIn = new DataInputStream(new FileInputStream(fileName))) {
            int randomIntLength = fileIn.readInt();
            int[] randomInt = new int[randomIntLength];
            for (int i = 0; i < randomIntLength; i++) {
                randomInt[i] = fileIn.readInt();
            }
            int randomDoubleLength = fileIn.readInt();
            double[] randomDouble = new double[randomDoubleLength];
            for (int i = 0; i < randomDoubleLength; i++) {
                randomDouble[i] = fileIn.readDouble();
            }
            long datetime = fileIn.readLong();
            Date date = new Date(datetime);

            // print data to screen
            System.out.println("********************");
            System.out.println("Random Integers: ");

            for (int i : randomInt) {
                System.out.println(i);
            }
            System.out.println("********************");
            System.out.println("Random Doubles: ");
            for (double d : randomDouble) {
                System.out.println(d);
            }
            System.out.println("********************");
            System.out.println("\n Current Date: " + date);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main (String[]args){
    }
}
