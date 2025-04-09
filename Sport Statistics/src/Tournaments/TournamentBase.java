package Tournaments;

import java.util.*;
abstract public class TournamentBase {

   protected final List<CParticipant> participants = new ArrayList<>();

   public void addParticipant(CParticipant participant){
       participants.add(participant);
   }

   public void removeParticipant(CParticipant participant){
       participants.remove(participant);
   }

   public List<CParticipant> getParticipants(){
       return participants;
   }

   @Override
   public String toString() {
       return this.getClass().getSimpleName() + " | Teilnehmer: " + participants;
   }





    public abstract void createPlayers();
    public abstract void declareWinner();


    public abstract void startTournament();
    public abstract void recordResult(CMatch CMatch, EResult EResult);
    public abstract CParticipant getWinner();


}
