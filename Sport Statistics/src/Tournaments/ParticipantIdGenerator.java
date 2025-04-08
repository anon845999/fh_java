package Tournaments;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;


public class ParticipantIdGenerator {
    private static final  ParticipantIdGenerator instance = new ParticipantIdGenerator();
    private final AtomicInteger currentId = new AtomicInteger(1);

    private ParticipantIdGenerator() {
    }

    public static ParticipantIdGenerator getInstance() {
        return instance;
    }


    public  int getNextId() {
        return currentId.getAndIncrement();
    }
}
