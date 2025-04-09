package Tournaments;

public class CChessFactory implements IFactory {

    private TournamentBase tournament;

    @Override
    public TournamentBase createFactory() {
         this.tournament = new CChessTournament();
         return this.tournament;
    }


}


