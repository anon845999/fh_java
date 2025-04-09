package Tournaments;

public class CMountainbikeFactory implements IFactory {
    private TournamentBase tournament;

    @Override
    public TournamentBase createFactory() {
        this.tournament = new CMountainbikeTournament();
        return tournament;
    }
}
