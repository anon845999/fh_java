package Tournaments;
import java.util.concurrent.atomic.AtomicInteger;


public class CParticipantIdGenerator {
    private static final CParticipantIdGenerator instance = new CParticipantIdGenerator();
    private final AtomicInteger currentId = new AtomicInteger(1);

    private CParticipantIdGenerator() {
    }

    public static CParticipantIdGenerator getInstance() {
        return instance;
    }


    public  int getNextId() {
        return currentId.getAndIncrement();
    }
}
