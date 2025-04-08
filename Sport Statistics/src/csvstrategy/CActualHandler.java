package csvstrategy;

import java.io.IOException;

public class CActualHandler {

    private ICsvFilesStrategy strategy;
    public CActualHandler(ICsvFilesStrategy strategy) {
        this.strategy = strategy;
    }
    public void handle(String filepath)throws IOException {
        strategy.handle(filepath);
    }

    public void setStrategy(ICsvFilesStrategy strategy) {
        this.strategy = strategy;
    }


}
