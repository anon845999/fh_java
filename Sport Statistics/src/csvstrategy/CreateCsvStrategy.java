package csvstrategy;

import java.io.*;

public class CreateCsvStrategy implements CsvFilesStrategy {


    @Override
    public void handle(String filepath) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))) {
            bw.write("");
            bw.write("");
            bw.write("");
            bw.write("");
            bw.write("");
        }
    }
}
