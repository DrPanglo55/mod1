import java.text.DecimalFormat;
import java.util.Date;
import java.util.Random;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;


//I am not sure why decimal format import is unused. I thought I used it in the randomDouble method
// in line 30 with the "DecimalFormat df = new DecimalFormat("#.###");"
// the program now produces doubles with 3 decimal places as desired.
// can you help me understand why the import for java.text.DecimalFormat is unused



public class RandomData {
    int[] randomInt = new int[5];
    double[] randomDouble = new double[5];
    Random rand = new Random();
    Date currentDate = new Date();

    public RandomData() {
       randomInts();
       randomDoubles();
    }
    // generates random Integers to store in array
    public void randomInts() {
        for (int i = 0; i < 5; i++) {
            randomInt[i] = rand.nextInt(50) + 1;
        }
    }
    public void randomDoubles() {
        DecimalFormat df = new DecimalFormat("#.###");
        for (int i = 0; i < 5; i++) {
            randomDouble[i] = Double.parseDouble(df.format(rand.nextDouble()));
        }
    }
    public void writeToFile(String fileName) {
        try(DataOutputStream fileOut = new DataOutputStream(new FileOutputStream(fileName))) {
            fileOut.writeInt(randomInt.length);
            for (int i : randomInt) {
                fileOut.writeInt(i);
            }
            fileOut.writeInt(randomDouble.length);
            for (double d : randomDouble) {
                fileOut.writeDouble(d);
            }
            fileOut.writeLong(currentDate.getTime());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
