package Tournaments;

import java.nio.channels.FileLockInterruptionException;

public class CTournamentsFactoryHandler {

    private final CSoccerFactory soccerFactory;
    private final CChessFactory chessFactory;
    private final CMountainbikeFactory cMountainbikeFactory;

    public CTournamentsFactoryHandler() {
        this.soccerFactory = new CSoccerFactory();
        this.chessFactory = new CChessFactory();
        this.cMountainbikeFactory = new CMountainbikeFactory();

    }
    public TournamentBase getTournament(ETournamentname tournamentname) {
        switch(tournamentname){
            case MTB: return cMountainbikeFactory.createFactory();
            case SOCCER: return soccerFactory.createFactory();
            case CHESS: return chessFactory.createFactory();
            default: throw new IllegalArgumentException("Invalid tournament name: " + tournamentname);
        }

    }
}
