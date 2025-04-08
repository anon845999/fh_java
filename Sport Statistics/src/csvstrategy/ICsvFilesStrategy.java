package csvstrategy;
import java.io.IOException;

public interface ICsvFilesStrategy {


    void handle(String filepath) throws IOException;

}
