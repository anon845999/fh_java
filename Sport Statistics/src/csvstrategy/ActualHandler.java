package csvstrategy;

import java.io.IOException;

public class ActualHandler {

    private CsvFilesStrategy strategy;
    public ActualHandler(CsvFilesStrategy strategy) {
        this.strategy = strategy;
    }
    public void handle(String filepath)throws IOException {
        strategy.handle(filepath);
    }

    public void setStrategy(CsvFilesStrategy strategy) {
        this.strategy = strategy;
    }


}
