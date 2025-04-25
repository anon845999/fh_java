package csvstrategy;

import java.io.*;

public class CreateICsvStrategy implements ICsvFilesStrategy {

    @Override
    public void handle(String filepath) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))) {
            bw.write("ENCE,Vitality,9,16");
            bw.write("ENCE,Vitality,16,12");
            bw.write("ENCE,Vitality,9,16");
            bw.write("ENCE,Heroic,10,16");
            bw.write("SJ,ENCE,0,16");
            bw.write("SJ,ENCE,3,16");
            bw.write("FURIA,NRG,7,16");
            bw.write("FURIA,Prospects,16,1");
        }
    }
}
