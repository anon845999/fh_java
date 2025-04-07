package csvstrategy;
import java.io.IOException;
public interface CsvFilesStrategy {

    void handle(String filepath) throws IOException;

}
