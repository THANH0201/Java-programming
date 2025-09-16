import java.util.Random;

class TicketReservationSystem implements Runnable{
    private static int ticketNumber = 20;
    private int customer;

    public TicketReservationSystem(int customer){
        this.customer = customer;
    }
    public synchronized void reservation(){
        int book = new Random().nextInt(3) + 1;
        if(book <= ticketNumber ){
            ticketNumber -= book;
            System.out.println(" Customer " + customer + " reserved " + book + "ticket. ");
        }else {
            System.out.println(" Customer " + customer + " couldn't reserved " + book + "ticket. ");
        }
    }
    @Override
    public void run() {
        reservation();
    }
    public static void main(String[] args){
        while(ticketNumber>0){
            int customer = new Random().nextInt(10)+1;
            TicketReservationSystem t = new TicketReservationSystem(customer);
            Thread act = new Thread(t);
            act.start();
            try{
                act.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}