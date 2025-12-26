package Assignment3;

public class Organizer extends ParticipantInfo {
    private int ticketsAvailable;

    public Organizer(String participantId, String name, String email, long phoneNumber, int ticketsAvailable){
        super(participantId,name,email,phoneNumber);
        this.ticketsAvailable = ticketsAvailable;
    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }

    public void setTicketsAvailable(int ticketsAvailable) {
        this.ticketsAvailable = ticketsAvailable;
    }

    public double calculateSellingRevenue(int ticketsToSell, double pricePerTicket){
        if(ticketsToSell > this.ticketsAvailable) return -1;
        double cost = ticketsToSell * pricePerTicket;
        return cost;
    }
}
