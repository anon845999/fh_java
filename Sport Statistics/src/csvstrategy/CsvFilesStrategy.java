package csvstrategy;
import java.io.File;
import java.io.IOException;
import java.util.List;

public interface CsvFilesStrategy {


    void handle(String filepath) throws IOException;

}
