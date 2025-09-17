import java.util.Random;

class TicketReservationSystem implements Runnable{
    private static int ticketNumber = 10;
    private int customer;

    public TicketReservationSystem(int customer){
        this.customer = customer;
    }
    public synchronized void reservation(){
        int book = new Random().nextInt(3) + 1;
        if(book <= ticketNumber ){
            ticketNumber -= book;
            System.out.println(" Customer " + customer + " reserved " + book + " ticket. ");
        }else {
            System.out.println(" Customer " + customer + " couldn't reserved " + book + " ticket. ");
            System.out.println(" Available ticket: " + ticketNumber);
        }
        if(ticketNumber == 0){
            System.out.println(" All tickets reserved ");
        }
    }
    @Override
    public void run() {
        reservation();
    }
    public static void main(String[] args) {
        TicketReservationSystem t = new TicketReservationSystem(0);
        while (ticketNumber > 0) {
            int customer = new Random().nextInt(10) + 1;
            t.customer = customer;
            Thread act = new Thread(t);
            act.start();
        }
    }
}