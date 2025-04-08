package csvstrategy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class OpenCsvStrategy implements CsvFilesStrategy {

    @Override
    public void handle(String filepath) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;

            while((line = br.readLine()) != null){
               String [] splitter = line.split(",");

            }
        }
    }
}
