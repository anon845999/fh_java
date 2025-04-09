package Tournaments;

public class CSoccerTournament extends TournamentBase {


    protected String tournametNameCurrent;

    public void setTournametNameCurrent(String tournametNameCurrent){
        this.tournametNameCurrent = tournametNameCurrent;
    }

    public String getTournametNameCurrent(){
        return this.tournametNameCurrent;
    }


    @Override
    public void createPlayers() {

    }

    @Override
    public void declareWinner() {

    }

    @Override
    public void startTournament() {

    }


    @Override
    public void recordResult(CMatch CMatch, EResult EResult) {

    }

    @Override
    public CParticipant getWinner() {
        return null;
    }
}
