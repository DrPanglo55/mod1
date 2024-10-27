//Aaron Camp
// Module 1
public class Main {
    public static void main(String[] args) {
        //generates the random data and writes to file
        RandomData rd = new RandomData();
        rd.writeToFile("AaronCamp.dat");
        System.out.println("Data written to AaronCamp.dat");

        //read from saved file
        DataRead dr = new DataRead();
        dr.readFile("AaronCamp.dat");
    }
}