package Tournaments;

import java.util.ArrayList;
import java.util.List;

public class CTournamentManager {


    private final CTournamentsFactoryHandler factoryHandler;
    private final List<TournamentBase> activeTournaments;

    private CTournamentManager() {
        this.factoryHandler = new CTournamentsFactoryHandler();
        this.activeTournaments = new ArrayList<>();
    }

    private static class Holder {
        private static final CTournamentManager INSTANCE = new CTournamentManager();
    }

    public static CTournamentManager getInstance() {
        return Holder.INSTANCE;
    }

    public void startTournament (ETournamentname tournamentname){
        TournamentBase tournament = factoryHandler.getTournament(tournamentname);
        System.out.println("Starting tournament: " + tournamentname);
        activeTournaments.add(tournament);
    }
    public void endTournament (ETournamentname tournamentname){
        TournamentBase tournament = factoryHandler.getTournament(tournamentname);
        System.out.println("Ending tournament: " + tournamentname);
        activeTournaments.remove(tournament);
    }

    public List<TournamentBase> getActiveTournaments(){
        return activeTournaments;
    }
    public void addParticipantToTournament(TournamentBase tournament,CParticipant participant){
        tournament.addParticipant(participant);
        System.out.println("Participant added to tournament: " + getClass().getSimpleName() + " | Participant: " + participant);
    }

    public void removeParticipantFromTournament(TournamentBase tournament, CParticipant participant){
        tournament.removeParticipant(participant);
        System.out.println("Participant removed from tournament: " + getClass().getSimpleName() + " | Participant: " + participant);

    }

    public void showParticipantsInTournament(TournamentBase tournament){
        List<CParticipant> participants = tournament.getParticipants();
        System.out.println("Participants in Tournament: " + getClass().getSimpleName());
        for (CParticipant participant : participants) {
            System.out.println("Participant: " + participant);
        }
    }











}
