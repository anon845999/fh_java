package Tournaments;

import java.util.*;
abstract public class Tournament {

    protected String name;
    protected List<Participant> participants;
    protected List<Match> matches;
    protected Tournament status;




    public abstract void createTournament();
    public abstract void createPlayers();
    public abstract void declareWinner();
    public abstract Participant addParticipant(Participant participant);
    public abstract Participant removeParticipant(Participant participant);
    public abstract void startTournament();
    public abstract void recordResult(Match match,Result result);
    public abstract Participant getWinner();


}
