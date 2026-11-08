// Exp 8: Create an ARFF dataset file
import java.io.*;

public class Exp8_ARFF {
    public static void main(String[] args) throws Exception {
        FileWriter f = new FileWriter("data.arff");
        f.write("@RELATION DWDM\n");
        f.write("@ATTRIBUTE age NUMERIC\n");
        f.write("@ATTRIBUTE marks NUMERIC\n");
        f.write("@ATTRIBUTE class {Pass,Fail}\n");
        f.write("@DATA\n");
        f.write("20,80,Pass\n");
        f.write("21,35,Fail\n");
        f.write("19,75,Pass\n");
        f.close();
        System.out.println("ARFF file created");
    }
}
