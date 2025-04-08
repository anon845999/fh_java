package csvstrategy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class COpenICsvStrategy implements ICsvFilesStrategy {

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
