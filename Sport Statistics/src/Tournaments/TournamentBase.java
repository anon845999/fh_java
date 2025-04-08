package Tournaments;

import java.util.*;
abstract public class TournamentBase {

    protected String name;
    protected List<CParticipant> CParticipants;
    protected List<CMatch> CMatches;
    protected TournamentBase status;


    public abstract void createTournament();
    public abstract void createPlayers();
    public abstract void declareWinner();
    public abstract CParticipant addParticipant(CParticipant CParticipant);
    public abstract CParticipant removeParticipant(CParticipant CParticipant);
    public abstract void startTournament();
    public abstract void recordResult(CMatch CMatch, EResult EResult);
    public abstract CParticipant getWinner();


}
