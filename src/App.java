import java.sql.Time;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Parking Lot!");

        List<TwoWheelerParkingSlot> twSlots = new ArrayList<>();
        twSlots.add(new TwoWheelerParkingSlot(1));
        twSlots.add(new TwoWheelerParkingSlot(2));
        twSlots.add(new TwoWheelerParkingSlot(3));
        twSlots.add(new TwoWheelerParkingSlot(4));
        twSlots.add(new TwoWheelerParkingSlot(5));

        List<FourWheelerParkingSlot> fwSlots = new ArrayList<>();
        fwSlots.add(new FourWheelerParkingSlot(1));
        fwSlots.add(new FourWheelerParkingSlot(2, true));
        fwSlots.add(new FourWheelerParkingSlot(3));
        fwSlots.add(new FourWheelerParkingSlot(4, true));
        fwSlots.add(new FourWheelerParkingSlot(5));

        ParkingLotManager manager = new ParkingLotManager(twSlots, fwSlots);

        Vechile v1 = new Vechile(1, "DL4S6885", VechileType.TWO_WHEELER);
        Vechile v2 = new Vechile(2, "DL4S6889", VechileType.TWO_WHEELER);
        Vechile v3 = new Vechile(3, "DL4S6800", VechileType.TWO_WHEELER);
        Vechile v4 = new Vechile(4, "DL4S6877", VechileType.TWO_WHEELER);
        Vechile v5 = new Vechile(5, "DL4S6879", VechileType.TWO_WHEELER);
        Vechile v6 = new Vechile(6, "DL4S6670", VechileType.TWO_WHEELER);

        EntryGate entryGate = new EntryGate(1, "A1", manager);
        ExitGate exitGate = new ExitGate(1, "X2");

        Ticket t1 = entryGate.generateTicketIfAvailable(v1);
        printTicket(t1);
        Thread.sleep(2000);
        Ticket t2 = entryGate.generateTicketIfAvailable(v2);
        printTicket(t2);
        Thread.sleep(2000);
        Ticket t3 = entryGate.generateTicketIfAvailable(v3);
        printTicket(t3);
        Thread.sleep(2000);
        Ticket t4 = entryGate.generateTicketIfAvailable(v4);
        printTicket(t4);
        Thread.sleep(2000);
        Ticket t5 = entryGate.generateTicketIfAvailable(v5);
        printTicket(t5);
        Thread.sleep(2000);
        Ticket t6 = entryGate.generateTicketIfAvailable(v6);
        printTicket(t6);
        Thread.sleep(2000);

        System.out.println("Cost of ticket: " + t1.getId() + " Rs " + exitGate.CalculateCost(t1)); 

    }
    
    static void printTicket(Ticket t) {
        if (t == null) {
            System.out.println("Sorry! no space available.");
            return;
        }
        System.out.println("TicketID: " + t.getId() + " SlotID: " + t.getSlot().getId() +
        " EntryTime: " + LocalDateTime.ofInstant(Instant.ofEpochMilli(t.getEntryTime()),
        ZoneId.of("Asia/Kolkata")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +
         " VechileNumber: " + t.getVechile().getVechileNumber());
    }
}
