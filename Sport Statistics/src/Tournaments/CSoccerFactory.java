package Tournaments;

public class CSoccerFactory implements IFactory{
    private TournamentBase tournament;


    @Override
    public TournamentBase createFactory() {
        this.tournament = new CSoccerTournament();
        return this.tournament;
    }

}
